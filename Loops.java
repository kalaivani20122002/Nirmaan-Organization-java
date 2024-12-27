package Day6;

public class Loops {
	public static void main(String[]args) {
		// print 50 to 1
		for(int i=50; i>=1; i--) {
			System.out.println(i);
		}
		//print odd number from 1 to 100 and count them
		int n= 0;
		
		for(int i=1; i<=100;i++) {
			
			if(i%2==0) {
				continue;
			}else {
				n=n+i;
			}
				
		}
		System.out.println(n);
		//print 3 divisible numbers and count them
		int m=0;
		for(int i=1;i<=30;i++) {
			if(i%3==0) {
				System.out.println(i);
				m=m+i;
			}
		}
		System.out.println(m);
	}

}
