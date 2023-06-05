package collections;

public class Student {
	private String name;
	private String id;

	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		return this.name.equals(student.getName());
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
}
