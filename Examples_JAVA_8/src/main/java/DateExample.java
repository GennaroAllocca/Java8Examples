package main.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;

public class DateExample {
	
	public static void main(String []args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		 System.out.println(date);
		 date = date.plusDays(2);
		 System.out.println(date);
		 date = date.plusWeeks(1);
		 System.out.println(date);
		 date = date.plusMonths(1);
		 System.out.println(date);
		 date = date.plusYears(5);
		 System.out.println(date);
	}

}
