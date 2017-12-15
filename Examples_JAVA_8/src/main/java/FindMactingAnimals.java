package main.java;

public class FindMactingAnimals {

	private static void print(Animal animal, CheckTrait trait) {
		if(trait.test(animal))
			System.out.println(animal);
	}

	private static void print( Interface1 trait) {
		System.out.println(trait.method3("HHell", "o"));
	} 

	private static void printPredicate(Animal animal, Predicate2<Animal> trait) {
		if(trait.test(animal))
			System.out.println(animal);
	}


	public static void main(String[] args) {
		print(new Animal("fish",     false, true), a -> a.canSwim());  // (Animal a) -> { return a.canSwim(); }
		print(new Animal("fish",     true, false), a -> a.canHop());
		
		
		
		
		
		print( (a,b) -> a+b);
		print( (a,b) -> b+" "+b);
		//printPredicate( new Animal("topo",     true, true) , a-> a.canHop());
	}

}
