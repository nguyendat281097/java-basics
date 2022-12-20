package com.nvd.training.java11.advanced.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/* A static not method has been added to the Predicate interface. 
 * We can use it to negate an existing predicate.
 * The big advantage is that we can also use not with method references, like not(String:isBlank).
 * 
 * Pattern.asMatchPredicate(): this method will create a predicate if the pattern matches with the input string.
 * 
 * Predicate is an interface and is used for the condition of lambda expressions and method references.
 */

public class PredicateExample {
	public static void main(String[] args) {
		List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
		List<String> withoutBlanks = sampleList.stream().
				filter(Predicate.not(String::isBlank))
				.collect(Collectors.toList());
		System.out.println(withoutBlanks);

		var str = Pattern.compile("aba").asMatchPredicate();
		System.out.println(str.test("aabb"));
		System.out.println(str.test("aba"));
		
		Employee e1 = new Employee(1, 23, "M");
        Employee e2 = new Employee(2, 13, "F");
        Employee e3 = new Employee(3, 43, "M");
        Employee e4 = new Employee(4, 26, "M");
        Employee e5 = new Employee(5, 19, "F");
        Employee e6 = new Employee(6, 15, "M");
        Employee e7 = new Employee(7, 68, "F");
        Employee e8 = new Employee(8, 79, "M");
        Employee e9 = new Employee(9, 15, "F");
        Employee e10 = new Employee(10, 45, "M");

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.addAll(Arrays.asList(new Employee[] { e1, e2, e3, e4, e5, e6, e7, e8, e9, e10 }));

        System.out.println(EmployeePredicate.filterEmployees(employeeList, EmployeePredicate.isAdultMale()));

        System.out.println(EmployeePredicate.filterEmployees(employeeList, EmployeePredicate.isAdultFemale()));

        System.out.println(EmployeePredicate.filterEmployees(employeeList, EmployeePredicate.isAgeMoreThan(35)));

        System.out.println(EmployeePredicate.filterEmployees(employeeList, EmployeePredicate.isAgeMoreThan(35).negate()));
	}
}
