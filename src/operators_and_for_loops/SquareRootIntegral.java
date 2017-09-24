package operators_and_for_loops;

import java.util.Scanner;

public class SquareRootIntegral {
	
	public static void main(String[] args) {
		
		/*
		 
		 Given a number N, find its square root. You need to find and print only the integral part of square root of N. 
		 For eg. if number given is 18, answer is 4.
		 Input format: 
		 Integer N
		 Output format:
		 Square root of N (integer part of only)
		 Sample Input 1:
		 10
		 Sample Output 1:
		 3
		 Sample Input 2: 
		 4
		 Sample Output:
		 2
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number to find its square root (integral part): ");
		int n = scanner.nextInt();
		//	Starting from 1, try all numbers until i * i is less than or equal to n
		int i = 1, result = 1;
		while (result <= n) {
			//	Base cases
			if (n == 0 || n == 1) {
				System.out.println(n);
				return;
			}
			i++;
			result = i * i;
		}
		System.out.println(i - 1);		
		
	}

}
