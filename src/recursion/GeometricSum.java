package recursion;

import java.math.BigDecimal;
import java.util.Scanner;

public class GeometricSum {
	
	public static double sum = 0;
	
	public static double findGeometricSum(int k) {
		if (k >= 0) {
			sum += 1 / Math.pow(2, k);
			k--;
			findGeometricSum(k);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		/*
		 Given k, find the geometric sum i.e. 
		 
		 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
		 
		 using recursion. Return the answer. 
		 
		 Sample Input : 
		 3 
		 
		 Sample Output : 
		 1.875
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an integer k >= 0: ");
		int k = scanner.nextInt();
		System.out.println("Geometric sum is " + findGeometricSum(k));
	}

}
