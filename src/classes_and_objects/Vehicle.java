package classes_and_objects;

public class Vehicle {
	protected String color;
	private int maxSpeed;
	
	public Vehicle(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		System.out.println("In Vehicle Constructor");
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void print() {
		System.out.println("Vehicle color : " + color);
		System.out.println("Vehicle Speed : " + maxSpeed);
	}
	
}
