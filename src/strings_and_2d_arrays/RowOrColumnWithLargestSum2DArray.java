package strings_and_2d_arrays;

import java.util.Scanner;

public class RowOrColumnWithLargestSum2DArray {
	
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
	
	public static void rowOrColmnNumWithLargestSum(int[][] arr) {
		int largestSumRow = Integer.MIN_VALUE;
		int rowNumForLargestSum = 0;
		for (int i = 0; i < arr.length; i++) {
			int sumOfRowElements = 0;
			for (int j = 0; j < arr[0].length; j++) {
				sumOfRowElements += arr[i][j];
			}
			if (sumOfRowElements > largestSumRow) {
				largestSumRow = sumOfRowElements;
				rowNumForLargestSum = i;
			} else if (sumOfRowElements == largestSumRow) {
				rowNumForLargestSum = i - 1;
			}
		}
		int largestSumColumn = Integer.MIN_VALUE;
		int columnNumForLargestSum = 0;
		for (int i = 0; i < arr[0].length; i++) {
			int sumOfColumnElements = 0;
			for (int j = 0; j < arr.length; j++) {
				sumOfColumnElements += arr[j][i];
			}
			if (sumOfColumnElements > largestSumColumn) {
				largestSumColumn = sumOfColumnElements;
				columnNumForLargestSum = i;
			} else if (sumOfColumnElements == largestSumColumn) {
				columnNumForLargestSum = i - 1;
			}
		}
		if (largestSumRow > largestSumColumn) {
			System.out.println("row" + " " + rowNumForLargestSum + " " + largestSumRow);
		} else if (largestSumRow == largestSumColumn) {
			System.out.println("row" + " " + rowNumForLargestSum + " " + largestSumRow);
		} else if (largestSumColumn > largestSumRow) {
			System.out.println("column" + " " + columnNumForLargestSum + " " + largestSumColumn);
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given an NxM 2D array, you need to find out which row or column has largest sum (sum of its elements) overall amongst all rows and columns.
		 
		 Input Format:
		 Line 1 : 2 integers N and M respectively, separated by space. 
		 Next N lines will have M integers each separated by spaces.
		 
		 Output Format:
		 If row sum is maximum then - "row" row_num max_sum 
		 If column sum is maximum then - "column" col_num max_sum
		 
		 Note : If there are more than one rows/columns with maximum sum consider the row/column that comes first. 
		 And if ith row and jth column has same sum (which is largest), consider the ith row as answer.
		 
		 Sample Input 1:
		 2 2
		 1 1
		 1 1
		 
		 Sample Output 1:
		 row 0 2
		 
		 Sample Input 2:
		 3 3
		 3 6 9
		 1 4 7
		 2 8 9
		 
		 Sample Output 2:
		 column 2 25
		 
		 */
		
		int[][] arr = takeInput();
		rowOrColmnNumWithLargestSum(arr);
	}

}
