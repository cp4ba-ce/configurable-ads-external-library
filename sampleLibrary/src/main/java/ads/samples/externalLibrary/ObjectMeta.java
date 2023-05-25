package ads.samples.externalLibrary;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import ilog.rules.bom.annotations.NotBusiness;

@NotBusiness
public class ObjectMeta {
	private Map<String, String> annotations = null;
	private Date creationTimestamp;
	private Long deletionGracePeriodSeconds;
	private Date deletionTimestamp;
	private List<String> finalizers = null;
	private String generateName;
	private Long generation;
	private Map<String, String> labels = null;
	private List<ManagedFieldsEntry> managedFields = null;
	private String name;
	private String namespace;
	private List<OwnerReference> ownerReferences = null;
	private String resourceVersion;
	private String selfLink;
	private String uid;

	@NotBusiness
	public Map<String, String> getAnnotations() {
		return annotations;
	}

	@NotBusiness
	public void setAnnotations(Map<String, String> annotations) {
		this.annotations = annotations;
	}

	@NotBusiness
	public Date getCreationTimestamp() {
		return creationTimestamp;
	}

	@NotBusiness
	public void setCreationTimestamp(Date creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	@NotBusiness
	public Long getDeletionGracePeriodSeconds() {
		return deletionGracePeriodSeconds;
	}

	@NotBusiness
	public void setDeletionGracePeriodSeconds(Long deletionGracePeriodSeconds) {
		this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
	}

	@NotBusiness
	public Date getDeletionTimestamp() {
		return deletionTimestamp;
	}

	@NotBusiness
	public void setDeletionTimestamp(Date deletionTimestamp) {
		this.deletionTimestamp = deletionTimestamp;
	}

	@NotBusiness
	public List<String> getFinalizers() {
		return finalizers;
	}

	@NotBusiness
	public void setFinalizers(List<String> finalizers) {
		this.finalizers = finalizers;
	}

	@NotBusiness
	public String getGenerateName() {
		return generateName;
	}

	@NotBusiness
	public void setGenerateName(String generateName) {
		this.generateName = generateName;
	}

	@NotBusiness
	public Long getGeneration() {
		return generation;
	}

	@NotBusiness
	public void setGeneration(Long generation) {
		this.generation = generation;
	}

	@NotBusiness
	public Map<String, String> getLabels() {
		return labels;
	}

	@NotBusiness
	public void setLabels(Map<String, String> labels) {
		this.labels = labels;
	}

	@NotBusiness
	public List<ManagedFieldsEntry> getManagedFields() {
		return managedFields;
	}

	@NotBusiness
	public void setManagedFields(List<ManagedFieldsEntry> managedFields) {
		this.managedFields = managedFields;
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
	public String getNamespace() {
		return namespace;
	}

	@NotBusiness
	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	@NotBusiness
	public List<OwnerReference> getOwnerReferences() {
		return ownerReferences;
	}

	@NotBusiness
	public void setOwnerReferences(List<OwnerReference> ownerReferences) {
		this.ownerReferences = ownerReferences;
	}

	@NotBusiness
	public String getResourceVersion() {
		return resourceVersion;
	}

	@NotBusiness
	public void setResourceVersion(String resourceVersion) {
		this.resourceVersion = resourceVersion;
	}

	@NotBusiness
	public String getSelfLink() {
		return selfLink;
	}

	@NotBusiness
	public void setSelfLink(String selfLink) {
		this.selfLink = selfLink;
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
		ObjectMeta objectMeta = (ObjectMeta) o;
		return Objects.equals(this.annotations, objectMeta.annotations)
				&& Objects.equals(this.creationTimestamp, objectMeta.creationTimestamp)
				&& Objects.equals(this.deletionGracePeriodSeconds, objectMeta.deletionGracePeriodSeconds)
				&& Objects.equals(this.deletionTimestamp, objectMeta.deletionTimestamp)
				&& Objects.equals(this.finalizers, objectMeta.finalizers)
				&& Objects.equals(this.generateName, objectMeta.generateName)
				&& Objects.equals(this.generation, objectMeta.generation)
				&& Objects.equals(this.labels, objectMeta.labels)
				&& Objects.equals(this.managedFields, objectMeta.managedFields)
				&& Objects.equals(this.name, objectMeta.name) && Objects.equals(this.namespace, objectMeta.namespace)
				&& Objects.equals(this.ownerReferences, objectMeta.ownerReferences)
				&& Objects.equals(this.resourceVersion, objectMeta.resourceVersion)
				&& Objects.equals(this.selfLink, objectMeta.selfLink) && Objects.equals(this.uid, objectMeta.uid);
	}

	@NotBusiness
	@Override
	public int hashCode() {
		return Objects.hash(annotations, creationTimestamp, deletionGracePeriodSeconds, deletionTimestamp, finalizers,
				generateName, generation, labels, managedFields, name, namespace, ownerReferences, resourceVersion,
				selfLink, uid);
	}

	@NotBusiness
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class V1ObjectMeta {\n");
		sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    deletionGracePeriodSeconds: ").append(toIndentedString(deletionGracePeriodSeconds)).append("\n");
		sb.append("    deletionTimestamp: ").append(toIndentedString(deletionTimestamp)).append("\n");
		sb.append("    finalizers: ").append(toIndentedString(finalizers)).append("\n");
		sb.append("    generateName: ").append(toIndentedString(generateName)).append("\n");
		sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
		sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
		sb.append("    managedFields: ").append(toIndentedString(managedFields)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
		sb.append("    ownerReferences: ").append(toIndentedString(ownerReferences)).append("\n");
		sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
		sb.append("    selfLink: ").append(toIndentedString(selfLink)).append("\n");
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
