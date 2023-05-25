package ads.samples.externalLibrary;

import java.util.Map;
import java.util.Objects;

import ilog.rules.bom.annotations.NotBusiness;

@NotBusiness
public class ConfigMap {
	private String apiVersion;
	private Map<String, byte[]> binaryData = null;
	private Map<String, String> data = null;
	private Boolean immutable;
	private String kind;
	private ObjectMeta metadata;

	@NotBusiness
	public String getApiVersion() {
		return apiVersion;
	}

	@NotBusiness
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	@NotBusiness
	public Map<String, byte[]> getBinaryData() {
		return binaryData;
	}

	@NotBusiness
	public void setBinaryData(Map<String, byte[]> binaryData) {
		this.binaryData = binaryData;
	}

	@NotBusiness
	public Map<String, String> getData() {
		return data;
	}

	@NotBusiness
	public void setData(Map<String, String> data) {
		this.data = data;
	}

	@NotBusiness
	public Boolean getImmutable() {
		return immutable;
	}

	@NotBusiness
	public void setImmutable(Boolean immutable) {
		this.immutable = immutable;
	}

	@NotBusiness
	public String getKind() {
		return kind;
	}

	@NotBusiness
	public void setKind(String kind) {
		this.kind = kind;
	}

	@NotBusiness
	public ObjectMeta getMetadata() {
		return metadata;
	}

	@NotBusiness
	public void setMetadata(ObjectMeta metadata) {
		this.metadata = metadata;
	}

	@Override
	@NotBusiness
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConfigMap configMap = (ConfigMap) o;
		return Objects.equals(this.apiVersion, configMap.apiVersion)
				&& Objects.equals(this.binaryData, configMap.binaryData) && Objects.equals(this.data, configMap.data)
				&& Objects.equals(this.immutable, configMap.immutable) && Objects.equals(this.kind, configMap.kind)
				&& Objects.equals(this.metadata, configMap.metadata);
	}

	@Override
	@NotBusiness
	public int hashCode() {
		return Objects.hash(apiVersion, binaryData, data, immutable, kind, metadata);
	}

	@Override
	@NotBusiness
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class V1ConfigMap {\n");
		sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
		sb.append("    binaryData: ").append(toIndentedString(binaryData)).append("\n");
		sb.append("    data: ").append(toIndentedString(data)).append("\n");
		sb.append("    immutable: ").append(toIndentedString(immutable)).append("\n");
		sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
		sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
