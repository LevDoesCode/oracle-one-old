
public class ControlBonus {
	private double total;

	public double registerSalary(Employee employee) {
		this.total = employee.getBonus() + this.total;
		System.out.println(this.total);
		return this.total;
	}
}
