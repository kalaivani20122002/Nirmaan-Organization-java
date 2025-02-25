package Multithreading;
class ClassA{
	public void display() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Class A");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ClassB{
	public void display() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Class B");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class multithread3 {
	public static void main(String[] args) {
		ClassA cs1=new ClassA();
		ClassB cs2=new ClassB();
		Thread tr1=new Thread() {
			public void run() {
				cs1.display();
			}
		};
		Thread tr2=new Thread() {
			public void run() {
				cs2.display();
			}
		};
		tr1.start();
		tr2.start();
	}

}
