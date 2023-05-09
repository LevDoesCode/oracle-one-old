// Entity Account
// Properties
// -Balance
// -Branch
// -Number
// -Owner

class Account {
	private double balance;
	private int branch = 1;
	private int number;
	private Client owner;

	private static int numberAccounts = 0;

	public Account(int branch) {
		if (branch > 0) {
			this.branch = branch;
		} else {
			this.branch = 1;
		}
		numberAccounts += 1;
		System.out.println("Accounts created so far: " + numberAccounts);
	}

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
