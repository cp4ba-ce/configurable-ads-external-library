package ads.samples.externalLibrary;

import java.util.Date;
import java.util.Objects;

import ilog.rules.bom.annotations.NotBusiness;

@NotBusiness
public class ManagedFieldsEntry {
	private String apiVersion;
	private String fieldsType;
	private Object fieldsV1;
	private String manager;
	private String operation;
	private String subresource;
	private Date time;

	@NotBusiness
	public String getApiVersion() {
		return apiVersion;
	}

	@NotBusiness
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	@NotBusiness
	public String getFieldsType() {
		return fieldsType;
	}

	@NotBusiness
	public void setFieldsType(String fieldsType) {
		this.fieldsType = fieldsType;
	}

	@NotBusiness
	public Object getFieldsV1() {
		return fieldsV1;
	}

	@NotBusiness
	public void setFieldsV1(Object fieldsV1) {
		this.fieldsV1 = fieldsV1;
	}

	@NotBusiness
	public String getManager() {
		return manager;
	}

	@NotBusiness
	public void setManager(String manager) {
		this.manager = manager;
	}

	@NotBusiness
	public String getOperation() {
		return operation;
	}

	@NotBusiness
	public void setOperation(String operation) {
		this.operation = operation;
	}

	@NotBusiness
	public String getSubresource() {
		return subresource;
	}

	@NotBusiness
	public void setSubresource(String subresource) {
		this.subresource = subresource;
	}

	@NotBusiness
	public Date getTime() {
		return time;
	}

	@NotBusiness
	public void setTime(Date time) {
		this.time = time;
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
		ManagedFieldsEntry managedFieldsEntry = (ManagedFieldsEntry) o;
		return Objects.equals(this.apiVersion, managedFieldsEntry.apiVersion)
				&& Objects.equals(this.fieldsType, managedFieldsEntry.fieldsType)
				&& Objects.equals(this.fieldsV1, managedFieldsEntry.fieldsV1)
				&& Objects.equals(this.manager, managedFieldsEntry.manager)
				&& Objects.equals(this.operation, managedFieldsEntry.operation)
				&& Objects.equals(this.subresource, managedFieldsEntry.subresource)
				&& Objects.equals(this.time, managedFieldsEntry.time);
	}

	@Override
	@NotBusiness
	public int hashCode() {
		return Objects.hash(apiVersion, fieldsType, fieldsV1, manager, operation, subresource, time);
	}

	@Override
	@NotBusiness
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class V1ManagedFieldsEntry {\n");
		sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
		sb.append("    fieldsType: ").append(toIndentedString(fieldsType)).append("\n");
		sb.append("    fieldsV1: ").append(toIndentedString(fieldsV1)).append("\n");
		sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
		sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
		sb.append("    subresource: ").append(toIndentedString(subresource)).append("\n");
		sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
