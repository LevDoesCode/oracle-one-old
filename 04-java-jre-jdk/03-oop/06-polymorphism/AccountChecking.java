
public class AccountChecking extends Account {
	public AccountChecking(int branch, int number) {
		super(branch, number);
	}

	@Override
	public boolean withdraw(double amount) {
		double fee = 0.2;
		return super.withdraw(amount + fee);
	}
}
