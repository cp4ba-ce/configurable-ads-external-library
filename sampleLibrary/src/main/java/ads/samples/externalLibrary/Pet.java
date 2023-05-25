package ads.samples.externalLibrary;

import java.util.ArrayList;

import ilog.rules.bom.annotations.NotBusiness;

@NotBusiness
public class Pet {
	private long id;
	private Category category;
	private String name;
	private ArrayList<String> photoUrls;
	private ArrayList<Tag> tags;
	private String status;

	@NotBusiness
	public long getId() {
		return id;
	}

	@NotBusiness
	public void setId(long id) {
		this.id = id;
	}

	@NotBusiness
	public Category getCategory() {
		return category;
	}

	@NotBusiness
	public void setCategory(Category category) {
		this.category = category;
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
	public ArrayList<String> getPhotoUrls() {
		return photoUrls;
	}

	@NotBusiness
	public void setPhotoUrls(ArrayList<String> photoUrls) {
		this.photoUrls = photoUrls;
	}

	@NotBusiness
	public ArrayList<Tag> getTags() {
		return tags;
	}

	@NotBusiness
	public void setTags(ArrayList<Tag> tags) {
		this.tags = tags;
	}

	@NotBusiness
	public String getStatus() {
		return status;
	}

	@NotBusiness
	public void setStatus(String status) {
		this.status = status;
	}

	@NotBusiness
	public static class Category {
		public Category() {
		}

		public int id;
		public String name;
	}

	@NotBusiness
	public static class Tag {
		public Tag() {
		}

		public int id;
		public String name;
	}
}
