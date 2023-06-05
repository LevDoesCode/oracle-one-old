package collections;

import java.util.HashSet;
import java.util.Set;

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

		Set<String> listStudents = new HashSet<>();

		listStudents.add(student1);
		listStudents.add(student2);
		listStudents.add(student3);
		listStudents.add(student4);
		listStudents.add(student5);
		listStudents.add(student6);

		for (String student : listStudents) {
			System.out.println(student);
		}
	}
}
