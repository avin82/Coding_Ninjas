package functions;

import java.util.Scanner;

public class IsPrimeFunction {
	
	public static boolean isPrimeNumber(int n) {
		int d = 2;
		if (n < 2) {
			return false;
		} else {
			while (d < n) {
				if (n % d == 0) {
					return false;
				}
				d++;
			}
			return true;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number to check if its Prime or not: ");
		int n = scanner.nextInt();
		System.out.printf("The number %d is Prime: %b", n, isPrimeNumber(n));
		
	}

}
