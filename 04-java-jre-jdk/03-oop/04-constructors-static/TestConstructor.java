
public class TestConstructor {
	public static void main(String[] args) {
		Account acc = new Account(6);
		System.out.println(acc.getBranch());
		acc.setBranch(8);
		System.out.println(acc.getBranch());

		Account acc2 = new Account(-1);
		System.out.println(acc2.getBranch());

		// only works if the static attribute is public
		// System.out.println("Number of accounts: " + Account.numberAccounts);

		System.out.println("Number of accounts: " + Account.getTotal());
	}
}
