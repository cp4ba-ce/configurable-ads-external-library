package ads.samples.externalLibrary;

import java.util.Objects;

import ilog.rules.bom.annotations.NotBusiness;

@NotBusiness
public class OwnerReference {
	private String apiVersion;
	private Boolean blockOwnerDeletion;
	private Boolean controller;
	private String kind;
	private String name;
	private String uid;

	@NotBusiness
	public String getApiVersion() {
		return apiVersion;
	}

	@NotBusiness
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	@NotBusiness
	public Boolean getBlockOwnerDeletion() {
		return blockOwnerDeletion;
	}

	@NotBusiness
	public void setBlockOwnerDeletion(Boolean blockOwnerDeletion) {
		this.blockOwnerDeletion = blockOwnerDeletion;
	}

	@NotBusiness
	public Boolean getController() {
		return controller;
	}

	@NotBusiness
	public void setController(Boolean controller) {
		this.controller = controller;
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
	public String getName() {
		return name;
	}

	@NotBusiness
	public void setName(String name) {
		this.name = name;
	}

	@NotBusiness
	public String getUid() {
		return uid;
	}

	@NotBusiness
	public void setUid(String uid) {
		this.uid = uid;
	}

	@NotBusiness
	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OwnerReference ownerReference = (OwnerReference) o;
		return Objects.equals(this.apiVersion, ownerReference.apiVersion)
				&& Objects.equals(this.blockOwnerDeletion, ownerReference.blockOwnerDeletion)
				&& Objects.equals(this.controller, ownerReference.controller)
				&& Objects.equals(this.kind, ownerReference.kind) && Objects.equals(this.name, ownerReference.name)
				&& Objects.equals(this.uid, ownerReference.uid);
	}

	@NotBusiness
	@Override
	public int hashCode() {
		return Objects.hash(apiVersion, blockOwnerDeletion, controller, kind, name, uid);
	}

	@NotBusiness
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class V1OwnerReference {\n");
		sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
		sb.append("    blockOwnerDeletion: ").append(toIndentedString(blockOwnerDeletion)).append("\n");
		sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
		sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
