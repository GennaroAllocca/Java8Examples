package main.java;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class SwitchClass {

	public static void main(String []args) throws ParseException {

		int dayOfWeek = 5;
		final int dayOfWeekF = 5;
		switch(dayOfWeek) {


		case 0_0:
		case 4 :

		default:
			System.out.println("Weekday");


		case dayOfWeekF:
			System.out.println("Saturday");
			break;
		}

		final int movieRating = 4;
		int badMovie = 9;
		switch(badMovie) {
		case 0:
		case movieRating: System.out.println("Great"); break;
		//case 4:
		default:
		case (int)'a':
		}
		
		Lock lock = new ReentrantLock();
		IntStream.iterate(1, i -> 1).limit(10).parallel().forEach(x -> { // w1
		lock.tryLock(); // w2
		System.out.println("Got Lock!");
		lock.unlock(); // w3
		});
		System.out.print("Finished");
		
		List<Integer> l1 = new ArrayList();
		
		NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
		String value = "444,33";
		System.out.println(nf.parse(value));

	}
}
