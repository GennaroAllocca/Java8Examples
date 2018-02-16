package main.java;

public class AutoCloseableExample  implements AutoCloseable {
	public void close() {
		System.out.println("Close gate");
	}
	public static void main(String[] args) {
		
		try (AutoCloseableExample t = new AutoCloseableExample()) {
			System.out.println("put turkeys in");
		}
	}
}

