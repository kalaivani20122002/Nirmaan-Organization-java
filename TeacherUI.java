package School;

import java.util.Scanner;

public class TeacherUI {
	public static void main(String[] args) {
		Teacher tech=new Teacher();
		boolean isWork = true;
		while(isWork) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice : ");
			System.out.println("Enter 1 for add.");
			System.out.println("Enter 2 for update.");
			System.out.println("Enter 3 for show.");
			System.out.println("Enter 4 for exit");
			int key = sc.nextInt();
			switch (key) {
			case 1: {
				System.out.println("Enter teacher Id : ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter teacher Name : ");
				String name = sc.nextLine();
				System.out.println("Enter teacher Salary : ");
				long salary = sc.nextLong();
				System.out.println("Enter teacher Mobile No : ");
				long mobileno = sc.nextLong();
				tech = new Teacher(id,name,salary,mobileno);
				break;
				
			}
			case 2:{
				System.out.println("Enter 1 to update ID");
				System.out.println("Enter 2 to update Name");
				System.out.println("Enter 3 to update Salary");
				System.out.println("Enter 4 to update Mobile no");
				int key1=sc.nextInt();
				sc.nextLine();
				if(key1==1) {
					System.out.println("Enter teacher Id : ");
					int id = sc.nextInt();
					tech.setId(id);
					sc.nextLine();
				}else if(key1==2) {
					System.out.println("Enter teacher Name : ");
					String name = sc.nextLine();
					tech.setName(name);
				}else if(key1==3) {
					System.out.println("Enter teacher Salary : ");
					double salary = sc.nextDouble();
					tech.setSalary(salary);
				}else if(key1==4) {
					System.out.println("Enter teacher Mobile No : ");
					long mobileno = sc.nextLong();
					tech.setMobileno(mobileno);
				}else {
					System.out.println("Invalid choice");
				}
				break;
			}
			case 3:{
				System.out.println(tech);
				break;
			}
			case 4:{
				System.out.println("Thank You");
				isWork = false;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + key);
				
			}
		}
	}

}
