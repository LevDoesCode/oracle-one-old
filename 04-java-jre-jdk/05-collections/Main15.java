package collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Main15 {

	// docs.oracle.com/javase/tutorial/collections/interfaces/index.html
	// docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html
	public static void main(String[] args) {

		Subject subject1 = new Subject("Algebra", 30);
		Path path1 = new Path("Computer Science", 50);

		Student student1 = new Student("John", "001");
		Student student2 = new Student("Bob", "002");
		Student student3 = new Student("Demi", "003");
		Student student4 = new Student("Peter", "004");
		Student student5 = new Student("Gustav", "005");
		Student student6 = new Student("Foxie", "006");
		Student student7 = new Student("Patrick", "007");

		path1.addStudent(student1);

		// Collection<Student> listStudents = new LinkedHashSet<>(); // Look up is
		// consecutive
		Collection<Student> listStudents = new HashSet<>();

		listStudents.add(student1);
		listStudents.add(student2);
		listStudents.add(student3);
		listStudents.add(student4);
		listStudents.add(student5);
		listStudents.add(student6);
		listStudents.add(student6); // HashSet doesn't add duplicates
		listStudents.add(student7); // HashSet doesn't add duplicates

		System.out.println("Contains student1: " + listStudents.contains(student1));

		Iterator<Student> studentIterator = listStudents.iterator();

		while (studentIterator.hasNext()) {
			System.out.println(studentIterator.next());
		}
	}
}
