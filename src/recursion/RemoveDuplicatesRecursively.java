package recursion;

import java.util.Scanner;

public class RemoveDuplicatesRecursively {
	
	public static String removeConsecutiveDuplicates(String s) {
		String answer = "";
		String smallAnswer = "";
		int i = 0;
		if (s.length() == 1) {
			smallAnswer += s.charAt(i);
		} else if (s.isEmpty()) {
			return s;
		}
		if (s.length() >= 2) {
			while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
				i++;
				continue;
			}
			answer += s.charAt(i);
			smallAnswer = removeConsecutiveDuplicates(s.substring(i + 1));
		} 
		return answer + smallAnswer;
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given a string S, remove consecutive duplicates from it recursively. 
		 
		 Input Format : 
		 String S 
		 
		 Output Format : 
		 Output string 
		 
		 Constraints : 
		 1 <= Length of String S <= 10^3 
		 
		 Sample Input : 
		 aabccba 
		 
		 Sample Output : 
		 abcba
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string with at least 1 consecutive duplicate character: ");
		String str = scanner.next();
		System.out.printf("%s is the new string after removing all the consecutive duplicates from the string %s", removeConsecutiveDuplicates(str), str);
		
	}

}
