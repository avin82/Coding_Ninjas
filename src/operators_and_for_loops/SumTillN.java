package operators_and_for_loops;

import java.util.Scanner;

public class SumTillN {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number to find the sum upto: ");
		int n = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.printf("The sum of numbers upto %d is %d", n, sum);
		
	}

}
