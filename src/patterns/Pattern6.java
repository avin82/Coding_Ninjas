package patterns;

import java.util.Scanner;

public class Pattern6 {
	
	public static void main(String[] args) {
		
/*
Print the following pattern: Pattern for N = 4

   *
  ***
 *****
*******

Sample output for N = 3

  *
 ***
*****

*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to build the pattern: ");
		int n = scanner.nextInt();
		int i = 1, count = i;
		while (i <= n) {
			int space = n - i;
			while (space > 0 ) {
				System.out.print(" ");
				space--;
			}
			int j = 1;
			while (j <= count) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			count+= 2;
		}
	}

}
