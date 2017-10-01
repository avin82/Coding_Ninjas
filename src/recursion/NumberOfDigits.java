package recursion;

import java.util.Scanner;

public class NumberOfDigits {
	
	public static int count(int n) {
		if (n == 0) {
			return 0;
		}
		return count(n / 10) + 1;
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given a number, return the number of digits present in the number recursively. 
		 
		 Input Format : 
		 Integer n 
		 
		 Output Format : 
		 Count of digits 
		 
		 Constraints : 
		 1 <= n <= 10^6 
		 
		 Sample Input : 156 
		 Sample Output : 3
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number to return the number of digits present in the number recursively: ");
		int n = scanner.nextInt();
		System.out.printf("%d digits are present in the number %d", count(n), n);
	}

}
