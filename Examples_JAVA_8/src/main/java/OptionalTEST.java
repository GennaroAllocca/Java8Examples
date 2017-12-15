package main.java;

import java.util.Optional;

public class OptionalTEST {

	public static Optional<Double> average(int... scores) {
		if (scores.length == 0) return Optional.empty();
		int sum = 0;
		
		for (int score: scores) sum += score;
		return Optional.of((double) sum / scores.length);
	}

	public static void main(String[] args) {
		Optional<Double> opto = average(90, 100);
		String value = "gennaro";
		Optional o = (value== null) ? Optional.empty(): Optional.of(value);
		opto.ifPresent(System.out::println);  //Consumer
		System.out.println(o);
		
		Optional<Double> opt = average();
		System.out.println(opt.orElse(Double.NaN));  
		System.out.println(opt.orElseGet(() -> Math.random())); //Supplier
		System.out.println(opt.orElseThrow(() -> new IllegalStateException())); //Supplier
		
		/*
		 * returning an Optional is a clear statement in
		the API that there might not be a value in there.
		Another advantage of Optional is that you can use a functional programming 
		style with
		ifPresent() and the other methods rather than needing an if statement. 
		Finally, you’llsee toward the end of the chapter that 
		you can chain Optional calls.
		 */
	
	}

}
