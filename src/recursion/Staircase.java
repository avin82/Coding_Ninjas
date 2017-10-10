package recursion;

import java.util.Scanner;

public class Staircase {
	
	public static int staircase(int n) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		return staircase(n - 1) + staircase(n - 2) + staircase(n - 3);
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. 
		 Implement a method to count how many possible ways the child can run up to the stairs. You need to return 
		 number of possible ways W. 
		 
		 Input format : 
		 Line 1 : Integer N (No. of steps) 
		 
		 Output Format : 
		 Line 1 : Integer W i.e. Number of possible ways 
		 
		 Constraint : 
		 (1 <= N <= 30) 
		 
		 Sample Input 1: 
		 4 
		 
		 Sample Output : 
		 7
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the number of steps say n on a staircase that the child needs to climb: ");
		int n = scanner.nextInt();
		System.out.printf("There are %d number of ways that the child can climb a staircase of %d steps "
				+ "by hopping 1 step, 2 steps or 3 steps at a time.", staircase(n), n);
	}

}