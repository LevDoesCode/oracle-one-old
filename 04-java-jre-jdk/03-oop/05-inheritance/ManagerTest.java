
public class ManagerTest {
	public static void main(String[] args) {
		// Manager manager = new Manager();
		// manager.setSalary(5000);
		Manager manager = new Manager();
		manager.setSalary(6000);
		manager.setName("Bob");
		System.out.println(manager.getBonus());
		manager.setPassword("Alura");
		System.out.println(manager.login("Alma"));
		System.out.println(manager.login("Alura"));
	}
}
