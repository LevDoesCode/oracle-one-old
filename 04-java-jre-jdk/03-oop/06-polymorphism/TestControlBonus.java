
public class TestControlBonus {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setSalary(2000);

		Manager man1 = new Manager();
		man1.setSalary(400);

		// We can use different daughter classes when the function
		// registerSalary takes an Employee object
		ControlBonus controlB = new ControlBonus();
		controlB.registerSalary(emp1);
		controlB.registerSalary(man1);
		// In this case, the compiler uses the method of the same name
		// of the most specific class (daughter class)

		Accountant acc1 = new Accountant();
		acc1.setSalary(1500);

		controlB.registerSalary(acc1);
	}
}
