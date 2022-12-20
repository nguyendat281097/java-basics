package com.nvd.training.java11.advanced.collection;

import java.util.Arrays;
import java.util.List;

/* java.util.Collection interface contains a new default toArray
 *  to make it easier to create an array of the right type from a collection */

public class CollectionExample {
	public static void main(String[] args) {
		List<String> sampleList = Arrays.asList("Java", "Kotlin");
		String[] sampleArray = sampleList.toArray(String[]::new);
		Arrays.stream(sampleArray).forEach(System.out::println);
	}
}
