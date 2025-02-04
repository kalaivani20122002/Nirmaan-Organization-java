package MultipleInterface;

public class UserInterface implements Calculator1{

	@Override
	public void mul(int a, int b) {
		System.out.println("Multiplication  : "+(a*b));
		
	}

	@Override
	public void div(int a, int b) {
		System.out.println("Division  : "+(a/b));
		
	}

	@Override
	public void add(int a, int b) {
		System.out.println("Addition: "+(a+b));
		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("Subtraction : "+(a-b));
		
	}
	public static void main(String[] args) {
		Calculator1.display();
		UserInterface calc =new UserInterface();
		calc.add(78, 67);
		calc.sub(589, 484);
		calc.mul(744, 78);
		calc.div(4746, 47);
		calc.Addition();
		System.out.println(Calculator1.NUM);
		System.out.println(calc.NUM);
		
	}
	

}
