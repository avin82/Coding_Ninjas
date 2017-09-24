package classes_and_objects;

import java.util.Scanner;

/*
 * Complex Number Class
 * 
 * A ComplexNumber class contains two data members : one is real part (R) and other is imaginary (I) (both integer). 
 * 
 * Implement the Complex numbers class that contains following functions - 
 * 
 * 1. constructor 
 * You need to create the appropriate constructor. 
 * 
 * 2. plus - 
 * This function adds two given complex numbers and updates the first complex number. 
 * 
 * e.g. 
 * 
 * if C1 = 4 + i5 and C2 = 3 +i1 
 * C1.plus(C2) results in: 
 * C1 = 7 + i6 and C2 = 3 + i1 
 * 
 * 3. multiply - 
 * This function multiplies two given complex numbers and updates the first complex number. 
 * 
 * e.g. 
 * 
 * C1 = 4 + i5 and C2 = 1 + i2 
 * C1.multiply(C2) results in: 
 * C1 = -6 + i13 and C2 = 1 + i2 
 * 
 * 4. print - 
 * This function prints the given complex number in the following format : 
 * 
 * a + ib 
 * 
 * Note : There is space before and after '+' (plus sign) and no space between 'i' (iota symbol) and b. 
 * 
 * Input Format : 
 * Line 1 : Two integers - real and imaginary part of 1st complex number 
 * Line 2 : Two integers - real and imaginary part of 2nd complex number 
 * Line 3 : An integer representing choice (1 or 2) (1 represents plus function will be called and 2 represents multiply function will be called) 
 * 
 * Sample Input 1 : 
 * 4 5 
 * 6 7 
 * 1 
 * 
 * Sample Output 1 : 
 * 10 + i12 
 * 
 * Sample Input 2 : 
 * 4 5 
 * 6 7 
 * 2 
 * 
 * Sample Output 2 : 
 * -11 + i58
 */

public class ComplexNumber {
	private int real;
	private int imaginary;
	
	public ComplexNumber(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public int getImaginary() {
		return imaginary;
	}

	public int getReal() {
		return real;	
	}
	
	public void setReal(int real) {
		this.real = real;
	}
	
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	
	public void print() {
		if (this.imaginary < 0) {
			System.out.println(this.real + " - " + "i" + this.imaginary * -1);
		} else {
			System.out.println(this.real + " + " + "i" + this.imaginary);
		}
	}
	
	public void add(ComplexNumber c2) {
		this.real = this.real + c2.getReal();
		this.imaginary = this.imaginary + c2.getImaginary();
	}
	
	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
		int newReal = c1.getReal() + c2.getReal();
		int newImaginary = c1.getImaginary() + c2.getImaginary();
		ComplexNumber c3 = new ComplexNumber(newReal, newImaginary);
		return c3;
	}
	
	public void multiply(ComplexNumber c2) {
		int tempReal = this.real;
		int tempImaginary = this.imaginary;
		this.real = (tempReal * c2.getReal()) - (tempImaginary * c2.getImaginary());
		this.imaginary = (tempReal * c2.getImaginary()) + (tempImaginary * c2.getReal());
	}
	
	public ComplexNumber conjugate() {
		int newReal = this.real;
		int newImaginary = -this.imaginary;
		ComplexNumber c = new ComplexNumber(newReal, newImaginary);
		return c;
	}
	
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the real and imaginary parts (integer values) of first complex number separated by space: ");
		int real1 = scanner.nextInt(); 
		int imaginary1 = scanner.nextInt();
		System.out.println("Please enter the real and imaginary parts (integer values) of second complex number separated by space: ");
		int real2 = scanner.nextInt(); 
		int imaginary2 = scanner.nextInt(); 
		ComplexNumber c1 = new ComplexNumber(real1, imaginary1); 
		ComplexNumber c2 = new ComplexNumber(real2, imaginary2);
		System.out.println("Please enter 1 or 2 as choice of operation where 1 is for add and 2 is for multiply: ");
		int choice = scanner.nextInt(); 
		if(choice == 1) { 
			// Add 
			c1.add(c2); 
			c1.print(); 
		} else if (choice == 2) { 
			// Multiply 
			c1.multiply(c2); 
			c1.print(); 
		} else { 
			return; 
		} 
	}
}
