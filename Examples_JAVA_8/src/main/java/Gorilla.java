package main.java;

public class Gorilla {
	String walk = "walk";
	int a = 2;
	void everyonePlay(boolean baby) {
		String approach = "amble";
		//approach = "run";
		
		play((a) -> walk);
		play((a) -> baby ? "hitch" : "run");
		play((a) -> "lello");
		play((a) -> approach);
	}
	
	void play(GorillaFamily g) {
		System.out.println(g.move(a));
	}

}
