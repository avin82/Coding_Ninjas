package classes_and_objects;

public class StudentTest1 {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Arvind", 1231);
//		System.out.println(s1);
		s1.print();
		Student s2 = new Student("Steve", 2323);
//		System.out.println(s2);
//		s2.setRollNumber(-2323);
		s2.print();
		System.out.println(s1);
//		Student s3 = new Student("Mark");
//		s3.print();
//		System.out.println(s1.numStudents);
//		System.out.println(s2.numStudents);
		System.out.println(Student.getNumStudents());
//		System.out.println(s1.getNumStudents());
//		System.out.println(s2.getNumStudents());
//		Student.numStudents = 10;
	}

}
