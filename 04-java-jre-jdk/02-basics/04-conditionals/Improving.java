
public class Improving {
	public static void main(String[] args) {
		System.out.println("Hello");

		int age = 17;
		int count = 2;

		if (age >= 18 || count >= 2) {
			System.out.println("You can go in");
		} else {
			System.out.println("You cannot go in");
		}

		// Can only go in at least 2
		if (age >= 18 && count >= 2) {
			System.out.println("You can go in");
		} else {
			System.out.println("You cannot go in");
		}

		boolean inPair = count >= 2;
		boolean canGoIn = age>= 18 && inPair;
		
		if (canGoIn) {
			System.out.println("You can go in");
		} else {
			System.out.println("You cannot go in");
		}
	}
}
