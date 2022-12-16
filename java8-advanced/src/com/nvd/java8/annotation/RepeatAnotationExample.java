package com.nvd.java8.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* Repeating Annotation: Allow the same annotations can declare many times in the same place.
 * 
 * 
 * Type Annotation: From Java 8, annotations that can be applied for any data types, 
 * includes: new operator, type casts, implement clauses, throw clauses.
 * Type Annotations allow improved analysis of Java code and can ensure even stronger type checking.
 * 
 */

public class RepeatAnotationExample {

	// 1. Declare a Repeatable Annotation Type
	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	@Repeatable(Filters.class)
	public @interface Filter {
		String value();
	};

	// 2. Declare the Containing Annotation Type
	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Filters {
		Filter[] value();
	}

	// 3. Use repeating annotations
	@Filter("filter1")
	@Filter("filter2")
	public interface Filterable {

	}

	public static void main(String[] args) {
		// 4. Retrieving Annotations via the Filter class
		Filter[] arrFilter = Filterable.class.getAnnotationsByType(Filter.class);
		for (Filter filter : arrFilter) {
			System.out.println(filter.value());
		}

		// Another way
		// 4. Retrieving Annotations via the Filters class
		Filters filters = Filterable.class.getAnnotation(Filters.class);
		for (Filter filter : filters.value()) {
			System.out.println(filter.value());
		}
	}
}
