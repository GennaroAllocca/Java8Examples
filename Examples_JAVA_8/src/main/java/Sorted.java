package main.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Sorted implements Comparable<Sorted>, Comparator<Sorted> {
	private int num;
	private String text;
	Sorted(int n, String t) {
		this.num = n;
		this.text = t;
	}
	
	public static <T>  T identitya(T t) {
		return t;
		}
	
	
	public String toString() { return "" + num; }
	
	public int compareTo(Sorted s) { return text.compareTo(s.text); }
	
	public int compare(Sorted s1, Sorted s2) { return s1.num - s2.num; }
	
	public static void main(String[] args) {
		Sorted s1 = new Sorted(88, "ca");
		Sorted s2 = new Sorted(55, "cb");
		
		TreeSet<Sorted> t1 = new TreeSet<>();
		t1.add(s1); t1.add(s2);
		
		TreeSet<Sorted> t2 = new TreeSet<>(s1);
		t2.add(s1); t2.add(s2);
		System.out.println(t1 + " " + t2);
	
		
		Comparator<Integer> c = (o1, o2) -> o2 - o1;
		List<Integer> list = Arrays.asList(5, 4, 7, 1);
		Collections.sort(list, c);
		System.out.println(Collections.binarySearch(list, 1));
		System.out.println(list);
		
		
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(12);
		q.remove(1);
		System.out.print(q);
		
		Map m = new HashMap();
		 m.put(123, "456");
		m.put("abc", "def");
		System.out.println(m.containsKey(123));
		
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, null);
		
		map.merge(1, 3, (a,b) -> a + b);
		map.merge(3, 3, (a,b) -> a + b);
		System.out.println(map);

		
	} }
