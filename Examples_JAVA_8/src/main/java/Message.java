package main.java;

public abstract class Message {
	public String recipient;
	public abstract void sendMessage(); // method in the Abstract class must be never defined final
	public static void main(String[] args) {
		Message m = new TextMessage();
		m.recipient = "1234567890";
		m.sendMessage();
	}
	static class TextMessage extends Message {
		public final void sendMessage() {
			System.out.println("Text message to " + recipient);
		} } }