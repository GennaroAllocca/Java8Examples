package main.java;

public interface Interface2 {
	public default void method1() {
		System.out.println("Lello1 Interface2");
	}
	
	public static void methodStatic() {
		System.out.println("Lello Static Interface2");
	}

}
