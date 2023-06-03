
public class ConnectionTest {
	public static void main(String[] args) throws Exception {
		// Try with resource
		try (Connection conn1 = new Connection()) {
			conn1.ConnectionReadData();
		} catch (IllegalStateException e) {
			System.out.println("Caught Ellegal State Exception");
			e.printStackTrace();
		}
//		try {
//			conn1.ConnectionReadData();
//		} catch (IllegalStateException e) {
//			System.out.println("Reading data exception");
//			e.printStackTrace();
//		} finally {
//			System.out.println("Finally block");
//			conn1.ConnectionClose();
//		}
	}
}
