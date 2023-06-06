package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main16 {

	// docs.oracle.com/javase/tutorial/collections/interfaces/index.html
	// docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html
	public static void main(String[] args) {

		Student student1 = new Student("John", "001");
		Student student2 = new Student("Bob", "002");
		Student student3 = new Student("Demi", "003");
		Student student4 = new Student("Peter", "004");
		Student student5 = new Student("Gustav", "005");
		Student student6 = new Student("Foxie", "006");
		Student student7 = new Student("Patrick", "007");

		// Collection<Student> listStudents = new LinkedHashSet<>(); // Look up is
		// consecutive
		Collection<Student> listStudents = new ArrayList<>();

		listStudents.add(student1);
		listStudents.add(student2);
		listStudents.add(student3);
		listStudents.add(student4);
		listStudents.add(student5);
		listStudents.add(student6);
		listStudents.add(student6); // HashSet doesn't add duplicates
		listStudents.add(student7); // HashSet doesn't add duplicates

		System.out.println("Contains student1: " + listStudents.contains(student1));

		Optional<Student> student = listStudents.stream()
				.filter(curStudent -> "003".equalsIgnoreCase(curStudent.getId())).findFirst();
		System.out.println(student);
		if (student.isPresent()) {
			System.out.println(student.get());
		}

		Map<String, Student> studentMap = new HashMap<>();
		studentMap.put(student1.getId(), student1);
		studentMap.put(student2.getId(), student2);
		studentMap.put(student3.getId(), student3);
		studentMap.put(student4.getId(), student4);
		studentMap.put(student5.getId(), student5);
		studentMap.put(student6.getId(), student6);

		System.out.println("---Using Hash Map---");
		System.out.println(studentMap.get(student3.getId()));
	}
}
