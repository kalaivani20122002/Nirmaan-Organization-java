package Day4;
import java.util.Scanner;

public class Forloop {
	public static void main(String[]args) {
	/*for(int i=0;i<10;i++) {
		System.out.println(i);
	}
	for(int j=10;j>=0;j--) {
		System.out.println(j);
	}
	for(int i=1;i<=100;i++) {
		if(i%5==0) {
			System.out.println("kalai");
		}
		else {
			System.out.println(i);
		}
	}
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Table");
	int n = sc.nextInt();
	for(int j=1;j<=10;j++) {
		System.out.println(n + "x" + j+"=" + j*n);
	}*/
		for(int i=1; i<=50;i++) {
			if(i==25) {
				break;
			}else {
				System.out.println(i);
			}
	}
		for(int i=1; i<=50;i++) {
			if(i%5==0) {
				continue;
			}else {
				System.out.println(i);
			}
	}
		for(int i=1;i<=5; i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<=5; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
