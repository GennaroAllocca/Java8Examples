package main.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTESTmacthMetod {

	public static void main(String[] args) {


		List<String> list = Arrays.asList("6", "5", "?");
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		
		System.out.println(list.stream().anyMatch(pred)); // true
		System.out.println(list.stream().allMatch(pred)); // false
		System.out.println(list.stream().noneMatch(pred)); // false
		
		Stream<String> infinite = Stream.generate(() -> "chimp");
		
		System.out.println(infinite.anyMatch(pred)); // true
		
		Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
		s.forEach(System.out::print);
		System.out.println("");
		
		Stream<String> stream5 = Stream.of("w", "o", "l", "f");
		String word3 = stream5.reduce("", (s1, c) -> s1 + c);
		System.out.println(word3); // wolf
		
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		String word = stream.reduce("", String::concat);
		System.out.println(word); // wolf
		
		BinaryOperator<Integer> op = (a, b) -> a * b;
		
		Stream<Integer> empty = Stream.empty();
		Stream<Integer> oneElement = Stream.of(3);
		Stream<Integer> threeElements = Stream.of(3, 5, 6);
		
		empty.reduce(op).ifPresent(System.out::print); // no output
		oneElement.reduce(op).ifPresent(System.out::println); // 3
		threeElements.reduce(op).ifPresent(System.out::println); // 90
		
		BinaryOperator<Integer> op8 = (a, b) -> a * b;
		Stream<Integer> stream7 = Stream.of(3, 5, 6, 7);
		System.out.println(stream7.reduce(1, op8, op8)); // 90
		

	}

}
