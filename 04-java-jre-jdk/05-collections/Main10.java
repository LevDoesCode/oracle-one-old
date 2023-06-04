package collections;

import java.util.ArrayList;

public class Main10 {
	public static void main(String[] args) {
		Subject subject1 = new Subject("Algebra", 30);
		Subject subject2 = new Subject("Geometry", 20);
		Subject subject3 = new Subject("Calculus", 15);
		Subject subject4 = new Subject("History", 50);

		ArrayList<Subject> subjects = new ArrayList<>();
		subjects.add(subject1);
		subjects.add(subject2);
		subjects.add(subject3);
		subjects.add(subject4);

		System.out.println(subjects);

		// total subject length
		System.out.println("---Total subject length---");
		int length = 0;
		for (Subject curSubject : subjects) {
			length += curSubject.getLength();
		}
		System.out.println(length);

		// using stream
		System.out.println("---Using a stream---");
		System.out.println(subjects.stream().mapToInt(Subject::getLength).sum());
		System.out.println(subjects.stream().mapToInt(Subject::getLength).max());
		System.out.println(subjects.stream().mapToInt(Subject::getLength).max().getAsInt());

		System.out.println(subjects.stream().filter(subject -> !subject.getName().equalsIgnoreCase("History"))
				.mapToInt(Subject::getLength).sum());
	}
}
