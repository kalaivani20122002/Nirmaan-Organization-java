package Day7;

public class Reverse {
	public static void main(String[]args) {
		// reverse and check palindrome 
		String name = "malayalam";
		String rs = "";
		for(int i=8;i>=0;i--) {
			rs += name.charAt(i);
		}
		
		System.out.println(rs);
		if(name.equals(rs)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
		//implicit
		byte b = 127;
		int i = b;
		System.out.println(i);
		
		//explicit
		int j = 128;
		byte c= (byte)j;
		System.out.println(c);
		
		
		//array
		String fruits[] = {"apple","mango","grapes"};
		for(int k=0;k<fruits.length;k++) {
			System.out.println(fruits[k]);
		}
	}

}
