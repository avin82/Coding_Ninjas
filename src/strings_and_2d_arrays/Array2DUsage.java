package strings_and_2d_arrays;

import java.util.Scanner;

public class Array2DUsage {
	
	public static void main(String[] args) {
		
		int[][] arr2d = new int[3][4];
		System.out.println(arr2d[1][2]);
		arr2d[2][0] = 15;
		System.out.println(arr2d[2][0]);
		
		int arr2dcase2[][] = {{1, 2, 3}, {4, 5, 6}};
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the number of rows: ");
		int rows = scanner.nextInt();
		System.out.print("Please enter the number of columns: ");
		int columns = scanner.nextInt();
		int[][] input = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.printf("Please enter the element for %dth row and %dth column: ", i, j);
				input[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(input[i][j]);
			}
			System.out.println();
		}
	}
}
