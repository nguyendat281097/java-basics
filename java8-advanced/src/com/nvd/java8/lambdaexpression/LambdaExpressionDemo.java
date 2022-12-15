package com.nvd.java8.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/*
 * Lambda Expression is a function and its no name, not belong any class, no access modifier, and no return parameter
 * Why use Lambda expression?
 * - provide the implement version for Functional Interface
 * - write less code
 * - effective due to support sequential and parallel
 * 
 * Syntax: (argument-list) -> {body}
 * - Argument-list: optional, can have one or many arguments
 * - Arrow-token (->): used to link argument-list and body
 * - Body: contains expressions and commands for lambda expression
 */
public class LambdaExpressionDemo {
	public static void usingJava7Sort() {
		List<String> languages = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");

		Collections.sort(languages, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}

		});

		for (String language : languages) {
			System.out.print(language + " ");
		}
	}

	public static void usingJava8Sort() {
		List<String> languages = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");

		Collections.sort(languages, (String o1, String o2) -> {
			return o1.compareTo(o2);
		});

		/*
		 * Can write: Collections.sort(languages, (o1, o2) -> o1.compareTo(o2));
		 */

		for (String language : languages) {
			System.out.print(language + " ");
		}
	}

	@FunctionalInterface
	interface Sayable1 {
		public String say();
	}

	public static void lambdaExpressionNoArgument() {
		Sayable1 s = () -> {
			return "We don't talk anymore.";
		};
		System.out.println(s.say());
	}

	@FunctionalInterface
	interface Addable {
		int add(int a, int b);
	}

	public static void lambdaExpressionWithOrWithoutReturnKeyword() {
		// Multiple parameters with data type in lambda expression
		Addable ad1 = (int a, int b) -> (a + b);
		System.out.println(ad1.add(10, 20));

		// Multiple parameters in lambda expression
		Addable ad2 = (a, b) -> (a + b);
		System.out.println(ad2.add(10, 20));

		// Lambda expression with return keyword.
		Addable ad3 = (a, b) -> {
			return a + b;
		};
		System.out.println(ad3.add(10, 20));

		// Lambda expression with multi-statement
		Addable ad4 = (a, b) -> {
			int sum = a + b;
			return sum;
		};
		System.out.println(ad4.add(10, 20));
	}

	public static void lambdaExpressionWithForEach() {
		List<String> languages = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");

		// Using Lambda expression
		languages.forEach(n -> System.out.print(n + " "));
		System.out.println();
	}

	public static void lambdaExpressionWithThread() {
		// Using an anonymous inner class
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("Runnable 1");
			}
		};

		// Using Lambda Expression for Functional Interface
		Runnable r2 = () -> System.out.println("Runnable 2");

		r1.run();
		r2.run();
	}

	static class Product {
		int id;
		String name;
		float price;

		public Product(int id, String name, float price) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
		}
	}

	public static void lambdaExpressionWithFilter() {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "Samsung A5", 17000f));
		list.add(new Product(3, "Iphone 6S", 65000f));
		list.add(new Product(2, "Sony Xperia", 25000f));
		list.add(new Product(4, "Nokia Lumia", 15000f));
		list.add(new Product(5, "Redmi4 ", 26000f));
		list.add(new Product(6, "Lenevo Vibe", 19000f));

		// using lambda to filter data
		Stream<Product> filterData = list.stream().filter(p -> p.price > 20000);

		// using lambda to iterate through collection
		filterData.forEach(product -> System.out.println(product.name + ": " + product.price));
	}
	
	/* Accessing local variables */
	
	@FunctionalInterface
	interface Converter<F, T> {
	    T convert(F from);
	}
	
	public static void doSomething1() {
        final int num = 1;
        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
 
        stringConverter.convert(2); // 3
    }
 
    public static void doSomething2() {
        int num = 1;
        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
 
        stringConverter.convert(2); // 3
    }
 
    public static void doSomething3() {
        int num = 1;
        Converter<Integer, String> stringConverter = (from) -> {
        	// num = 3; --> Compiler error here
        	return String.valueOf(from + num);
        };
 
        stringConverter.convert(2); // 3
 
        // Lambda expression will throw error at num varialbe.
        // Local variable num defined in an enclosing scope must be final or effectively
        // num = 3;
    }
    
	/* Accessing fields and static variables */
    
    static int outerStaticNum;
    int outerNum;
    
    public void testScores() {
    	Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 1;
            return String.valueOf(from);
        };
        
        System.out.println(stringConverter1.toString());
 
        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 1;
            return String.valueOf(from);
        };
        
        System.out.println(stringConverter2.toString());
    }
    
	/* Default methods cannot be accessed within the lambda expression */

	public static void main(String[] args) {
		/* Example 1 */
		System.out.println("Using Java 7:");
		usingJava7Sort();
		System.out.println();
		System.out.println("Using Java 8:");
		usingJava8Sort();
		System.out.println();

		/* Example 2 */
		lambdaExpressionNoArgument();

		/* Example 3 */
		lambdaExpressionWithOrWithoutReturnKeyword();

		/* Example 4 */
		lambdaExpressionWithForEach();
		
		/* Example 5 */
		lambdaExpressionWithFilter();
		
		/* Example 6 */
		doSomething1();
		doSomething2();
		doSomething3();
		
		/* Example 7 */
		new LambdaExpressionDemo().testScores();
	}
}
