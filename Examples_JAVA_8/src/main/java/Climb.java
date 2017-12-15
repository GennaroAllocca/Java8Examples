package main.java;


public class Climb {
public static void main(String[] args) {
check((h, k) -> false , 6); // x1
}


private static void check(Climber climber, int height) {
if (climber.isTooHigh(height, "lello")) // x2
System.out.println("too high");
else System.out.println("ok");
} }