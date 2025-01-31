package Day16;

public class Calc implements Calculator{

	@Override
	public void add(int a, int b) {
		System.out.println("Addition "+(a+b));
		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("Subtraction "+(a-b));
		
	}

	@Override
	public void mul(int a, int b) {
		System.out.println("Multiplication "+(a*b));
		
	}

	@Override
	public void div(int a, int b) {
		System.out.println("Division "+(a/b));
		
	}
	public static void main(String[] args) {
		Calc cl=new Calc();
		cl.add(10, 20);
		cl.sub(30, 20);
		cl.mul(20, 300);
		cl.div(50, 5);
	}
	

}
