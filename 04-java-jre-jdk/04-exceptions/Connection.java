
public class Connection implements AutoCloseable {
	public Connection() {
		System.out.println("Connection start");
		// throw new IllegalStateException("Bad data");
	}

	public void ConnectionReadData() {
		System.out.println("Connection reading data...");
		throw new IllegalStateException("Bad data");
	}

	public void ConnectionClose() {
		System.out.println("Connection end");
	}

	@Override
	public void close() throws Exception {
		ConnectionClose();
	}
}
