package com.nvd.training.java11.advanced.string;

import java.util.List;
import java.util.stream.Collectors;

/*Some String methods have been released in the java 11: 
 * - isBlank(): return true if a string only is empty or only has space chars
 * - lines(): return a collection of Strings that are divided by line terminators (\n)
 * - repeat(int n): result is concatenated of original string repeat the number of times in the argument.
 * - stripLeading(): remove the white space which is in front of the string.
 * - stripTrailing(): remove the white space which is in back of the string.
 * - strip(): remove all the white spaces which are in front and back of the string.
 * */


public class StringExample {
	public static void main(String[] args) {
		
		String isBlank = "    ";
		String isBlank2 = "";
		String isBlank3 = "not";
		System.out.println(isBlank.isBlank());
		System.out.println(isBlank2.isBlank());
		System.out.println(isBlank3.isBlank());
		
		String string = "Hello everyone, I am Java Software Developer, I helps \n \n you understand \n \n Java 11";
		
		List<String> lines = string.lines()
				.filter(line -> !line.isBlank())
				.map(String::strip)
				.collect(Collectors.toList());
		System.out.println(lines);
		
		String repeat = "Repeat me";
		System.out.println(repeat.repeat(5));
		
		String stripStr = "   Hello and Hello   ";
		System.out.println(stripStr.stripLeading());
		System.out.println(stripStr.stripTrailing());
		System.out.println(stripStr.strip());
		

	}
}
