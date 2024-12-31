package Day8;

public class Calci {
	int num1;
	int num2;
	
	void add() {
		System.out.println("Add: "+ (num1+num2));
	}
	
	void sub() {
		System.out.println("Sub: "+ (num1-num2));
	}
	
	void mul() {
		System.out.println("Mul: "+ (num1*num2));
	}
	
	void div() {
		System.out.println("Div: "+ (num1/num2));
	}
	
	void modulus() {
		System.out.println("Modulus: "+ (num1%num2));
	}
	public static void main(String[] args) {
		Calci obj = new Calci();
		obj.num1=1057;
		obj.num2=76;
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		obj.modulus();
	}

}
