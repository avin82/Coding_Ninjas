package classes_and_objects;

public class VehicleUse {

	public static void main(String[] args) {
		Vehicle v = new Vehicle(120);
		v.color = "Black";
		v.setMaxSpeed(10);
		v.print();
		
		Vehicle vehicle = new Car(5, 120);
		vehicle.print();
//		The method isConvertible() is undefined for the type Vehicle
//		boolean answer = vehicle.isConvertible(); 	
		
		Car c = new Car(10, 120);
		c.color = "Black";
		c.setMaxSpeed(100);
		c.print();
	}
}
