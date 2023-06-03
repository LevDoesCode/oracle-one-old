package collections;

import java.util.ArrayList;

public class Main1 {
	public static void main(String[] args) {
		String var1 = "Example 1";
		String var2 = "Example 2";
		String var3 = "Example 3";
		String var4 = "Example 4";

		ArrayList<String> myList = new ArrayList<>();
		myList.add(var1);
		myList.add(var2);
		myList.add(var4);
		myList.add(var3);

		System.out.println(myList);

		myList.remove(0);
		System.out.println(myList);

		myList.set(0, var3);
		System.out.println(myList);

		System.out.println(myList.size());
	}
}
