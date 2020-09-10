import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the land animal: ");
		
		LandAnimal animal = new LandAnimal(scanner.nextLine());
		
		System.out.println(animal.getSortName() + " extends Animal and LandAnimalInterface interfaces and this object can use methods from both interfaces.\n\n");
		
		animal.drinkWater();
		animal.eat();
		animal.run();
		animal.makeAShelter();
		
		System.out.println("____________________________________________\n");
		
		System.out.print("Enter animal sort who can fly: ");
		
		FlyingAnimal flyAnimal = new FlyingAnimal(scanner.nextLine());
		
		System.out.println(flyAnimal.getSortName() + " extends Animal and FlyingAnimalsInterface interfaces and this object can use methods from both interfaces.\n\n");
		
		flyAnimal.drinkWater();
		flyAnimal.eat();
		flyAnimal.makeANest();
		flyAnimal.spreadTheWings();
		
		System.out.println("\n*** In this example, Interface Segregation Principle (ISP) is not violating Liskov Design Pattern. ***");
		
		
		scanner.close();

	}

}
