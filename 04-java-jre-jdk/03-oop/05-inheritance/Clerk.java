
public class Clerk {
	private String name;
	private String id;
	private double salary;
	private int type;

	public String getName() {
		return name;
	}

	public Clerk() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getBonus() {
		// type 0 = clerk
		// type 1 = Manager
		if (this.type == 0) {
			return this.salary * 0.10;
		} else if (this.type == 1) {
			return this.salary;
		} else {
			return 0;
		}
	}
}
