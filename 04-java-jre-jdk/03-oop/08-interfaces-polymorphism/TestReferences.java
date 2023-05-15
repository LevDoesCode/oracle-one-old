
public class TestReferences {
	public static void main(String[] args) {

		Employee employee = new Accountant();
		employee.setName("Joe");

		Manager manager = new Manager();
		manager.setName("Bob");

		employee.setSalary(1000);
		manager.setSalary(2000);

		// The most generic entity can be adapted to a more specific one
		// <--are-- All Managers are Employee
		Employee employee2 = new Manager();
		employee2.setName("John");

		// But this won't compile
		// Manager manager2 = new Employee();

		// However, we can't access methods and properties implemented by the more
		// specific class
		// e.g.
		// employee2.login();
	}
}
