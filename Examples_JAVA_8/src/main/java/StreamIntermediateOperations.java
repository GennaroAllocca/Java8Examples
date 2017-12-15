package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntermediateOperations {

	public static void main(String [] arg) {

		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		s.filter(x -> x.startsWith("m")).forEach(System.out::println); // monkey

		Stream<String> s1 = Stream.of("duck", "duck", "duck", "goose");
		s1.distinct().forEach(System.out::println); // duckgoose

		Stream<Integer> s3 = Stream.iterate(1, n -> n + 1);
		s3.skip(5).limit(2).forEach(System.out::print); // 67
		System.out.println(" ");
		Stream<String> s4 = Stream.of("monkey", "gorilla", "bonobo");
		s4.map(String::length).forEach(System.out::print); // 676
		System.out.println(" ");

		Stream<String> s5= Stream.of("monkey", "gorilla", "bonobo");
		s5.map(x -> x.length()).forEach(System.out::print); // 676
		System.out.println(" ");

		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla", "Gennaro Gorilla");
		Stream<List<String>> animals = Stream.of( one, zero, two);
		animals.flatMap(l -> l.stream()).forEach(System.out::println);

		Stream<String> s6 = Stream.of("brown-", "bear-");
		s6.sorted().forEach(System.out::print); // bear-brown-

		Stream<String> s7 = Stream.of("brown bear-", "grizzly-");
		s7.sorted(Comparator.reverseOrder())
		.forEach(System.out::print); // grizzly-brown bear-

		Stream<String> stream = Stream.of("gege", "black bear", "brown bear", "grizzly");
		long count = stream.filter(s9 -> s9.startsWith("g"))
				.peek(System.out::println).count(); // grizzly
		System.out.println(count); // 1

		List<Integer> numbers = new ArrayList<>();
		List<Character> letters = new ArrayList<>();
		numbers.add(1);
		letters.add('a');

		StringBuilder builder = new StringBuilder();
		Stream<List<?>> good = Stream.of(numbers, letters);
		good.peek(l -> builder.append(l)).map(List::size).forEach(System.out::print); // 11
		System.out.println(builder); // [1][a]

		Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
		infinite.limit(5)
		.peek(System.out::print)
		.filter(x -> x % 2 == 1)
		.forEach(System.out::println);

		System.out.println("last one");

		Stream.generate(() -> "Elsa")
		.filter(n -> n.length() == 4)
		.limit(2)
		.sorted()
		.forEach(System.out::println);

		Stream<Integer> infinite5 = Stream.iterate(1, x -> x + 1);
		infinite5.limit(5)
		.peek(System.out::print)
		.filter(x -> x % 2 == 1)
		.forEach(System.out::print);
		System.out.println("");
		System.out.println("last one");

		IntStream count2 = IntStream.iterate(6, n -> ++n).limit(3);
		count2.forEach(System.out::println);

		System.out.println("last one");
		List<String> cats = new ArrayList<>();
		cats.add("Annie");
		cats.add("Ripley");
		Stream<String> stream89 = cats.stream();
		cats.add("KC");
		cats.add("KC");
		cats.add("KC");
		cats.add("KC");
		cats.add("KC");
		System.out.println(stream89.count());

		Stream<String> ohMy = Stream.of("lions", "taigers", "tbears");

		TreeSet<String> result = 
				ohMy.filter(sp -> sp.startsWith("t"))
				.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(result); // [tigers]

		Stream<String> ohMyd = Stream.of("lions", "tigers", "bears");
		Map<String, Integer> map = ohMyd.collect(
				Collectors.toMap(se -> se, String::length));
		System.out.println(map);

		Stream<String> ohMyz = Stream.of("lions", "tigers", "bears");
		Map<Integer, String> mapz = 
				ohMyz.collect(
						Collectors.toMap(
								String::length, k -> k,
								(s1z, s2z) -> 
								s1z + "," + s2z));
		System.out.println(mapz); // {5=lions,bears, 6=tigers}
		System.out.println(mapz.getClass()); // class. java.util.HashMap


		Stream<String> ohMyp = Stream.of("lions", "tigers", "bears");
		Map<Integer, List<String>> mapp = ohMyp.collect(
				Collectors.groupingBy(String::length));
		System.out.println(mapp); // {5=[lions, bears], 6=[tigers]}


		Stream<String> ohMyk = Stream.of("lions", "tigers", "bears");
		Map<Boolean, List<String>> mapk = ohMyk.collect(
				Collectors.partitioningBy(sk -> sk.length() <= 5));
		System.out.println(mapk);

		Stream<String> ohMyq = Stream.of("lions", "tigers", "bears");
		Map<Boolean, List<String>> mapq = ohMyq.collect(
				Collectors.partitioningBy(sq -> sq.length() <= 7));
		System.out.println(mapq);

		Stream<String> ohMyui = Stream.of("lions", "tigers", "bears");
		Map<Integer, Optional<Character>> mapm = ohMyui.collect(
				Collectors.groupingBy(
						String::length,
						Collectors.mapping(sm -> sm.charAt(0),
								Collectors.minBy(Comparator.naturalOrder()))));
		System.out.println(map); // {5=Optional[b], 6=Optional[t]}



		Stream<String> ohMyl = Stream.of("lions", "tigers", "bears");
		Map<Integer, Optional<Character>> mapl = ohMyl.collect(
				Collectors.groupingBy(
						String::length,
						Collectors.mapping(sl -> sl.charAt(0),
								Collectors.minBy(Comparator.naturalOrder()))));
		System.out.println(mapl); // {5=Optional[b], 6=Optional[t]}




	}

}
