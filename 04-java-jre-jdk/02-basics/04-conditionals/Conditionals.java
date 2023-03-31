
public class Conditionals {
	public static void main(String[] args) {
		System.out.println("Hello");

		int cond = -1;
		if (cond == 10) {
			System.out.println("Ten!");
		} else if (cond > 10) {
			System.out.println("More than ten!");
		} else if (cond < 10 && cond >= 0) {
			System.out.println("Less than ten!");
		} else {
			System.out.println("Less than zero");
		}
	}
}
