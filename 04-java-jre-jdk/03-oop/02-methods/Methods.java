
public class Methods {
	public static void main(String[] args) {
		Account accountLev = new Account();
		accountLev.balance = 111.11;
		accountLev.deposit(777.77);
		System.out.println(accountLev.balance);
		accountLev.withdraw(200);
		System.out.println(accountLev.balance);
		
		Account accountKate = new Account();
		accountKate.deposit(1000);
		System.out.println("Balance Lev: " + accountLev.balance + " Balance Kate: " + accountKate.balance);
		accountLev.transfer(1500, accountKate);
		System.out.println("Balance Lev: " + accountLev.balance + " Balance Kate: " + accountKate.balance);
		boolean transferSuccess = accountLev.transfer(500, accountKate);
		if (transferSuccess) {
			System.out.println("The transfer was a success");
		}
		System.out.println("Balance Lev: " + accountLev.balance + " Balance Kate: " + accountKate.balance);
	}
}
