// Entity Account
// Properties
// -Balance
// -Branch
// -Number
// -Owner

public abstract class Account {
	protected double balance;
	private int branch = 1;
	private int number;
	private Client owner;

	private static int numberAccounts = 0;

	public Account(int branch, int number) {
		if (branch > 0) {
			this.branch = branch;
		} else {
			this.branch = 1;
		}
		this.number = number;
		numberAccounts += 1;
		System.out.println("Accounts created so far: " + numberAccounts);
	}

	public abstract void deposit(double amount);

	public boolean withdraw(double amount) {
		if (this.balance < amount) {
			return false;
		}
		this.balance -= amount;
		return true;
	}

	public boolean transfer(double amount, Account receiver) {
		if (this.balance >= amount) {
			this.withdraw(amount);
			receiver.deposit(amount);
			return true;
		} else {
			return false;
		}
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

	public void setOwner(Client owner) {
		this.owner = owner;
	}

	public Client getOwner() {
		return this.owner;
	}

	public static int getTotal() {
		return numberAccounts;
	}
}
