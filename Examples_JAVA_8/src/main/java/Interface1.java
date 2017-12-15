package main.java;

public interface Interface1 {
	
	public default void method1() {
		System.out.println("Lello1");
	}
	
	public String method3(String a, String b);
	
	public static void methodStatic() {
		System.out.println("Lello Static");
	}

}
