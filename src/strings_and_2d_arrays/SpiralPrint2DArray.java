package strings_and_2d_arrays;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

public class SpiralPrint2DArray {
	
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
	
	public static void spiralPrint(int[][] arr) {
		int rowIndex = 0, columnIndex = 0, i, numOfElementsPrinted = 0;
		int maxRowIndex = arr.length - 1, maxColumnIndex = arr[0].length - 1;
		while (rowIndex < maxRowIndex && columnIndex < maxColumnIndex && numOfElementsPrinted < arr.length * arr[0].length) {
			for (i = columnIndex; i <= maxColumnIndex; i++) {
				System.out.print(arr[rowIndex][i] + " ");
				numOfElementsPrinted++;
			}
			rowIndex++;
			for (i = rowIndex; i <= maxRowIndex; i++) {
				System.out.print(arr[i][maxColumnIndex] + " ");
				numOfElementsPrinted++;
			}
			maxColumnIndex--;
			if (columnIndex < maxColumnIndex) {
				for (i = maxColumnIndex; i >= columnIndex; i--) {
					System.out.print(arr[maxRowIndex][i] + " ");
					numOfElementsPrinted++;
				}
				maxRowIndex--;
			}
			if (rowIndex < maxRowIndex) {
				for (i = maxRowIndex; i >= rowIndex; i--) {
					System.out.print(arr[i][columnIndex] + " ");
					numOfElementsPrinted++;
				}
				columnIndex++;
			}
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given an N*M 2D array, print it in spiral form. That is, first you need to print the 1st row, 
		 then last column, then last row and then first column and so on. 
		 
		 Print every element only once.
		 
		 Input Format:
		 Line 1 : N and M, No. of rows & No. of columns (separated by space) 
		 Next N lines : Each row elements in different lines
		 
		 Sample Input:
		 4 4
		 1 2 3 4
		 5 6 7 8
		 9 10 11 12
		 13 14 15 16
		 
		 Sample Output:
		 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
		 
		 */
		
		int[][] arr = takeInput();
		spiralPrint(arr);
	}

}
