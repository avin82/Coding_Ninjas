package recursion;

import java.util.Scanner;

public class Factorial {
	
	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		int smallAnswer = fact(n - 1);
		return n * smallAnswer;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the number to calculate its factorial: ");
		int n = scanner.nextInt();
		System.out.printf("Factorial of %d is %d%n", n, fact(n));
	}

}
