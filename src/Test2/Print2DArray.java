package test2;

import java.util.Scanner;

public class Print2DArray {
	
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
	
	public static void print2DArray(int[][] input) {
		
		/*
		 
		 Given a 2D integer array with n rows and m columns. Print the 0th row from input n times, 
		 1st row n-1 times…..(n-1)th row will be printed 1 time. 
		 
		 Input format : 
		 Line 1 : No of rows(n) & No of columns(m) (separated by space) 
		 Line 2 : Row 1 elements (separated by space) 
		 Line 3 : Row 2 elements (separated by space) 
		 Line 4 : and so on 
		 
		 Sample Input : 
		 3 3 
		 1 2 3 
		 4 5 6 
		 7 8 9 
		 
		 Sample Output : 
		 1 2 3 
		 1 2 3 
		 1 2 3 
		 4 5 6 
		 4 5 6 
		 7 8 9
		 
		 */
		int rowLength = input.length;
		for (int i = 0; i < input.length; i++, rowLength--) {
			for (int x = 0; x < rowLength; x++) {
				for (int j = 0; j < input[0].length; j++) {
					System.out.print(input[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[][] input = takeInput();
		print2DArray(input);
	}

}
