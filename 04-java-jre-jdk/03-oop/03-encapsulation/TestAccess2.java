
public class TestAccess2 {
	public static void main(String[] args) {
		Account acc = new Account();
		Client joe = new Client();
		
		joe.setName("Joe");
		joe.setId("123");
		joe.setPhone("456");
		
		acc.setOwner(joe);
		
		System.out.println(joe);
		System.out.println(acc.getOwner());
		Client client = acc.getOwner();
		System.out.println(client);
		
		System.out.println(joe.getName());
		System.out.println(acc.getOwner().getName());
	}
}
