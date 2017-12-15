package main.java;

public class TestInterface implements Interface1, Interface2{

	public void example() {
		Interface2.super.method1();
		Interface2.methodStatic();
		Interface1.methodStatic();
		Interface1.super.method1();
	}
	

	@Override
	public void method1() {
		// TODO Auto-generated method stub
	}


	public static void main(String [] args) {
		System.out.println("hello");
		TestInterface i = new TestInterface();
		i.example();
		i.method1();
		Interface1.methodStatic();
	}


	@Override
	public String method3(String a, String b) {
		// TODO Auto-generated method stub
		return null;
	}
}
