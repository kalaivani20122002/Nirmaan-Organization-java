package MultipleInterface;

public interface Calculator1 extends Calculator2{
	int NUM = 473;
	void add(int a, int b);
	void sub(int a, int b);
	static void display() {
		System.out.println("Calculator : ");
	}
	default void Addition() {
		System.out.println(1749+467+4387);
	}

}
