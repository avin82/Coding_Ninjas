package classes_and_objects.temp;

import classes_and_objects.Vehicle;

public class Truck extends Vehicle {
	int maxLoadingCapacity;
	
	public Truck() {
		super(200);
		System.out.println("In Truck Constructor");
	}
	public void print() {
		System.out.println("Truck Capacity : " + maxLoadingCapacity);
		System.out.println("Truck color : " + color);
		System.out.println("Truck Speed : " + getMaxSpeed());
	}
}
