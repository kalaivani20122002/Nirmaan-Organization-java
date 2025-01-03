package Day10;

public class Constructor {
	int id;
	String name;
	
	Constructor(int id, String name){
		this.id = id;
		this.name=name;
	}
	
	public Constructor() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Constructor car1 = new Constructor(1001,"Benz");
		Constructor car2 = new Constructor();
		car2.id=1002;
		car2.name="Range Rover";
		System.out.println(car1.id + "   "+ car1.name);
		System.out.println(car2.id + "   "+ car2.name);
		
	}

}