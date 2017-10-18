package interfaces;

public class NewCar extends NewVehicle implements CarInterface{

	@Override
	public void print() {
		
	}
	
	@Override
	public int getMaxSpeed() {
		return 180;
	}
	
	@Override
	public String getCompany() {
		return null;
	}
}
