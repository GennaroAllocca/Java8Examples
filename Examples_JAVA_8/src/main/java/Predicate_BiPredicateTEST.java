package main.java;

import java.util.function.BiPredicate;

public class Predicate_BiPredicateTEST {

	public static void main(String [] args) {

		Predicate2<String> p1 = String::isEmpty;
		Predicate2<String> p2 = x -> x.isEmpty();
		
		System.out.println(p1.test(""));
		System.out.println(p2.test(""));
		
		BiPredicate<String, String> b1 = String::startsWith;
		BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
		
		System.out.println(b1.test("uchicken", "U"));
		System.out.println(b2.test("chicken", "chick"));
		
		/*
		 * Predicate is often used when filtering or matching. Both are
			very common operations. A BiPredicate is just like a Predicate except that it takes two
			parameters instead of one.
		 */
	}
}
