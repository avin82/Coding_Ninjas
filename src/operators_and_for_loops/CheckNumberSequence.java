package operators_and_for_loops;

import java.util.Scanner;

public class CheckNumberSequence {
	
	public static void main(String[] args) {
		
		/*

		 You are given S a sequence of n integers i.e. S = s1, s2, ..., sn. 
		 Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (1 <= i < n) in such a way 
		 that the first part is strictly decreasing while the second is strictly increasing one. 
		 
		 That is, in the sequence if numbers are decreasing, they can start increase at one point. And once number starts increasing, 
		 they cannot decrease at any point further. 
		 
		 Sequence made up of only increasing numbers or only decreasing numbers is a valid sequence. So in both the cases, print true. 
		 You just need to print true/false. No need to split the sequence.
		 
		 Input format:
		 Line 1: Integer n
		 Line 2: n integers (separated by space)
		 Output format:
		 "true" or "false" (without quotes)
		 Sample Input 1:
		 5
		 9 8 4 5 6
		 Sample Output 1:
		 true
		 Sample Input 2:
		 3
		 1 2 3
		 Sample Output 2:
		 true
		 Sample Input 3:
		 3
		 8 7 6
		 Sample Output 3:
		 true
		 Sample Input 4:
		 6
		 8 7 6 5 8 2
		 Sample Output 4:
		 false
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number n which is the length of the sequence: ");
		int n = scanner.nextInt();
		
		String numberSequenceAsString = "";
		System.out.print("Please enter the numbers of the sequence of n integers separated by space: ");
		int i = 0;
		do {
			int j = scanner.nextInt();
			numberSequenceAsString += Integer.toString(j);
			i++;
		} while (i < n);
		
		String decreasingSubSequenceAsString = "";
		String increasingSubSequenceAsString = "";
		int a = 0, b = 0, decrementCount = 0, incrementCount = 0;
		for (a = 0; a + 1 < n; a++) {
			while (Character.getNumericValue(numberSequenceAsString.charAt(a)) > Character.getNumericValue(numberSequenceAsString.charAt(a + 1)) && a <= n - 2) {
				decrementCount++;
				if (decrementCount == 1) {
					decreasingSubSequenceAsString += numberSequenceAsString.charAt(a);
					decreasingSubSequenceAsString += numberSequenceAsString.charAt(a + 1);
				} else {
					decreasingSubSequenceAsString += numberSequenceAsString.charAt(a + 1);
				}
				if (a == n - 2) {
					break;
				}
				a++;		
			}
		}

		for (b = 0; b + 1 < n; b++) {
			while (Character.getNumericValue(numberSequenceAsString.charAt(b)) < Character.getNumericValue(numberSequenceAsString.charAt(b + 1)) && b <= n - 2) {
				incrementCount++;
				if (incrementCount == 1) {
					increasingSubSequenceAsString += numberSequenceAsString.charAt(b);
					increasingSubSequenceAsString += numberSequenceAsString.charAt(b + 1);
				} else {
					increasingSubSequenceAsString += numberSequenceAsString.charAt(b + 1);
				}
				if (b == n - 2) {
					break;
				}
				b++;
			}
		}
		if (numberSequenceAsString.contains(decreasingSubSequenceAsString) && numberSequenceAsString.contains(increasingSubSequenceAsString)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
