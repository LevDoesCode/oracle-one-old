
public class Client implements EmployeeLoginAble {
	private String name;
	private String id;
	private String phone;
	private UtilsAuth utilAuth;

	public Client() {
		this.utilAuth = new UtilsAuth();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
