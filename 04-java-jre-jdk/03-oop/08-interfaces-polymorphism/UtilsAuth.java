
public class UtilsAuth {
	private String pass;

	public boolean login(String password) {
		return this.pass == password;
	}

	public void setPassword(String password) {
		this.pass = password;
	}
}
