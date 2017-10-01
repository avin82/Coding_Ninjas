package recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	
	public static int sum(int n) {
		if (n == 1) {
			return 1;
		}
		return n + sum(n - 1);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number n to find the sum of first n natural numbers: ");
		int n = scanner.nextInt();
		System.out.printf("Sum of first %d natural numbers is %d", n, sum(n));
	}

}
