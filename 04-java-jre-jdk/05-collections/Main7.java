package collections;

import java.util.ArrayList;
import java.util.List;

public class Main7 {
	public static void main(String[] args) {
		Path path1 = new Path("Java", 45);
		path1.addSubject(new Subject("ArrayList Subject", 10));
		path1.addSubject(new Subject("List Subject", 20));
		path1.addSubject(new Subject("LinkedList Subject", 15));

		// We get the list of subject in path1 by reference and we can modify the list
		List<Subject> subjectList = path1.getSubjectList();
		subjectList.add(new Subject("Inmutable", 60));

		ArrayList<Path> paths = new ArrayList<>();
		paths.add(path1);

		System.out.println(paths.get(0).getSubjectList());

		// We can create a function that returns an unmodifiable list
		List<Subject> subjectUnmodList = path1.getUnmodSubjectList();
		// subjectUnmodList.add(new Subject("Inmutable", 60)); // error

	}
}
