package classes_and_objects;

public class Student {
	
	public String name;
	//	final data members can be initialized as soon as they are declared
	private final int rollNumber;
	/*
	 * 	 the only two places where you can set a final data member 
	 * 	 is as soon as you are declaring it or inside a constructor
	 * 
	 */
	private static int numStudents;
	
//	public Student(String studentName) {
//		name = studentName;
//	}
	
	public Student(String name, int rollNumber) {
//		System.out.println(this);
		this.name = name;
		this.rollNumber = rollNumber;
		numStudents++;
	}
	
	public static int getNumStudents() {
		return numStudents;
	}
	
//	public void setRollNumber(int rollNum) {
//		if (rollNum <= 0) {
//			return;
//		}
//		rollNumber = rollNum;
//	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public void print() {
		System.out.println(name + " : " + rollNumber);
	}

}
