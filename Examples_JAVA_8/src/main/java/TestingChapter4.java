package main.java;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestingChapter4 {
	public static void main(String [] arg) {
//		Stream<String> stream = Stream.iterate("9", (s) -> s + "1");
//		stream.limit(2)
//				.map(x -> x +"2" +"3")
//				.forEach(System.out::println);
		
//		Predicate<? super String> predicate = so -> so.startsWith("g");
//		Stream<String> stream1 = Stream.generate(() -> "growl! ");
//		Stream<String> stream2 = Stream.generate(() -> "rogwl! ");
//		boolean b1 = stream1.anyMatch(predicate);
//		boolean b2 = stream2.allMatch(predicate);//una volta che trova il match non si ferma piu
//		System.out.println(b1 + " " + b2);
		
		Predicate<? super String> predicatel = s -> s.length() > 3;
		Stream<String> stream12 = Stream.iterate("-", (s) -> s + s);
		boolean b1l = stream12.noneMatch(predicatel);
		System.out.println(b1l + " ");
	}

}
