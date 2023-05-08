
public class TestRef2 {
	public static void main(String[] args) {
		Account accJoe = new Account();
		System.out.println(accJoe.owner); // null
		Client joe = new Client();
		accJoe.owner = joe;
		System.out.println(accJoe.owner); // not null
		System.out.println(accJoe.owner.name); // null
		joe.name = "Joe";
		System.out.println(accJoe.owner.name); // not null
		System.out.println(accJoe.balance); // not null
		accJoe.owner.name = "Joe"; // Error not accessible if not instantiated
		
		// The client may be not null if the class definition has a default value
		AccountDefault bob = new AccountDefault();
		System.out.println(bob.owner); // not null
		System.out.println(bob.owner.name); // null
	}
}
