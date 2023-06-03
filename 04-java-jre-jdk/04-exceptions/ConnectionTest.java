
public class ConnectionTest {
	public static void main(String[] args) {
		Connection conn1 = new Connection();
		try {
			conn1.ConnectionReadData();
		} catch (IllegalStateException e) {
			System.out.println("Reading data exception");
			e.printStackTrace();
		} finally {
			System.out.println("Finally block");
			conn1.ConnectionClose();
		}
	}
}
