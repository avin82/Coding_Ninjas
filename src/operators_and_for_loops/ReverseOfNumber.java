package operators_and_for_loops;

import java.util.Scanner;

public class ReverseOfNumber {
	
	public static void main(String[] args) {
		
		/*
		 
		 Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
		 Input format: 
		 Integer N
		 Output format:
		 Corresponding reverse
		 Sample Input 1:
		 1234
		 Sample Output 1:
		 4321
		 Sample Input 2: 
		 1980
		 891
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number to find the reverse: ");
		int n = scanner.nextInt();
		String reverse = "";
		for (int i = Integer.toString(n).length(); i >= 1 ; i--) {
			reverse += Integer.toString(n).charAt(i - 1);
		}
		System.out.println(Integer.parseInt(reverse));
	}

}
