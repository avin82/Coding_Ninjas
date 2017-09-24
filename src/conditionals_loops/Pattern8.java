package conditionals_loops;

import java.util.Scanner;

public class Pattern8 {
	
	public static void main(String[] args) {
		
		/*
		 Print the following pattern for the given N number of rows:
		 Pattern for N = 4
		 
		 1
		 11
		 202
		 3003
		 
		 Input Format: Integer N (Total no. of rows)
		 Output Format: Pattern in N lines
		 
		 SampleModel Input: 5
		 SampleModel Output:
		 
		 1
		 11
		 202
		 3003
		 40004
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to build the pattern: ");
		int n = scanner.nextInt();
		int x = 1, y = 0;
		int i = 0;
		while (i < n) {
			if (i < 2) {
				if (i == 0) {
					System.out.print(x);
					System.out.println();
				} else {
					System.out.print(x);
					System.out.print(x);
					System.out.println();
				}
			} else {
				int j = 0;
				while (j <= i) {
					if (j == 0 || j == i) {
						System.out.print(i);
					} else {
						System.out.print(y);
					}
					j++;
				}
				System.out.println();
			}
			i++;
		}
	
	}

}
