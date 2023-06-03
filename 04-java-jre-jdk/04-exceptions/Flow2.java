// Checked Exception
public class Flow2 {
	public static void main(String[] args) {
		System.out.println("Main start");
		try {
			method1();
		} catch (MyExceptionException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Main end");
	}

	public static void method1() throws MyExceptionException {
		System.out.println("Method1 start");
		method2();
		System.out.println("Method1 end");
	}

	public static void method2() throws MyExceptionException {
		System.out.println("Method2 start");
		throw new MyExceptionException("My Exception Exception");
	}
}
