public interface EmployeeLoginAble {
	public void setPassword(String password);

	public boolean login(String password);
}

//public abstract class EmployeeLoginAble extends Employee {
//	public abstract double getBonus();
//
//	private String password;
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public boolean login(String password) {
//		return this.password == password;
//	}
//
//}
