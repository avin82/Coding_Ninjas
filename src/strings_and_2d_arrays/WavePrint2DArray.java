package strings_and_2d_arrays;

import java.util.Scanner;

public class WavePrint2DArray {
	
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
	
	public static void wavePrint(int[][] arr) {
		for (int i = 0; i < arr[0].length; i++) {
			int j;
			if (i % 2 == 0) {
				for (j = 0; j < arr.length; j++) {
					System.out.print(arr[j][i] + " ");
				}
			} else {
				for (j = arr.length - 1; j >= 0; j--) {
					System.out.print(arr[j][i] + " ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given a two dimensional n*m array, print the array in a sine wave order. i.e. print the first column top to bottom, 
		 next column bottom to top and so on. 
		 
		 Note : Print the elements separated by space.
		 
		 Input Format:
		 Line 1 : Two integers n and m, No. of rows & No. of columns (separated by space) 
		 Next n lines : ith row elements (separated by space)
		 
		 Sample Input:
		 3 4
		 1 2 3 4
		 5 6 7 8
		 9 10 11 12
		 
		 Sample Output:
		 1 5 9 10 6 2 3 7 11 12 8 4
		 
		 */
		int[][] arr = takeInput();
		wavePrint(arr);
	}

}
