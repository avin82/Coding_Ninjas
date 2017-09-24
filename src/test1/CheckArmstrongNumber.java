package test1;

import java.util.Scanner;

public class CheckArmstrongNumber {
	
	public static void main(String[] args) {
		
		/*
		 Write a Program to determine if the given number is Armstrong number or not. 
		 Print true if number is armstrong, otherwise print false. 
		 An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.
		 For example, 
		 
		 371, as 3^3 + 7^3 + 1^3 = 371
		 1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
		 
		 Input Format:
		 n
		 Output Format:
		 true or false
		 Sample Input 1:
		 1
		 Sample Output 1:
		 true
		 Sample Input 2:
		 103
		 Sample Output 2:
		 false
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number to check whether it's an armstrong number or not: ");
        int n = scanner.nextInt();
        int numOfDigits = Integer.toString(n).length();
        int i = 0, sumOfPowers = 0, digitToThePowerNumOfDigits = 0;
        while(i < numOfDigits ) {
        	digitToThePowerNumOfDigits = (int)Math.pow(Character.getNumericValue(Integer.toString(n).charAt(i)), numOfDigits);
            sumOfPowers += digitToThePowerNumOfDigits;
            i++;
        }
        if (sumOfPowers == n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
	}

}
