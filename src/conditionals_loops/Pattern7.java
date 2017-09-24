package conditionals_loops;

import java.util.Scanner;

public class Pattern7 {
	
	public static void main(String[] args) {
		
		/*
		 Print the following pattern for the given N number of rows:
		 Pattern for N = 4
		 
		 1
		 11
		 111
		 1111
		 
		 Input Format: Integer N (Total no. of rows)
		 Output Format: Pattern in N lines
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to build the pattern: ");
		int n = scanner.nextInt();
		int i = 1, val = 1;
		while (i <= n) {
			int j = 1;
			while (j <= i) {
				System.out.print(val);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
