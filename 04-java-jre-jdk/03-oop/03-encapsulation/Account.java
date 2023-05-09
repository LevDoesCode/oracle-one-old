// Entity Account
// Properties
// -Balance
// -Branch
// -Number
// -Owner

class Account {
	private double balance;
	private int branch;
	private int number;
	Client owner;

	void deposit(double amount) {
		this.balance += amount;
	}
	
	public boolean withdraw(double amount) {
		if (this.balance < amount) {
			return false;
		}
		this.balance -= amount;
		return true;
	}
	
	public boolean transfer(double amount, Account sender) {
		if (sender.balance < amount) {
			return false;
		}
		this.balance += amount;
		sender.balance -= amount;
		return true;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBranch(int newBranch) {
		if (newBranch < 0) {
			return;
		}
		this.branch = newBranch;
	}
	
	public int getBranch() {
		return this.branch;
	}
}
