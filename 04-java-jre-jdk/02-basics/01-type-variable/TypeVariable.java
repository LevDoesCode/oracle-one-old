
public class TypeVariable {
	public static void main(String[] args) {
		System.out.println("Hello");
		int age1 = 99;
		int age2;
		age2 = 19; // Not used
		System.out.println("Age: " + age1);
		age1 -= 20;
		System.out.println("New age: " + age1);
		
		double wage = 12.50;
		System.out.println("Wage is " + wage);
		
		double d1 = 13;
		System.out.println("Int in Double: " + d1);
		System.out.println("Int in Double: " + d1/2);
		
		// Casting
		
		double dbl1 = 238.93;
		int int1 = (int) dbl1;
		System.out.println(int1);
		
		int test1 = 1111111111;
		long test2 = 2222222222222222222L;
		short test3 = 11111;
		byte thisIsMyByteVar = 111;
		float test4 = 111111111111111111111111111111111111111F;
		double test5 = 111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111222222222222222222222222222222222222222222222222222222222222222222222222233333333333333333333333333333333333333333333333333333344444D;
		System.out.println(test5);
	}
}
