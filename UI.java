package InterfaceTask;

import java.util.Scanner;

public class UI {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.move();
		dog.speak();
		Bird bird=new Bird();
		bird.move();
		bird.speak();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the animal name : ");
		String Name=sc.nextLine();
		System.out.println(Animal.isMammal(Name));
		System.out.println(Animal.CATEGORY);
	}

}
