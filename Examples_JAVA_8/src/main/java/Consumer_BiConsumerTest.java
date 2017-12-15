package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consumer_BiConsumerTest {
	
	public static void main(String [] args) {
		
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println(x);
		c1.accept("Annie");
		c2.accept("Gennaro");
		
		Map<String, Integer> map = new HashMap<>();
		BiConsumer<String, Integer> b1 = map::put;
		BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
		b1.accept("chicken", 7);
		b2.accept("chick", 1);
		System.out.println(map);
		
		Map<String, String> map2 = new HashMap<>();
		BiConsumer<String, String> b12 = map2::put;
		BiConsumer<String, String> b22 = (k, v) -> map2.put(k, v);
		b12.accept("chicken", "Cluck");
		b22.accept("chick", "Tweep");
		System.out.println(map2);
	}
	
	/*
	 * You use a Consumer when you want to do something with a parameter but not return anything.
		BiConsumer does the same thing except that it takes two parameters.
		
		@FunctionalInterface public class Consumer<T> {
		void accept(T t);
		}
		
		@FunctionalInterface public class BiConsumer<T, U> {
		void accept(T t, U u);
		}
	 */

}
