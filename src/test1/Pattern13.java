package test1;

import java.util.Scanner;

public class Pattern13 {
	
	public static void main(String[] args) {
		/*
		 
		 Number Star pattern
		 Print the following pattern for given number of rows.
		 Input format:
		 Integer N (Total number of rows)
		 Output format:
		 Pattern in N lines
		 Sample Input: 5
		 Sample Output:
		 
		 5432*
		 543*1
		 54*21
		 5*321
		 *4321

		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the number of rows to build the pattern: ");
        int n = scanner.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1, count = n;
            while (j <= n) {
                if (count == i) {
                    System.out.print("*");
                } else {
                    System.out.print(count);
                }
                count--;
                j++;
            }
            System.out.println();
            i++;
        }
	}

}
