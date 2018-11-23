
public class Module9Polymorphism {
	public static void selection28() {
		System.out.println("Polymorphism: ");

		System.out.println("\t Cat says: ");
		Animal a1 = new Cat();
		a1.makeNoise(); // Prints Meow
		
		System.out.println("\t Dog says: ");
		Animal a2 = new Dog();
		a2.makeNoise(); // Prints Bark
	}
}
