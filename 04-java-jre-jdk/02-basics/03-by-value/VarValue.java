
public class VarValue {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 9;
		
		System.out.println(num2);
		
		num2 = num1;
		System.out.println(num2);
		
		num1 = 88;
		// num2 = ???
		System.out.println(num2);
		// num2's values persists because the assignment is done by value
		// and not by reference as in some other languages
	}
}
