
public class Manager extends Employee {
	private String password;

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean login(String password) {
		return this.password == password;
	}

	// We're using function overriding
	// We overwrite a father class function of the same signature
	public double getBonus() {
		return super.getSalary() + super.getBonus();
	}
}
