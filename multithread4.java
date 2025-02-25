package Multithreading;
class ClassC{
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

class ClassD{
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

public class multithread4 {
	public static void main(String[] args) {
		ClassC cs1=new ClassC();
		ClassD cs2=new ClassD();
		Runnable r1=new Runnable() {
			public void run() {
				cs1.display();
			}
		};
		Runnable r2=new Runnable() {
			public void run() {
				cs2.display();
			}
		};
		Thread tr1=new Thread(r1);
		Thread tr2=new Thread(r2);
		tr1.start();
		tr2.start();
	}

}