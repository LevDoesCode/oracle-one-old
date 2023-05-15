
public class Administrator extends Employee implements EmployeeLoginAble {

	private UtilsAuth utilAuth;

	public Administrator() {
		this.utilAuth = new UtilsAuth();
	}

	@Override
	public double getBonus() {
		return 0;
	}

	@Override
	public void setPassword(String password) {
		this.utilAuth.setPassword(password);
	}

	@Override
	public boolean login(String password) {
		return this.utilAuth.login(password);
	}

}
