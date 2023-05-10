
public class EmployeeTest {
	public static void main(String[] args) {
		Employee joe = new Employee();
		joe.setName("Joe");
		joe.setId("112233");
		joe.setSalary(3000);

		System.out.println(joe.getSalary());
		System.out.println(joe.getBonus());
	}
}
