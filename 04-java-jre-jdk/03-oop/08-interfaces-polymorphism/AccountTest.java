
public class AccountTest {
	public static void main(String[] args) {
		AccountChecking acc1 = new AccountChecking(1, 1);
		AccountSavings acc2 = new AccountSavings(2, 2);
		acc1.deposit(2000);
		// There's a 0.02 charge on transfers between accounts
		acc1.transfer(1000, acc2);

		System.out.println(acc1.getBalance());
		System.out.println(acc2.getBalance());
	}
}
