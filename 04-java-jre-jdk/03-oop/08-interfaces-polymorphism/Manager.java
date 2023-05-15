
public class Manager extends Employee implements EmployeeLoginAble {
	private UtilsAuth utilAuth;

	public Manager() {
		this.utilAuth = new UtilsAuth();
	}

	@Override
	public void setPassword(String password) {
		this.utilAuth.setPassword(password);
	}

	@Override
	public boolean login(String password) {
		return this.utilAuth.login(password);
	}

	// We're using function overriding
	// We overwrite a father class function of the same signature
	@Override
	public double getBonus() {
		return super.getSalary() + this.getSalary() * 0.5;
	}
}
