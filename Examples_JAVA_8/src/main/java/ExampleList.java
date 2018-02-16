package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class ExampleList<T> {
	T t;
	public ExampleList(T t) { this.t = t; }
	public String toString() { return t.toString(); }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		 list.add("one");
		 list.add("two");
		 list.add(7);
//		for (String s: list)
//		System.out.print(s);
		
		 System.out.print(new ExampleList<String>("hi"));
		 System.out.println(new ExampleList("there"));

		 TreeSet<String> tree = new TreeSet<String>();
		 tree.add("one");
		 tree.add("One");
		 tree.add("ONE");
		 System.out.println(tree.ceiling("ON"));
		 System.out.println(tree.size());
		 
		 Map<Integer, Integer> map = new HashMap<>(10);
		 
	}

}

