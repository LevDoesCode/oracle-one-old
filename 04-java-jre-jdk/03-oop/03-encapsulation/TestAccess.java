
public class TestAccess {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.deposit(400);
		acc.withdraw(300);
		System.out.println(acc.getBalance());
		System.out.println(acc.getBranch());
		acc.setBranch(10);
		System.out.println(acc.getBranch());
	}
}
