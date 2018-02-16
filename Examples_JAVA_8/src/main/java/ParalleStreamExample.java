package main.java;

import java.util.Arrays;

public class ParalleStreamExample {

	public static void main(String[] args) {
		Arrays.asList(1,2,3,4,5,6)
		.parallelStream()
		.forEach(s -> System.out.print(s+" "));
		
		System.out.println(" ");
		
		Arrays.asList(1,2,3,4,5,6)
		.parallelStream()
		.forEachOrdered(s -> System.out.print(s+" "));
		
		System.out.println(" ");
		Arrays.asList("jackal","kangaroo","lemur")
		.parallelStream()
		.map(s -> s.toUpperCase())
		.forEach(System.out::println);
		
		System.out.println(" ");
		System.out.println(" ");
		Arrays.asList("jackal","kangaroo","lemur")
		.parallelStream()
		.map(s -> {System.out.println(s); return s.toUpperCase();})
		.forEach(System.out::println);
		
		System.out.println(" ");
		System.out.print(Arrays.asList(1,2,3,4,5,6).parallelStream().findAny().get());
		System.out.println(" ");
		System.out.print(Arrays.asList(1,2,3,4,5,6).stream().findAny().get());
		
		Arrays.asList(1,2,3,4,5,6).stream().unordered().parallel();
		
		System.out.println(" ");
		System.out.println(Arrays.asList('w', 'o', 'l', 'f')
				.stream()
				.reduce("",(c,s1) -> c + s1,
				(s2,s3) -> s2 + s3));
	}

}
