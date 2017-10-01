package classes_and_objects;

public class Car extends Vehicle {
	int numGears;
	boolean isConvertible;
	
	public Car(int numGears, int maxSpeed) {
		super(maxSpeed);	//	For this line to not be used, Super class i.e. Vehicle class should have a default constructor with no arguments.
		this.numGears = numGears;
		System.out.println("In Car Constructor");
	}
	
	public boolean isConvertible() {
		return isConvertible;
	}
	
	public void print() {
		super.print();
		System.out.println("Car numGears : " + numGears);
		System.out.println("Car isConvertible : " + isConvertible);
	}
}
