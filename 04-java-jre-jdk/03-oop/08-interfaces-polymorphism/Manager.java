
public class Manager extends Employee implements EmployeeLoginAble {
	private String password;

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean login(String password) {
		return this.password == password;
	}

	// We're using function overriding
	// We overwrite a father class function of the same signature
	@Override
	public double getBonus() {
		return super.getSalary() + this.getSalary() * 0.5;
	}
}
