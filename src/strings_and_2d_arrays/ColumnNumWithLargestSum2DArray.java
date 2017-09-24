package strings_and_2d_arrays;

import java.util.Scanner;

public class ColumnNumWithLargestSum2DArray {
	
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
	
	public static int colmnNumWithLargestSum(int[][] arr) {
		int largestSum = Integer.MIN_VALUE;
		int columnNumForLargestSum = 0;
		for (int i = 0; i < arr[0].length; i++) {
			int sumOfColumnElements = 0;
			for (int j = 0; j < arr.length; j++) {
				sumOfColumnElements += arr[j][i];
			}
			if (sumOfColumnElements > largestSum) {
				largestSum = sumOfColumnElements;
				columnNumForLargestSum = i;
			}
		}
		return columnNumForLargestSum + 1;
	}
	
	public static void main(String[] args) {
		
		int[][] arr = takeInput();
		System.out.printf("The column number %d has the largest sum in the user entered 2D array.%n", colmnNumWithLargestSum(arr));
	}

}
