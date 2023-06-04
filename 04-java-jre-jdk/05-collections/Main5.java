package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main5 {
	public static void main(String[] args) {
		Subject subject1 = new Subject("SAP", 30);
		Subject subject2 = new Subject("JavaScript", 20);
		Subject subject3 = new Subject("HTML", 15);
		Subject subject4 = new Subject("CSS", 50);

		ArrayList<Subject> subjects = new ArrayList<>();
		subjects.add(subject1);
		subjects.add(subject2);
		subjects.add(subject3);
		subjects.add(subject4);

		// Shows location in memory
		System.out.println(subjects);

		Collections.sort(subjects);

		System.out.println(subjects);

		// Requiring implementation of Comparable and compareTo()
		Collections.sort(subjects, Collections.reverseOrder());
		System.out.println(subjects);

		// Creating a comparator. Doesn't need compareTo()
		subjects.sort(Comparator.comparing(Subject::getName));
		System.out.println(subjects);

		// Using the Collections sort() method
		Collections.sort(subjects, Comparator.comparing(Subject::getName).reversed());
		System.out.println(subjects);

		// Using stream
		List<Subject> subList = subjects.stream().sorted(Comparator.comparingInt(Subject::getLength))
				.collect(Collectors.toList());
		System.out.println(subList);

		List<Subject> subList2 = subjects.stream().filter(subject -> !subject.getName().equalsIgnoreCase("HTML"))
				.sorted(Comparator.comparingInt(Subject::getLength)).collect(Collectors.toList());
		System.out.println(subList2);
	}
}
