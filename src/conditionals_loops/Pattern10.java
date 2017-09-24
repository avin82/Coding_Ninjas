package conditionals_loops;

import java.util.Scanner;

public class Pattern10 {
	
	public static void main(String[] args) {
		
		/*
		 Print the following pattern for the given N number of rows:
		 Pattern for N = 4
		 
		 1234
		 123
		 12
		 1
		 
		 Input Format: Integer N (Total no. of rows)
		 Output Format: Pattern in N lines
		 
		 SampleModel Input: 5
		 SampleModel Output:
		 
		 12345
		 1234
		 123
		 12
		 1
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to build the pattern: ");
		int n = scanner.nextInt();
		int i = 1, k = n;
		while (i <= n) {
			int j = 1;
			while (j <= k) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
			k--;
		}
	}

}
