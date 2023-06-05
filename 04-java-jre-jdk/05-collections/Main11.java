package collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

public class Main11 {

	// docs.oracle.com/javase/tutorial/collections/interfaces/index.html
	// docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html
	public static void main(String[] args) {
		String student1 = "John";
		String student2 = "Bob";
		String student3 = "Demi";
		String student4 = "Peter";
		String student5 = "Gustav";
		String student6 = "Foxie";

		Collection<String> listStudents = new HashSet<>(); // HashSet can be set as Collection

		listStudents.add(student1);
		listStudents.add(student2);
		listStudents.add(student3);
		listStudents.add(student4);
		listStudents.add(student5);
		listStudents.add(student6);
		listStudents.add(student6); // HashSet doesn't add duplicates

		for (String student : listStudents) {
			System.out.println(student);
		}

		// listStudents.get() // not supported by HashSet

		System.out.println(listStudents.contains("Foxie"));
		System.out.println(listStudents.contains("FOXIE"));

		String longest = listStudents.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println("---Longest---");
		System.out.println(longest);
		System.out.println(longest.length());

		// using lambda
		System.out.println("---Remove longest---");
		listStudents.removeIf(student -> longest.equalsIgnoreCase(student));
		for (String student : listStudents) {
			System.out.println(student);
		}
	}
}
