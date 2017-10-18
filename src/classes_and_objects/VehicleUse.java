package classes_and_objects;

public class VehicleUse {

	public static void main(String[] args) {
//		Vehicle v = new Vehicle(120);	Cannot instantiate the type Vehicle - Cannot create the objects of an abstract class
//		v.color = "Black";
//		v.setMaxSpeed(10);
//		v.print();
		
//		Vehicle vehicle = new Car(5, 120);	Cannot instantiate the type Car - Cannot create the objects of an abstract class
//		vehicle.print();
//		The method isConvertible() is undefined for the type Vehicle
//		boolean answer = vehicle.isConvertible(); 	
		
//		Car c = new Car(10, 120);	Cannot instantiate the type Car - Cannot create the objects of an abstract class
//		c.color = "Black";
//		c.setMaxSpeed(100);
//		c.print();
		
		Vehicle v = new Toyota();
		v.color = "Black";
		v.setMaxSpeed(180);
		v.print();
		
	}
}
