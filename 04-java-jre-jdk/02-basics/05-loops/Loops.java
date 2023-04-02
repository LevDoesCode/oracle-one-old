
public class Loops {
	public static void main(String[] args) {
		// While loop
		int counter = 0;
		while (counter < 5) {
			System.out.println(counter + 1);
			counter += 1;
		}

		counter = 0;
		int total = 0;
		while (counter < 5) {
			total += counter;
			counter++;
		}

		System.out.println(total);
		
		// For loop
		for (int counter2 = 0; counter2 <= 6; counter2++) {
			System.out.println(counter2);
		}

		// System.out.println(counter2); // counter2 not valid outside the for scope
		
		// Nested loops
		for (int counter3 = 1; counter3 <= 10; counter3++) {
			for (int mult = 1; mult <= 10; mult++) {
				System.out.print(counter3 * mult);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		// 10 x 10 matrix
		for (int row= 0; row < 10; row++) {
			for (int column = 0; column < 10; column++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Half square
		for (int row= 0; row < 10; row++) {
			for (int column = 0; column < 10; column++) {
				if (column > row) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Half square
		for (int row= 0; row < 10; row++) {
			for (int column = 0; column <= row; column++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
