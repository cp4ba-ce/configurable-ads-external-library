/*
 * Licensed Materials - Property of IBM
 * 5737-I23
 * Copyright IBM Corp. 2018 - 2020. All Rights Reserved.
 * U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp.
 */
package ads.samples.externalLibrary;

import java.io.IOException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collections;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import com.google.gson.Gson;
import com.ibm.rules.engine.annotations.PureFunction;

import ilog.rules.bom.annotations.NotBusiness;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class PetStore {
	private static String PET_STORE_URL = "https://petstore.swagger.io/v2/pet/findByStatus?status=sold";
	private static String CM_BASE_URL = "https://api.<cluster-url>";
	private static String CM_BEARER_TOKEN = "Bearer sha256~<token>";
	private static String CM_NAMESPACE = "cp4ba-starter";
	private static String CM_NAME = "cmtest";
	private static String CM_PETFINDER_URL_KEY = "petfinder.url";

	@NotBusiness
	public PetStore() {
	}

	@PureFunction
	public static int countPets() throws IOException {
		return countPetsUrl(PET_STORE_URL);
	}

	private static int countPetsUrl(String url) throws IOException {
		String result = clientCallSsl(url, null);
		Pet[] pets = new Gson().fromJson(result, Pet[].class);
		return pets.length;
	}

	private static String clientCallSsl(String url, String auth) throws IOException {
		String rvalue = null;

		System.setProperty("com.ibm.jsse2.overrideDefaultTLS", "true");
		ConnectionSpec spec = new ConnectionSpec.Builder(ConnectionSpec.COMPATIBLE_TLS).build();
		OkHttpClient.Builder httpBuilder = new OkHttpClient.Builder().connectionSpecs(Collections.singletonList(spec));
		OkHttpClient client = httpBuilder.sslSocketFactory(createSSLSocketFactory(), new TrustAllCerts())
				.hostnameVerifier(new TrustAllHostnameVerifier()).build();

		Request request = null;
		if (auth != null)
			request = new Request.Builder().url(url).method("GET", null).addHeader("Authorization", auth).build();
		else
			request = new Request.Builder().url(url).method("GET", null).build();

		Response response = client.newCall(request).execute();
		if (response != null) {
			if (response.body() != null)
				rvalue = response.body().string();
			response.close();
		}
		return rvalue;
	}

	private static String readUrlFromCMSsl() throws IOException {
		String url = String.format("%s/api/v1/namespaces/%s/configmaps/%s", CM_BASE_URL, CM_NAMESPACE, CM_NAME);
		System.out.println(url);
		String result = clientCallSsl(url, CM_BEARER_TOKEN);
		System.out.println(result);
		ConfigMap cm = new Gson().fromJson(result, ConfigMap.class);
		String petFinderUrl = cm.getData().get(CM_PETFINDER_URL_KEY);
		System.out.println(petFinderUrl);
		return petFinderUrl;
	}

	@PureFunction
	public static int countPetsCMSsl() throws IOException {
		String url = readUrlFromCMSsl();
		return countPetsUrl(url);
	}

	private static class TrustAllCerts implements X509TrustManager {
		public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
		}

		public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
		}

		public X509Certificate[] getAcceptedIssuers() {
			return new X509Certificate[0];
		}
	}

	private static class TrustAllHostnameVerifier implements HostnameVerifier {
		public boolean verify(String hostname, SSLSession session) {
			return true;
		}
	}

	private static SSLSocketFactory createSSLSocketFactory() {
		SSLSocketFactory ssfFactory = null;
		try {
			SSLContext sc = SSLContext.getInstance("TLS");
			sc.init(null, new TrustManager[] { new TrustAllCerts() }, new SecureRandom());
			ssfFactory = sc.getSocketFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ssfFactory;
	}

	@NotBusiness
	public static void main(String[] args) {
		try {
			System.out.println("Find Pets in countPets: " + countPets());
			System.out.println("Find Pets in countPetsCMSsl: " + countPetsCMSsl());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
