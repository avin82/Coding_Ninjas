package patterns;

import java.util.Iterator;
import java.util.Scanner;

public class Pattern1 {
	
	public static void main(String[] args) {
		
		/*
		 * Print the following pattern for a number n where n is input by user. n = 4 for the following pattern.
		 * 1
		 * 1	2
		 * 1	23
		 * 1	234
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to build the pattern: ");
		int n = scanner.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
