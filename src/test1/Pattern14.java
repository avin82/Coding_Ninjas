package test1;

import java.util.Scanner;

public class Pattern14 {
	
	public static void main(String[] args) {
		
		/*
		 Zeros and Stars pattern
		 Print the following pattern
		 Pattern for N = 4
		 
		 *000*000*
        	 0*00*00*0
         00*0*0*00
         000***000
         
         Input Format:
         N (Total no. of rows)
         Output Format:
         Pattern in N lines
         
         Sample Input 1:
         
         3
         
         Sample Output 1:
         
         *00*00*
         0*0*0*0
         00***00
         
         Sample Input 2:
         
         5
         
         Sample Output 2:
         
         *0000*0000*
         0*000*000*0
         00*00*00*00	
         000*0*0*000
         0000***0000
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the number of rows to build the pattern: ");
        int n = scanner.nextInt();
        int i = 1, a = 1, b = a + n, c = b + n, count = 0;	//	Total number of columns is value of variable c
            while (i <= n) {
                int j = 1;
                while (j <= c) {
                    if (j == a + count) {
                        System.out.print("*");
                    } else if (j == b) {
                        System.out.print("*");
                    } else if (j == c - count) {
                        System.out.print("*");
                    } else {
                        System.out.print("0");
                    }
                    j++;
                }
                count++;
                System.out.println();
                i++;
            }
	}

}
