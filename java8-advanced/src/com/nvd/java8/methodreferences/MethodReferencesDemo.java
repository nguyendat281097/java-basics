package com.nvd.java8.methodreferences;

import java.util.Arrays;

/* Method references is the short syntax of lambda expression to call the method.
 * Java 8 allow passing a reference of a method or a constructor by using :: keyword.
 * Syntax: 
 * str -> System.out.println(str) ===> System.out::println
 * 
 * How many types of the method references?
 * - Refer to a static method - Class::staticMethod
 * - Refer to an instance method of an object - object::instanceMethod
 * - Refer to an instance method of an object of a particular type - Class::instanceMethod
 * - Refer to a constructor - Class::new
 * 
 */

public class MethodReferencesDemo {
	/*
	 * Refer to a static method - Class::staticMethod Conclusion: As we see, two
	 * methods MathUtils.sum and MathUtils.minus has the same structure. So if we
	 * call a method (doAction) which in the method has a Functional Interface, you
	 * can pass a parameter has the same structure with the defined method in
	 * Functional Interface.
	 * 
	 */

	@FunctionalInterface
	interface ExecuteFunction {
		public int execute(int a, int b);
	}

	static class MathUtils {
		public static int sum(int a, int b) {
			return a + b;
		}

		public static int minus(int a, int b) {
			return a - b;
		}
	}

	/*
	 * Refer to an instance method of an object - object::instanceMethod Conclusion:
	 * The same way to use with Class::staticMethod
	 * 
	 */

	@FunctionalInterface
	interface ExecuteFunction2 {
		public int execute(int a, int b);
	}

	class MathUtils2 {
		public int sum(int a, int b) {
			return a + b;
		}

		public int minus(int a, int b) {
			return a - b;
		}
	}

	/*
	 * Refer to an instance method of an object of a particular type -
	 * Class::instanceMethod
	 * 
	 * Conclusion: We can refer to a specific method of an Object of data type like
	 * as (String, Boolean, Integer, Double, ...)
	 * 
	 */

	/*
	 * Refer to a constructor 
	 * Conclusion: As we see, we can call the constructor of Hello class
	 * to create an instance of this class by using: Hello.new
	 */

	@FunctionalInterface
	interface SayHello {
		void display(String say);
	}

	static class Hello implements SayHello {
		public Hello(String say) {
			System.out.print(say);
		}

		@Override
		public void display(String say) {
			System.out.println(say);
		}
	}

	public static void main(String[] args) {
		int a = 20;
		int b = 17;

		/* Refer to a static method - Class::staticMethod */

		int sum = doAction(a, b, MathUtils::sum);
		System.out.println(a + " + " + b + " = " + sum); // 20 + 17 = 37

		int minus = doAction(a, b, MathUtils::minus);
		System.out.println(a + " - " + b + " = " + minus); // 20 - 17 = 3

		/* Refer to an instance method of an object - object::instanceMethod */

		MathUtils2 obj = new MethodReferencesDemo().new MathUtils2();
		int sum2 = doAction(a, b, obj::sum);
		System.out.println(a + " + " + b + " = " + sum2);

		int minus2 = doAction(a, b, obj::minus);
		System.out.println(a + " - " + b + " = " + minus2);

		/*
		 * Refer to an instance method of an object of a particular type -
		 * Class::instanceMethod
		 */

		String[] stringArray = { "Java", "C++", "PHP", "C#", "Javascript" };

		Arrays.sort(stringArray, String::compareToIgnoreCase);
		for (String str : stringArray) {
			System.out.print(str + " ");
		}
		System.out.println();

		/* Refer to a constructor */
		
		SayHello ref = MethodReferencesDemo.Hello::new;
		ref.display("Welcome to gpcoder.com");

	}

	public static int doAction(int a, int b, ExecuteFunction func) {
		return func.execute(a, b);
	}
}
