package collections;

public class Subject {
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

	public int getLenght() {
		return length;
	}

	public void setLenght(int length) {
		this.length = length;
	}

	@Override // optional
	public String toString() {
		return this.name;
	}

}
