package strings_and_2d_arrays;

import java.util.Scanner;import while_loop.SumOfEven1ToN;

public class RowWiseSum2DArray {
	
	public static int[][] takeInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the number of rows and columns separated by space: ");
		int rows = scanner.nextInt();
		int columns = scanner.nextInt();
		int[][] input = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			System.out.printf("Please enter the elements for %dth row separated by space: ", i);
			for (int j = 0; j < columns; j++) {
				input[i][j] = scanner.nextInt();
			}
		}
		return input;
	}
	
	public static void rowWiseSum(int[][] input) {
		int sum;
		for (int i = 0; i < input.length; i++) {
			sum = 0;
			for (int j = 0; j < input[0].length; j++) {
				sum += input[i][j];
			}
			System.out.print(sum + " ");
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given a 2D integer array of size M*N, find and print the sum of ith row elements separated by space.
		 
		 Input Format:
		 Line 1 : Two integers M and N (separated by space) 
		 Next M lines : ith row elements (separated by space)
		 
		 Output Format:
		 Sum of every ith row elements (separated by space)
		 
		 Constraints:
		 1 <= M, N <= 10^3
		 
		 Sample Input:
		 4 2
		 1 2
		 3 4
		 5 6
		 7 8
		 
		 Sample Output:
		 3 7 11 15
		 
		 */
		
		int[][] input = takeInput();
		rowWiseSum(input);
	}

}
