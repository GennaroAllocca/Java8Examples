package main.java;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorMethod {
	public static void main(String args[]) {
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		StringBuilder word = stream.collect(StringBuilder::new,
				StringBuilder::append, StringBuilder::append);
		System.out.println(word);
		
		Stream<String> stream1 = Stream.of("w", "o", "l", "f");
		TreeSet<String> set1 = stream1.collect(TreeSet::new, TreeSet::add,
		TreeSet::addAll);
		System.out.println(set1); // [f, l, o, w]
		
		Stream<String> stream2 = Stream.of("w", "o", "l", "f");
		TreeSet<String> set2 = stream2.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(set2); // [f, l, o, w]
		//If we didn’t need the set to be sorted, we could make the code even shorter:
		Stream<String> stream3 = Stream.of("w", "o", "l", "f");
		Set<String> set3 = stream3.collect(Collectors.toSet());
		System.out.println(set3); // [f, l, o, w]
	}
	
}
