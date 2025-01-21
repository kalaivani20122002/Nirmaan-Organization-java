package Day15;

import java.util.Scanner;

public class Library {
	public static void main(String[] args) {
		Book bk = new Book();
		boolean isWork=true;
		while(isWork) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice :");
			System.out.println("Enter 1 to add  ");
			System.out.println("Enter 2 to update ");
			System.out.println("Enter 3 to show ");
			System.out.println("Enter 4 to delete");
			System.out.println("Enter 0 to Exit");
			int key = sc.nextInt();
			if(key==1) {
				System.out.println("Enter your ID:");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the Book Name:");
				String name=sc.nextLine();
				System.out.println("Enter the Author Name:");
				String author=sc.nextLine();
				System.out.println("Enter the Price:");
				double price=sc.nextDouble();
				bk=new Book(id,name,author,price);
			}else if(key==2) {
				System.out.println("Enter 1 to modify ID : ");
				System.out.println("Enter 2 to modify Book Name : ");
				System.out.println("Enter 3 to modify Author : ");
				System.out.println("Enter 4 to modify Price : ");
				int key1=sc.nextInt();
				if(key1==1) {
					System.out.println("Enter your ID:");
					int id = sc.nextInt();
					bk.setId(id);
					
				}else if(key1==2) {
					sc.nextLine();
					System.out.println("Enter the Book Name:");
					String name=sc.nextLine();
					bk.setName(name);
					
				}else if(key1==3) {
					sc.nextLine();
					System.out.println("Enter the Author Name:");
					String author=sc.nextLine();
					bk.setAuthor(author);
				}else if(key1==4) {
					System.out.println("Enter the Price:");
					double price=sc.nextDouble();
					bk.setPrice(price);
				}else {
					System.out.println("Enter Correct Input");
				}
				
			}else if(key==3) {
				System.out.println(bk);
			}else if(key==0) {
				isWork=false;
				System.out.println("Thank You");
			}
			else {
				System.out.println("Enter Correct Input");
			}
		}
	}

}
