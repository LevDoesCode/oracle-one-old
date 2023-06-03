package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
	public static void main(String[] args) {
		String class1 = "Geometry";
		String class2 = "Physics";
		String class3 = "Chemistry";
		String class4 = "History";

		System.out.println("Sorting array lists elements");

		ArrayList<String> classes = new ArrayList<>();
		classes.add(class1);
		classes.add(class2);
		classes.add(class3);
		classes.add(class4);

		System.out.println(classes);

		System.out.println("Collections class");
		Collections.sort(classes);
		System.out.println(classes);

		System.out.println("Collections class - Reverse order");
		Collections.sort(classes, Collections.reverseOrder());
		System.out.println(classes);

		System.out.println("Sort function");
		classes.sort(Comparator.naturalOrder());
		System.out.println(classes);

		System.out.println("Sort function - Reverse order");
		classes.sort(Comparator.reverseOrder());
		System.out.println(classes);

		System.out.println("Stream to list");
		List<String> classList = classes.stream().sorted().collect(Collectors.toList());
		System.out.println(classList);
	}
}
