package main.java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class BoxValueGen<T> {
	 T value;

	 public BoxValueGen(T value) {
	 this.value = value;
	 }
	 public T getValue() {
	 return value;
	 }
	 
	 public void tryList() {
		 List<Integer> source = new ArrayList<>(Arrays.asList(1,2,3,4));
		 List<Integer> fish = new CopyOnWriteArrayList<>(source);
		 List<Integer> mammals = Collections.synchronizedList(source);
		 Set<Integer> birds = new ConcurrentSkipListSet<>();
		 birds.addAll(source);
		 synchronized(new Integer(10)) {
		 for(Integer f: fish) fish.add(4); // c1
		 for(Integer m: mammals) mammals.add(4); // c2
		 for(Integer b: birds) birds.add(5); // c3
		 System.out.println(fish.size()+" "+mammals.size()+" "+birds.size());
		 }
	 }
	 
	 
	 public static void main(String[] args) throws IOException {
		 BoxValueGen<String> one = new BoxValueGen<String>("a string");
		 BoxValueGen<Integer> two = new BoxValueGen<>(123);
	 System.out.println(one.getValue());
	 System.out.println(two.getValue());
	 //one.tryList();
	 
	 Integer x = 10;
	  x++;
	  assert x == null && x >= 13;
	  System.out.println(x);
	 
	Path path1 = Paths.get("C:/testExample","../").resolve(Paths.get(
			 "C:/testExample/reset.txt")).normalize();
			 Path path2 = new File("C:/testExample/reset.txt").toPath().toRealPath();
			 System.out.print(Files.isSameFile(path1,path2));
			 System.out.print(" "+path1.equals(path2));
	 } }