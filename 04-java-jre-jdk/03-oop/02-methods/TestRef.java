
public class TestRef {
	public static void main(String[] args) {
		Client joe = new Client();
		joe.name = "Joe";
		joe.id = "123456";
		joe.phone = "745869123";
		
		Account accJoe = new Account();
		accJoe.branch = 1;
		accJoe.owner = joe;
		
		System.out.println("Owner: " + accJoe.owner.name);
		System.out.println("ID: " + accJoe.owner.id);
		System.out.println("Ref: " + accJoe.owner);
		System.out.println("Ref: " + joe);
	}
}
