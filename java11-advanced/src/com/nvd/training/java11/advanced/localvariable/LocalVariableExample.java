package com.nvd.training.java11.advanced.localvariable;

import java.util.Arrays;

/* Java 11 supports the usage of var uniform in both local variables and lambda variables.
 * Limitations:
 * - We cannot use var for some parameters and skip for others
 * - We cannot mix var with explicit types
 * - Even though we can skip the parentheses in single parameter lambda, we cannot skip them while using var:
 *	 var s1 -> s1.toUpperCase()
 *  */

public class LocalVariableExample {
	public static void main(String[] args) {
		String string = "Hello everyone, I am Java Software Developer, I helps \n \n you understand \n \n Java 11";
		
		String[] stringArr = string.split(" ");
		Arrays.asList(stringArr).forEach((var s) -> System.out.print(s + " - "));
		
		var s = "Hello world";
		System.out.println(s);
	}
}
