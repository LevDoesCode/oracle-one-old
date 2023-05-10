
public class Manager extends Employee {
	private String password;

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean login(String password) {
		return this.password == password;
	}
}
