package collections;

import java.util.ArrayList;

public class Main6 {
	public static void main(String[] args) {
		Path path1 = new Path("Java", 45);
		path1.addSubject(new Subject("ArrayList Subject", 10));
		path1.addSubject(new Subject("List Subject", 20));
		path1.addSubject(new Subject("LinkedList Subject", 15));

		ArrayList<Path> paths = new ArrayList<>();
		paths.add(path1);

		System.out.println(paths.get(0).getSubjectList());
	}
}
