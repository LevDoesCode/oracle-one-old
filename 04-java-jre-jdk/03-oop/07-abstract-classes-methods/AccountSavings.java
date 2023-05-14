
public class AccountSavings extends Account {

	public AccountSavings(int branch, int number) {
		super(branch, number);
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;
	}

}
