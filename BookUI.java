package BookManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class BookUI {
	public static void main(String[] args) {
		Book book=new Book();
		ArrayList<Book> list= new ArrayList<Book>();
		Scanner sc=new Scanner(System.in);
		boolean iswork=true;
		while(iswork) {
			System.out.println("Enter your choice : ");
			System.out.println("Enter 1 for add.");
			System.out.println("Enter 2 for show.");
			System.out.println("Enter 3 for update.");
			System.out.println("Enter 4 for delete.");
			System.out.println("Enter 0 for exit.");
			int key = sc.nextInt();
			sc.nextLine();
			if(key==1) {
				System.out.println("Enter your id : ");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the book name : ");
				String name=sc.nextLine();
				System.out.println("Enter the author name :");
				String author=sc.nextLine();
				System.out.println("Enter the price : ");
				double price=sc.nextDouble();
				book=new Book(id,name,author,price);
				list.add(book);
			}else if(key==2) {
				System.out.println(list);
			}else if(key==3) {
				System.out.println("Enter the id : ");
				int id=sc.nextInt();
				sc.nextLine();
				boolean isthere=false;
				for(Book idr:list) {
					if(idr.getId()==id) {
						System.out.println("Enter the book name : ");
						String name=sc.nextLine();
						idr.setName(name);
						System.out.println("Enter the author name :");
						String author=sc.nextLine();
						idr.setAuthor(author);
						System.out.println("Enter the price : ");
						double price=sc.nextDouble();
						idr.setPrice(price);
						isthere=true;
					}
					
				}
				if(!isthere) {
					System.out.println("Not there");
				}
				
			}else if(key==4) {
				System.out.println("Enter the id : ");
				int id=sc.nextInt();
				sc.nextLine();
				
				for(Book idrr:list) {
					if(idrr.getId()==id) {
						
						list.remove(idrr);
						break;
					}
				}
				
			}else if(key==0) {
				iswork=false;
				System.out.println("Thank You!");
			}
		}
	}

}
