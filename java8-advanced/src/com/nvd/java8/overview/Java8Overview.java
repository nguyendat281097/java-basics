package com.nvd.java8.overview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Java8Overview {

	/* Example 1: using Collection to sort with Comparator */

	private static void sortUsingJava7(List<String> list) {
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
	}

	private static void sortUsingJava8(List<String> list) {
		Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
	}

	private static List<String> createDummyData() {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("C++");
		list.add("C#");
		list.add("PHP");
		list.add("Javascript");
		list.add("Python");
		return list;
	}

	/* ----------------------------------------------------- */

	/* Example 2: using stream to filter an Integer list is odd */

	private static void filterUsingJava7(List<Integer> list) {
		Collections.sort(list);

		Stream<Integer> stream = list.stream().filter(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t % 2 != 0;
			}
		});

		stream.forEach(t -> System.out.print(t + " "));
	}

	private static void filterUsingJava8(List<Integer> list) {
		list.stream().sorted().filter(t -> t % 2 != 0).forEach(t -> System.out.print(t + " "));
	}

	public static void main(String[] args) {
		/* Example 1 */
		List<String> list1 = createDummyData();
		List<String> list2 = createDummyData();

		// Sort using Java 7 syntax
		sortUsingJava7(list1);
		System.out.println(list1);

		// Sort using Java 8 syntax
		sortUsingJava8(list2);
		System.out.println(list2);

		/*--------------------*/

		/* Example 2 */

		List<Integer> listInt = Arrays.asList(1, 2, 3, 5, 6, 7, 8, 10, 11, 14, 15);
		System.out.println("Using Java 7");
		filterUsingJava7(listInt);

		System.out.println();
		System.out.println("Using Java 8");
		filterUsingJava8(listInt);

	}
}
