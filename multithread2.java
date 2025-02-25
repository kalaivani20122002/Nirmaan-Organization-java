package Multithreading;

import java.util.Iterator;

class Class11 implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <=100; i++) {
			System.out.println("Class 1");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}
	
}
class Class22 implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <=100; i++) {
			System.out.println("Class 2");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}
	
}

public class multithread2 {
	public static void main(String[] args) {
		Class11 cs1=new Class11();
		Class22 cs2=new Class22
				();
		Thread tr1=new Thread(cs1);
		Thread tr2=new Thread(cs2);
		tr1.start();
		tr2.start();
	}

}
