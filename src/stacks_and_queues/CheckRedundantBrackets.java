package stacks_and_queues;

import java.util.Scanner;

public class CheckRedundantBrackets {
	
	public static boolean isRedundant = false;
	public static boolean consecutiveStartBrackets = false;
	
	public static boolean checkRedundantBrackets(String input) throws StackEmptyException {
		int i = 0;
		StackUsingLL<Character> stackLL = new StackUsingLL<>();
		for (i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == '(') {
				if (input.charAt(i + 1) == ')') {
					isRedundant = true;
					break;
				} else if (input.charAt(i + 1) == '(') {
					consecutiveStartBrackets = true;
				}
				stackLL.push(input.charAt(i));
			} 
			if (input.charAt(i) == ')') {
				if (input.charAt(i + 1) == ')') {
					if (consecutiveStartBrackets == true) {
						isRedundant = true;
						break;
					}
				} else if (!stackLL.isEmpty() && stackLL.pop() == '(') {
					stackLL.pop();
					continue;
				} else {
					break;
				}
			}
		}
		return isRedundant;
	}
	
	public static void main(String[] args) throws StackEmptyException {
		/*
		 Given a string mathematical expression, return true if redundant brackets are present 
		 in the expression. Brackets are redundant if there is nothing inside the bracket or more 
		 than one pair of brackets are present. 
		 
		 Assume the given string expression is balanced and contains only one type of bracket i.e. (). 
		 
		 Input Format : 
		 String s (Expression) 
		 
		 Output Format : 
		 true or false 
		 
		 Sample Input 1: 
		 ((a + b)) 
		 
		 Sample Output 1: 
		 true 
		 
		 Sample Input 2: 
		 (a+b) 
		 
		 Sample Output 2: 
		 false
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string mathematical expression with brackets "
				+ "to check if it contains redundant brackets: ");
		String strExp = scanner.nextLine();
		System.out.println(checkRedundantBrackets(strExp));
	}

}
