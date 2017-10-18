package classes_and_objects.temp;

import java.lang.reflect.Method;

import org.omg.CosNaming.NamingContextPackage.CannotProceed;

import classes_and_objects.Vehicle;

public class Truck extends Vehicle {
	int maxLoadingCapacity;
	
	public Truck() {
		super(200);
		System.out.println("In Truck Constructor");
	}
	
	// CannotProceed override Thread final Method from Vehicle
//	public void print() {	
//		System.out.println("Truck Capacity : " + maxLoadingCapacity);
//		System.out.println("Truck color : " + color);
//		System.out.println("Truck Speed : " + getMaxSpeed());
//	}
	@Override
	public boolean isMotorized() {
		return true;
	}
	@Override
	public String getCompany() {
		return "Tata Motors";
	}
}
