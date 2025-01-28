package Inheritance;

public class UserInterface {
	public static void main(String[] args) {
		//Single Inheritance
		Car car = new Car();
		car.startEngine();
		//Multilevel Inheritance
		ElectricCar ec = new ElectricCar();
		ec.drive();
		ec.chargeBattery();
		//Hierarchical Inheritance
		Bike bk = new Bike();
		bk.startEngine();
		bk.kickStart();
		
	}

}
