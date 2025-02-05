package InterfaceTask;



public class Bird implements Animal{

	@Override
	public void move() {
		System.out.println("The bird flies in the sky.");
		
	}
	public void speak() {
		System.out.println("The bird says:Chirp Chirp!.");
	}
	

}
