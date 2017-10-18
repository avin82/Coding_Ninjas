package classes_and_objects;

public abstract class Car extends Vehicle {
	int numGears;
	boolean isConvertible;
	
	public Car() {
		super(180);
	}
	
	public Car(int numGears, int maxSpeed) {
		super(maxSpeed);	//	For this line to not be used, Super class i.e. Vehicle class should have a default constructor with no arguments.
		this.numGears = numGears;
		System.out.println("In Car Constructor");
	}
	
	@Override
	public boolean isMotorized() {
		return true;
	}
	
	public boolean isConvertible() {
		return isConvertible;
	}
	
	public void printCar() {
		super.print();
		System.out.println("Car numGears : " + numGears);
		System.out.println("Car isConvertible : " + isConvertible);
	}
}
