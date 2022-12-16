package com.nvd.java8.foreach;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*forEach() is default method was defined in Iterable and Stream interfaces.
 * All collection class extends from Iterable interface can use forEach() to iterate the elements.
 * 
 */

public class ForEachExample {
	/* Example forEach with Map
	 * forEach to iterate and display each key and value pair of HashMap 
	 */
	public static void forEachWithMap() {
		Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "Java");
        hmap.put(2, "Javascript");
        hmap.put(3, "PHP");
        hmap.put(4, "C#");
        hmap.put(5, "C++");
        
        hmap.forEach((key, value) -> System.out.println(key + " : " + value));
	}
	
	/* Example forEach with List
	 * forEach to iterate and display each key and value pair of HashMap 
	 */
	public static void forEachWithList() {
		List<String> languages = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
		
		System.out.println("Iterating by passing lambda expression: ");
        languages.forEach(lang -> System.out.println(lang));
 
        System.out.println("Iterating by passing method reference: ");
        languages.forEach(System.out::println);
		
	}
	
	/*
	 * Example forEachOrdered() is used to iterate the elements in the order
	 * specified by the Stream
	 */
	public static void forEachOrdered() {
		List<String> languages = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
		 
        System.out.println("Iterating by passing lambda expression: ");
        languages.stream().forEachOrdered(lang -> System.out.println(lang));
 
        System.out.println("Iterating by passing method reference: ");
        languages.stream().forEachOrdered(System.out::println);
	}
	
	public static void main(String[] args) {
		forEachWithMap();
		System.out.println("-------------");
		forEachWithList();
		System.out.println("-------------");
		forEachOrdered();
	}
}
