package main.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<LocalDate> s14 = LocalDate::now;
		Supplier<LocalDate> s24 = () -> LocalDate.now();
		LocalDate d1 = s14.get();
		LocalDate d2 = s24.get();
		System.out.println(d1);
		System.out.println(d2);
		
		
		Supplier<StringBuilder> s1 = StringBuilder::new;
		
		Supplier<StringBuilder> s2 = () -> new StringBuilder();
		System.out.println(s1.get());
		System.out.println(s2.get());
		
		Supplier<ArrayList<String>> s16 = ArrayList<String>::new;
		ArrayList<String> a1 = s16.get();
		a1.add("lello");
		a1.add("lella");
		
		System.out.println(a1);

		
		Stream<StringBuilder> stream = Stream.generate(StringBuilder::new);
	}


	/*
	 * A Supplier is used when you want to generate or supply values without taking any input.
		The Supplier interface is defi ned as
		@FunctionalInterface public class Supplier<T> {
		public T get();
		}
	 */

}
