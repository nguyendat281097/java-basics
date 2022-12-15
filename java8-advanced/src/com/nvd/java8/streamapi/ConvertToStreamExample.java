package com.nvd.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ConvertToStreamExample {
	public static void streamFromArray() {
		String[] languages = { "Java", "C#", "C++", "PHP", "Javascript" };

		// Get Stream using the Arrays.stream
		Stream<String> languagesStream = Arrays.stream(languages);
		languagesStream.forEach(x -> System.out.println(x));

		// Get Stream using the Stream.of
		Stream<String> languagesStream2 = Stream.of(languages);
		languagesStream2.forEach(x -> System.out.println(x));
	}
	
	// Generate Streams from Collections
	public static void streamFromCollection() {
		List<String> items = new ArrayList<>();
        items.add("Java");
        items.add("C#");
        items.add("C++");
        items.add("PHP");
        items.add("Javascript");
        
        items.stream().forEach(x -> System.out.println(x));
	}
	
	// Generate Streams using Stream.generate()
	public static void streamFromGenerate() {
		Stream<String> stream = Stream.generate(() -> "Java8").limit(3);
		String[] stringArr = stream.toArray(String[]::new);
		System.out.println(Arrays.toString(stringArr));
	}
	
	// Generate Streams using Stream.iterate()
    public static void streamUsingIterate() {
    	Stream<Long> stream = Stream.iterate(1L, n -> n + 1).limit(5);
    	stream.forEach(System.out::print);
    	System.out.println();
    }
    
    // Generate Streams from APIs like Regex
    public static void streamUsingRegex() {
    	String str = "Welcome,to,my,channel,Java";
    	Pattern.compile(",").splitAsStream(str).forEach(System.out::print);
    	System.out.println();
    }
}
