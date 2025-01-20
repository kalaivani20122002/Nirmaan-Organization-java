package Day14;

public class LibraryManagement {
	public static void main(String[] args) {
		Book per1 = new Book();
		per1.setId(2001);
		per1.setName("Fairy Tale");
		per1.setAuthor("Abraham");
		per1.setPrice("Rs.5000");
		System.out.println(per1.getId());
		System.out.println(per1.getName());
		System.out.println(per1.getAuthor());
		System.out.println(per1.getPrice());
		System.out.println(per1);
		Book per2 = new Book(2002,"Cindrella","Jackson","Rs.3000");
		System.out.println(per2);
		Book per3 = new Book(2003,"Lucifer","Ronaldo","Rs.8000");
		System.out.println(per3);
		
	}

}
