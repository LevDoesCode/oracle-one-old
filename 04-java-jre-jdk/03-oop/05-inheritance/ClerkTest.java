
public class ClerkTest {
	public static void main(String[] args) {
		Clerk joe = new Clerk();
		joe.setName("Joe");
		joe.setId("112233");
		joe.setSalary(3000);

		System.out.println(joe.getSalary());
		System.out.println(joe.getBonus());
	}
}
