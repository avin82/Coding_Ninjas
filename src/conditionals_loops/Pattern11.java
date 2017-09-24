package conditionals_loops;

import java.util.Scanner;

public class Pattern11 {
	
	public static void main(String[] args) {
		
		/*
		 Print the following pattern for the given N number of rows:
		 Pattern for N = 3
		 
		 A
		 BB
		 CCC
		 
		 Input Format: Integer N (Total no. of rows)
		 Output Format: Pattern in N lines
		 
		 SampleModel Input: 7
		 SampleModel Output:
		 
		 A
		 BB
		 CCC
		 DDDD
		 EEEE
		 FFFFF
		 GGGGGG
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to build the pattern: ");
		int n = scanner.nextInt();
		char a = 'A';
		int i = 1, num = 0;
		while (i <= n) {
			if (i == 1) {
				System.out.println(a);
			} else {
				int j = 1;
				while (j <= i) {
					System.out.print((char)(a + num));
					j++;
				}
				System.out.println();
			}
			num++;
			i++;
		}
		
	}

}
