package functions;

import java.util.Scanner;

public class FromNChooseR {
	
	public static int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number n from which to choose a group of r numbers: ");
		int n = scanner.nextInt();
		System.out.print("Enter a number r which can be chosen as a group of numbers from n number: ");
		int r = scanner.nextInt();
		
		int numerator = factorial(n);
		int denominator1 = factorial(r);
		int denominator2 = factorial(n - r);
		int fromNChooseR = numerator / (denominator1 * denominator1);
		System.out.printf("There are %d ways of choosing %d numbers from %d numbers.", fromNChooseR, r, n);
	}

}
