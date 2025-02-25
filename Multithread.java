package Multithreading;


class Class1 extends Thread{
	public void run() {
		for(int i=1; i<=100;i++) {
			System.out.println("Class 1");
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
class Class2 extends Thread{
	public void run() {
		for(int i=1; i<=100;i++) {
			System.out.println("Class 2");
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			
		}
	}
}
public class Multithread {
	
	public static void main(String[] args) {
		Class1 cs1=new Class1();
		Class2 cs2=new Class2();
		cs1.start();
		cs2.start();
	}
}
