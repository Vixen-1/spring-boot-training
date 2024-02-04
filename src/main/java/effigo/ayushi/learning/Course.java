package effigo.ayushi.learning;

public class Course {
	private long id;
	private String name;
	private String auhtor;

	public Course(long id, String name, String auhtor) {
		super();
		this.id = id;
		this.name = name;
		this.auhtor = auhtor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuhtor() {
		return auhtor;
	}


	public void setAuhtor(String auhtor) {
		this.auhtor = auhtor;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", auhtor=" + auhtor + "]";
	}

}

