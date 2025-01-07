package Day11;

import java.util.Scanner;

public class Foreach {
	
	
	public int num =10;
	boolean IsValid(int age) {
		if((age>=18) && (age<=100)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Foreach fe = new Foreach();
		//array declaration
		int [] nums = {10,29,47,487,474,74};
		for (int num:nums) {
			System.out.println(num);
		}
		
		// array declaring another metod//
		int[] numbers=new int[5];
		numbers[0]=1097;
		numbers[1]=8598;
		numbers[2]=1047;
		numbers[3]=1064;
		numbers[4]=1059;
		int total=0;
		for(int number:numbers) {
			total+=number;
		}
		System.out.println(total);
		
		
		//age validation
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		if(fe.IsValid(age)) {
			System.out.println("You are Eligibe.");
		}else {
			System.out.println("You are not Eligible.");
		}
		
	}

}
