package main.java;

import java.util.ArrayDeque;

public class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	
	public boolean canHop() { return canHop; }
	
	public boolean canSwim() { return canSwim; }
	
	public String toString() { return species; }
	
	public static void main(String[] args) {
		ArrayDeque<String> greetings = new ArrayDeque<String>();
		greetings.push("hello");
		greetings.push("hi");
		greetings.push("ola");
		
		System.out.println(greetings.pop());
		System.out.println(greetings.peek());
		while (greetings.peek() != null)
		System.out.println(greetings.pop());
		
		System.out.println(greetings);
		
	}
}