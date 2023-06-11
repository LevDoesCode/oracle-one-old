package stock.tests;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/stock_control?useTimeZone=true&serverTimeZone=UTC";
		String user = "root";
		String pass = "SECUREPASS";
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Closing connection");
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
