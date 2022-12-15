package com.nvd.java8.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* Stream is an new Java object and introduced in the version 8, it helps to make manipulating on Collection and Array easier and optimized
 * A Stream represents an operation of elements supports sequential and parallel.
 * All class and interfaces of stream included in java.util.stream package.
 * Features of Stream API:
 *  - Not save elements of the Collection or Array.
 *  - Stream is not a data structure.
 *  - Stream is immutable object.
 *  - All the actions of Stream is LAZY. Most of Stream operations return a new Stream, 
 *  which creates a chain that includes a series of operations to perform those operations optimally. This chain called pipeline.
 *  - Stream elements only were accessed once during the life cycle of Stream.
 *  - Stream cannot be reused, that means when finished, we cannot use it again.
 *  - Cannot use index to access the Stream elements
 *  - Stream supports parallel manipulation the elements of Collection or Array.
 *  
 * How to work with Stream in Java?
 * 	- Create a Stream
 *  - Execute intermediate operations (filter, ...)
 *  - Execute terminal operation (count, ...)
 *  A stream pipeline includes 1 stream source, 0 or many intermediate operations, 1 terminal operation
 *  
 *  Some creating Stream methods:
 *   - stream(): return a sequential stream
 *   - parallelStream(): return a parallel stream
 */

public class StreamExample {
	/* Example 1 */
	List<Integer> numbers = Arrays.asList(7, 2, 5, 4, 2, 1);

	public void withoutStream() {
		long count = 0;
		for (Integer number : numbers) {
			if (number % 2 == 0) {
				count++;
			}
		}
		System.out.printf("There are %d elements that are even \n", count);
	}

	public void withStream() {
		long count = numbers.stream().filter(num -> num % 2 == 0).count();
		System.out.printf("There are %d elements that are even \n", count);
	}

	/*
	 * Example 2
	 * 
	 * For primitive types, we can use Stream object for those types. For instance,
	 * IntStream, DoubleStream, LongStream, ...
	 * 
	 */
	public void primitiveStreamExample() {
		IntStream.range(1, 4).forEach(System.out::print); // 1 2 3
		System.out.println();
		IntStream.of(1, 2, 3).forEach(System.out::print); // 1 2 3
		System.out.println();
		DoubleStream.of(1, 2, 3).forEach(System.out::print); // 1.0 2.0 3.0
		System.out.println();
		LongStream.range(1, 4).forEach(System.out::print); // 1 2 3
		System.out.println();
		LongStream.of(1, 2, 3).forEach(System.out::print); // 1 2 3
		System.out.println();
	}

	/* filter() helps to remove the elements based on some criterias */
	public static void filterStream() {
		Stream.iterate(1, count -> count + 1).filter(number -> number % 3 == 0).limit(10)
				.forEach(x -> System.out.print(x + " "));
		System.out.println();
	}

	/*------------------- Intermediate operations Examples ------------------*/

	/*
	 * skip() will skip a element at the index. Return a blank Stream if the Stream
	 * size is smaller than the index limit() will return a small Stream with
	 * limited elements
	 * 
	 */
	public static void limitStream() {
		List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");

		data.stream().skip(1).limit(3).forEach(x -> System.out.print(x + " "));
		System.out.println();
	}

	/*
	 * map() operation helps map elements to the corresponding results example to
	 * upper case words in the data stream
	 */
	public static void mapStream() {
		List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
		data.stream().map(String::toUpperCase).forEach(s -> System.out.print(s + " "));
		System.out.println();
	}

	/* sorted() operation helps sort elements based on certain criteria */
	public static void sortedStream() {
		List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
		// sorted according to natural order
		data.stream().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();

		// sorted according to the provided Comparator
		data.stream().sorted((s1, s2) -> s1.length() - s2.length()).forEach(x -> System.out.print(x + " "));
		System.out.println();
	}

	/*------------------- Terminal Operations Examples ------------------*/

	/* forEach() helps to iterates over the elements of the Stream */

	public static void forEachStream() {
		Stream.iterate(1, count -> count + 1).filter(number -> number % 3 == 0).limit(6).forEach(System.out::println);
	}

	/*
	 * collect() operation helps to collect the stream result in a collection like
	 * list
	 */
	public static void collectStream() {
		Stream<String> stream = Stream.of("Java", "C#", "C++", "PHP", "Javascript");
		List<String> languages = stream.collect(Collectors.toList());
		System.out.println(languages);
	}

	/*
	 * anyMatch() return true if having the first element satisfies the condition.
	 * All remain elements will not be checked allMatch() return true if all
	 * elements satisfy the condition. All remain elements will not be checked
	 * noneMatch() return true if all elements do not satisfy the condition. All
	 * remain elements will not be checked
	 */

	public static void xxxMatchStream() {
		List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
		boolean result = data.stream().anyMatch((s) -> s.equalsIgnoreCase("Java"));
		System.out.println("Any match Java: " + result);

		result = data.stream().allMatch((s) -> s.equalsIgnoreCase("C++"));
		System.out.println("All match C++: " + result);

		result = data.stream().noneMatch((s) -> s.equalsIgnoreCase("Javascript"));
		System.out.println("None match Javascript: " + result);
	}

	/* count() returns the total of the elements in the Stream */
	public static void countStream() {
		long count = Stream.iterate(1, i -> i + 1).filter(num -> num % 3 == 0).limit(6).count();
		System.out.println("Count = " + count);
	}

	/*
	 * min(), max() accept the argument is a Comparator to the Stream items can
	 * compare and find min or max.
	 */

	/* Using min() max() for the wrapper of primitive types */

	public static void minMaxPrimitiveTypesStream() {
		Integer[] numbers = { 1, 8, 3, 4, 5, 7, 9, 6 };

		// Find max, min with Array ====================

		// Max = 9
		Integer maxNumber = Stream.of(numbers).max(Comparator.comparing(Integer::valueOf)).get();

		// Min = 1
		Integer minNumber = Stream.of(numbers).min(Comparator.comparing(Integer::valueOf)).get();

		// Find max, min with Collection ====================
		List<Integer> listOfIntegers = Arrays.asList(numbers);

		// Max = 9
		Integer max = listOfIntegers.stream().mapToInt(v -> v).max().getAsInt();

		// Min = 1
		Integer min = listOfIntegers.stream().mapToInt(v -> v).min().getAsInt();

		System.out.println(maxNumber + "---" + minNumber + "---" + max + "---" + min);
	}

	/* Using min() max() for the objects */

	static class Programing {
		private String name;
		private int exp;

		public Programing(String name, int age) {
			super();
			this.name = name;
			this.exp = age;
		}

		public String getName() {
			return name;
		}

		public int getExp() {
			return exp;
		}
	}

	public static void minMaxObjectsStream() {
		List<Programing> students = Arrays.asList( //
				new Programing("Java", 5), //
				new Programing("PHP", 2), //
				new Programing("C#", 1) //
		);

		// Max = 5
		Programing maxByExp = students.stream().max(Comparator.comparing(Programing::getExp)).get();

		// Min = 1
		Programing minByExp = students.stream().min(Comparator.comparing(Programing::getExp)).get();
		
		System.out.println(maxByExp + "---" + minByExp);
	}
	
	/*
	 * summaryStatistics() was used to get the count, min, max, sum and average with
	 * numeric dataset.
	 */
	
	public static void summaryStatisticsStream() {
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 10);
		 
		IntSummaryStatistics stats = primes.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("Count: " + stats.getCount());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());
	}
	
	/*
	 * reduce() operation combines the stream elements into one using a
	 * BinaryOperator
	 */
	
	public static void reduceStream() {
		int result = IntStream.of(1,2,3,4).reduce(0, (a, b) -> a + b);
		System.out.println(result);
	}

	public static void main(String[] args) {
		/* Example 1 */
		StreamExample se = new StreamExample();
		se.withoutStream();
		se.withStream();

		/* Example 2 */
		se.primitiveStreamExample();

		/* Example 3 */
		ConvertToStreamExample.streamFromArray();
		ConvertToStreamExample.streamFromCollection();
		ConvertToStreamExample.streamFromGenerate();
		ConvertToStreamExample.streamUsingIterate();
		ConvertToStreamExample.streamUsingRegex();

		/* Example 4 */
		ConvertFromStreamExample.getArrayUsingStreamToArray();
		ConvertFromStreamExample.getCollectionUsingStreamCollection();

		/* Example 5 */
		filterStream();
		limitStream();
		mapStream();
		sortedStream();
		
		/* Example 6 */
		forEachStream();
		collectStream();
		xxxMatchStream();
		countStream();
		minMaxPrimitiveTypesStream();
		minMaxObjectsStream();
		summaryStatisticsStream();
		reduceStream();
	}
}
