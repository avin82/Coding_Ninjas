package conditionals_loops;

import java.util.Scanner;

public class CalculateSalary {
	
	public static void main(String[] args) {
		
		/*
		 * Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) 
		 * and the grade (an uppercase character), and depending upon which the total salary is calculated as -
		 * totalSalary = basic + hra + da + allow - pf
		 * where:
		 * hra = 20% of basic 
		 * da = 50% of basic 
		 * allow = 1700 if grade = ‘A’ 
		 * allow = 1500 if grade = ‘B’ 
		 * allow = 1300 if grade = ‘C' or any other character 
		 * pf = 11% of basic.
		 * 
		 * Round off the total salary and then print the integral part only.
		 * 
		 * Sample Input 1: 10000 A, Sample Output: 17600
		 * Sample Input 2: 4567 B, Sample Output: 8762
		 */
		
		Scanner scanner = new Scanner(System.in);
		int basic;
		char grade;
		double allow = 0;
		System.out.print("Please enter the basic salary (an integer) and the grade (an upper case character 'A' or 'B' or 'C') "
					   + "separated by a space: ");
		basic = Integer.parseInt(scanner.next());
		grade = scanner.next().charAt(0);
		switch (grade) {
		case 'A':
			allow = 1700;
			break;
		case 'B':
			allow = 1500;
			break;
		case 'C':
			allow = 1300;
			break;
		default:
			allow = 1300;
			}
		
		double hra = (20.0 / 100) * basic;
		double da = (50.0 / 100) * basic;
		double pf = (11.0 /100) * basic;
		double totalSalary = basic + hra + da + allow - pf;
		System.out.println((int)Math.round(totalSalary));
	
	}

}
