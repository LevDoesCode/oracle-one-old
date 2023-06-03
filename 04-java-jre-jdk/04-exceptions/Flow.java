// Unchecked Runtime exception
public class Flow {
	public static void main(String[] args) {
		System.out.println("Main start");
		method1();
		System.out.println("Main end");
	}

	public static void method1() {
		System.out.println("Method1 start");
		method2();
		System.out.println("Method1 end");
	}

	public static void method2() {
		System.out.println("Method2 start");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);

			try {
				if (i == 1) {
					int num = 0;
					int res = i / num;
					System.out.println(res);
				}
				if (i == 2) {
					ArithmeticException ex1 = new ArithmeticException();
					throw ex1;
				}
				if (i == 3) {
					throw new MyExceptionRuntime("Throwing My Exception");
				}
			} catch (ArithmeticException | NullPointerException e) {
				System.out.println("Error: " + e.getMessage());
				e.printStackTrace();
			} catch (MyExceptionRuntime e) {
				System.out.println("Error: " + e.getMessage());
				e.printStackTrace();
			}
		}
		System.out.println("Method2 end");
	}
}
