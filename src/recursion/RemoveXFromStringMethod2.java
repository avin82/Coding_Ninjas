package recursion;

import java.util.Scanner;

public class RemoveXFromStringMethod2 {
	
	public static String removeX(String str) {
		if (str.length() == 0) {
			return str;
		}
		String answer = "";
		if (str.charAt(0) != 'x') {
			answer += str.charAt(0);
		}
		String smallAnswer = removeX(str.substring(1));
		return answer + smallAnswer;
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given a string, compute recursively a new string where all 'x' chars have been removed. 
		 
		 Sample Input 1 : 
		 xaxb 
		 
		 Sample Output 1: 
		 ab 
		 
		 Sample Input 2 : 
		 abc 
		 
		 Sample Output 2: 
		 abc 
		 
		 Sample Input 3 : 
		 xx 
		 
		 Sample Output 3:
		 
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string containing one or more occurrences of \'x\': ");
		String str = scanner.next();
		System.out.printf("%s is the new string after removing all the occurrences of \'x\' from the string %s", removeX(str), str);
		
	}

}
