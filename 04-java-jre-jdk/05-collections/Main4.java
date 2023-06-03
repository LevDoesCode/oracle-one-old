package collections;

import java.util.ArrayList;

public class Main4 {
	public static void main(String[] args) {
		Subject subject1 = new Subject("Geometry", 30);
		Subject subject2 = new Subject("Chemistry", 20);
		Subject subject3 = new Subject("Physics", 15);
		Subject subject4 = new Subject("History", 50);

		ArrayList<Subject> subjects = new ArrayList<>();
		subjects.add(subject1);
		subjects.add(subject2);
		subjects.add(subject3);
		subjects.add(subject4);

		// Shows location in memory
		System.out.println(subjects);
	}
}
