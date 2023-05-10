
public class Employee {
	private String name;
	private String id;
	private double salary;
	private int type;

	public String getName() {
		return name;
	}

	public Employee() {

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
		return this.salary * 0.10;
	}
}
