package Day9;

import java.util.Scanner;

public class UsrInterface {
	public static void main(String[] args) {
		Calculator calci = new Calculator();
	
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number : ");
		int a1 = sc.nextInt();
		System.out.println("Enter the Second number : ");
		int b1 = sc.nextInt();
		
		
		System.out.println("Addition : " +calci.add(a1, b1));
		System.out.println("Subtraction : "+calci.sub(a1, b1));
		System.out.println("Multiplication : " +calci.mul(a1, b1));
		System.out.println("Division : "+calci.div(a1, b1));
		System.out.println("Modulus : "+calci.mod(a1, b1));
	}

}
