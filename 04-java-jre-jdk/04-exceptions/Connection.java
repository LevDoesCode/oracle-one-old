
public class Connection {
	public Connection() {
		System.out.println("Connection start");
	}

	public void ConnectionReadData() {
		System.out.println("Connection reading data...");
		throw new IllegalStateException("Bad data");
	}

	public void ConnectionClose() {
		System.out.println("Connection end");
	}
}
