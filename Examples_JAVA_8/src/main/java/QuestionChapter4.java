package main.java;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class QuestionChapter4 {

	public static void main(String[] args) {
//		Stream<String> stream = Stream.iterate("", (s) -> s + "1");
//		stream.limit(2).map(x -> x + "2").forEach(System.out::print);
//
//		System.out.println(" ");
//		Stream<Integer> s3 = Stream.iterate(1, n -> n + 1);
//		s3.skip(3).limit(4).forEach(System.out::print); // 67
//		System.out.println(" ");
		
		
//		Predicate<? super String> predicate = se -> se.startsWith("p");
//		Stream<String> stream1 = Stream.generate(() -> "g");
//		Stream<String> stream2 = Stream.generate(() -> "g");
//		boolean b1 = stream1.anyMatch(predicate);
//		boolean b2 = stream2.allMatch(predicate);
//		System.out.println(b1 + " " + b2);
//		
		Predicate<? super String> predicated = sd -> sd.length() > 3;
		Stream<String> streamd = Stream.iterate("-", (s) -> s + s);
		boolean b1d = streamd.noneMatch(predicated);
		//boolean b2d = streamd.anyMatch(predicated);
		System.out.println(b1d );
		
	}

}
