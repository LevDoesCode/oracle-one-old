// Entity Account
// Properties
// -Balance
// -Branch
// -Number
// -Owner

class Account1 {
	double balance;
	int branch;
	int number;
	String owner;
}

class Account {
	double balance;
	int branch;
	int number;
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
}

class AccountDefault {
	double balance;
	int branch;
	int number;
	Client owner = new Client();
}