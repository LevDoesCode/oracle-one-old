
public class SystemInternalTest {
	public static void main(String[] args) {
		SystemInternal system = new SystemInternal();
		Manager man1 = new Manager();
		Administrator admin1 = new Administrator();

		system.login(man1);
		system.login(admin1);
	}
}
