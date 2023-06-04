package collections;

public class Subject implements Comparable<Subject> {
	private String name;
	private int length;

	public Subject(String name, int length) {
		super();
		this.name = name;
		this.length = length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLenght(int length) {
		this.length = length;
	}

	@Override // optional
	public String toString() {
		return this.name;
	}

	@Override
	public int compareTo(Subject o) {
		return this.name.compareTo(o.getName());
	}

}
