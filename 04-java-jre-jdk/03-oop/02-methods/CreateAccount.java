
public class CreateAccount {
	public static void main(String[] args) {
		Account acc1 = new Account(); // new class object (instance of class)
		acc1.balance = 10.00;
		System.out.println(acc1.balance);
		
		// acc1.country = "OOUU"; // Not valid because the class doesn't have that property
		Account acc2 = new Account();
		acc2.balance = 20.00;
		System.out.println(acc2.balance);
		
		Account acc3 = new Account();
		System.out.println(acc3.balance); // Java instantiates to the default value for each attribute type
		
		// These object instances are references to the object in memory
		// Let's test the reference
		Account acc4 = new Account();
		acc4.balance = 4.00;
		Account acc5 = acc4;
		System.out.println(acc4.balance);
		acc5.balance = 5.00;
		System.out.println(acc4.balance);
		System.out.println(acc5.balance);
		
		if (acc4 == acc5) {
			System.out.println("Same object!");
		}
	}
}
