package com.nvd.java8.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/* Optional is used to check that a variable has the existed value or not.
 * Strong point: avoid NullPointerException at Runtime
 * one Optional only has one value, and it is Generic value.
 * 
 * 
 */

public class OptionalExample {

	/* Start Example 1: isPresent() method */

	static class Student {
		String name;
	}

	public static void preJava8() {
		Student student = getStudent();
		if (student != null) {
			System.out.println(student.name);
		}
	}

	public static void java8() {
		Student student = getStudent();
		Optional<Student> opt = Optional.of(student);
		if (opt.isPresent()) {
			System.out.println(opt.get().name);
		}
		// opt.ifPresent(s -> System.out.println(s.name));
	}

	private static Student getStudent() {
		Student student = new Student();
		student.name = "Java";
		return student;
	}

	/* End Example 1: isPresent() method */

	private static List<String> getList() {
		return null;
	}

	private static Optional<List<String>> getList2() {
		return Optional.ofNullable(null);
	}

	/* Start Example 3: map() method */

	class User {

		private Address address;

		public Address getAddress() {
			return address;
		}
	}

	class Address {

		private String street;

		public String getStreet() {
			return street;
		}
	}

	public static String getStreetPreJava8() {
		User user = getUser();
		if (user != null) {
			Address address = user.getAddress();
			if (address != null) {
				String street = address.getStreet();
				if (street != null) {
					return street;
				}
			}
		}
		return "not specified";
	}

	public static String getStreetJava8() {
		Optional<User> user = Optional.ofNullable(getUser());
		return user.map(User::getAddress).map(Address::getStreet).orElse("not specified");
	}

	private static User getUser() {
		return null;
	}

	/* End Example 3: map() method */

	public static void main(String[] args) {
		/* Start Example 1: isPresent() method */
		preJava8();
		java8();
		/* End Example 1: isPresent() method */

		/* Start Example 2 orElse(), orElseGet() methods */

		// Pre java 8
		List<String> list = getList();
		List<String> listOpt = list != null ? list : new ArrayList<>();

		// Java 8
		List<String> listOpt2 = getList2().orElse(new ArrayList<>());
		List<String> listOpt3 = getList2().orElseGet(() -> new ArrayList<>());

		/* End Example 2 orElse(), orElseGet() methods */
		
		 /* Start Example 4: map() and flatMap() methods */
		Optional<String> optionalOf = Optional.of("welcome to java");
        Optional<String> optionalEmpty = Optional.empty();
 
        System.out.println(optionalOf.map(String::toLowerCase));
        System.out.println(optionalEmpty.map(String::toLowerCase));
 
        Optional<Optional<String>> multiOptional = Optional.of(Optional.of("java"));
 
        System.out.println("Value of Optional object: " + multiOptional);
        System.out.println("Optional.map: " + multiOptional.map(gender -> gender.map(String::toUpperCase)));
        System.out.println("Optional.flatMap: " + multiOptional.flatMap(gender -> gender.map(String::toUpperCase)));

		 /* End Example 4: map() and flatMap() methods */
        
        /* Start Example 5: filter() method */
        Optional<String> me = Optional.of("java");
        Optional<String> emptyOptional = Optional.empty();
 
        //Filter on Optional
        System.out.println(me.filter(g -> g.equals("JAVA"))); //Optional.empty
        System.out.println(me.filter(g -> g.equalsIgnoreCase("java"))); //Optional[java]
        System.out.println(emptyOptional.filter(g -> g.equalsIgnoreCase("java"))); //Optional.empty
        /* End Example 5: filter() method */
        
        /* Start Example 5: orElseThrow() method */
        Optional<String> shouldNotBeEmpty = Optional.empty();
        shouldNotBeEmpty.orElseThrow(() -> new IllegalStateException("This should not happen!!!"));
        /* End Example 5: orElseThrow() method */
	}
}
