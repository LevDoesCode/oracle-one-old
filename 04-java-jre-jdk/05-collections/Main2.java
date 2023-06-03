package collections;

import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		String var1 = "Class 1";
		String var2 = "Class 2";
		String var3 = "Class 3";
		String var4 = "Class 4";

		System.out.println("Reading array lists elements");

		ArrayList<String> myList = new ArrayList<>();
		myList.add(var1);
		myList.add(var2);
		myList.add(var3);
		myList.add(var4);

		System.out.println(myList);

		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}

		System.out.println("foreach");
		for (String curClass : myList) {
			System.out.println(curClass);
		}

		System.out.println("lamba");
		myList.forEach(curClass -> {
			System.out.println(curClass);
		});
	}
}
