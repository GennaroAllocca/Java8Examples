package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class MergeMap {

	static BiFunction<String, String, String> mapper = (v1, v2)
			-> v1.length() > v2.length() ? v1: v2;
			
public static void main(String[] args) {
	
	Map<String, String> favorites = new HashMap<String, String>();
						favorites.put("Jenny", "Bus Tour");
						favorites.put("Tom", "Tram");

	String jenny  = favorites.merge("Jenny", "Skyride", mapper);
	String tom    = favorites.merge(  "Tom", "Skyride", mapper);

	System.out.println(favorites); // {Tom=Skyride, Jenny=Bus Tour}
	System.out.println(jenny); // Bus Tour
	System.out.println(tom);
	
	List<String> list = new ArrayList<>();
	list.add("Magician"); 
	list.add("Assistant");
	System.out.println(list); // [Magician, Assistant]
	list.removeIf(s -> s.startsWith("A"));
	System.out.println(list); // [Magician]
	
	List<Integer> listp = Arrays.asList(1, 2, 3);
	listp.replaceAll(x -> x*2);
	System.out.println(listp); // [2, 4, 6]
	
	
	
	Map<Integer, Integer> map = new HashMap<>();
	map.put(1, 10);
	map.put(2, 20);
	map.put(3, null);
	map.merge(1, 3, (a,b) -> a + b); //merge(keyMAP, VALUEutilize, lambda-expression)
	map.merge(2, 3, (a,b) -> a * b);
	map.merge(3, 3, (a,b) -> a + b);
	System.out.println(map);
}
			
}
