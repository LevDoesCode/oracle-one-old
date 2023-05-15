
public class Administrator extends Employee implements EmployeeLoginAble {

	@Override
	public double getBonus() {
		return 0;
	}

	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean login(String password) {
		// TODO Auto-generated method stub
		return true;
	}

}
