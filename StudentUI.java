package School;

import java.util.Scanner;

public class StudentUI {
	public static void main(String[] args) {
		Student std = new Student();
		
		boolean isWork = true;
		while(isWork) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice : ");
			System.out.println("Enter 1 for add.");
			System.out.println("Enter 2 for update.");
			System.out.println("Enter 3 for show.");
			System.out.println("Enter 0 for exit");
			int key = sc.nextInt();
			sc.nextLine();
			if(key==1) {
				System.out.println("Enter student Id : ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter student Name : ");
				String name = sc.nextLine();
				System.out.println("Enter student Roll No : ");
				long rollno = sc.nextLong();
				System.out.println("Enter student Mobile No : ");
				long mobileno = sc.nextLong();
				std = new Student(id,name,rollno,mobileno);
				}
			else if(key==2) {
				System.out.println("Enter 1 to update ID");
				System.out.println("Enter 2 to update Name");
				System.out.println("Enter 3 to update Roll no");
				System.out.println("Enter 4 to update Mobile no");
				int key1=sc.nextInt();
				sc.nextLine();
				if(key1==1) {
					System.out.println("Enter student Id : ");
					int id = sc.nextInt();
					std.setId(id);
					sc.nextLine();
				}else if(key1==2) {
					System.out.println("Enter student Name : ");
					String name = sc.nextLine();
					std.setName(name);
				}else if(key1==3) {
					System.out.println("Enter student Roll No : ");
					long rollno = sc.nextLong();
					std.setRollno(rollno);
				}else if(key1==4) {
					System.out.println("Enter student Mobile No : ");
					long mobileno = sc.nextLong();
					std.setMobileno(mobileno);
				}else {
					System.out.println("Invalid choice");
				}
				
				}
				else if(key==3) {
					System.out.println(std);
				}
				else if(key==0) {
					System.out.println("Thank You");
					isWork = false;
					
				}
				else {
					System.out.println("Invalid Choice");
				}
			}
		}
		
	}


