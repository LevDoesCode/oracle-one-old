package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main8 {
	public final static List<List<Integer>> myLists = new ArrayList<List<Integer>>() {
		{
			add(new LinkedList<Integer>());
			add(new ArrayList<>()); // Integer is optional because it's already specified in line 9
		}
	};

	public static void main(String[] args) {
		int len = 100000;
		for (List<Integer> curList : myLists) {
			final String nameImplementation = myLists.getClass().getSimpleName();
			// add
			long start = System.currentTimeMillis();
			for (int i = 0; i < len; i++) {
				curList.add(i);
			}
			long end = System.currentTimeMillis();
			long duration = end - start;
			System.out.println(nameImplementation + " add: " + duration);

			// get
			start = System.currentTimeMillis();
			for (int i = 0; i < len; i++) {
				curList.get(i);
			}
			end = System.currentTimeMillis();
			duration = end - start;
			System.out.println(nameImplementation + " get: " + duration);

			// remove
			start = System.currentTimeMillis();
			for (int i = len - 1; i >= 0; i--) { // format needed for linked lists otherwise throws errors
				curList.remove(i);
			}
			end = System.currentTimeMillis();
			duration = end - start;
			System.out.println(nameImplementation + " remove: " + duration);
		}
	}
}
