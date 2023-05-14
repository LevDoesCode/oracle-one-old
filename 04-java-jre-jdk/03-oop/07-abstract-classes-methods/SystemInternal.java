
public class SystemInternal {
	private String pass = "12345";

	public boolean login(Manager manager) {
		boolean loginOK = manager.login(pass);
		if (loginOK) {
			System.out.println("Login is OK");
			return true;
		} else {
			System.out.println("Error logging in");
			return false;
		}
	}
}
