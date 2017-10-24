package stacks_and_queues;

import java.util.Scanner;

public class BalancedParenthesis {
	public static boolean isBalanced = false;
	
	public static boolean checkBalanced(String exp) throws StackEmptyException {
		int i = 0;
		StackUsingLL<Character> stackLL = new StackUsingLL<>();
		for (i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == ']' || exp.charAt(i) == '}' || exp.charAt(i) == ')') {
				if (exp.charAt(i) == ']') {
					if (!stackLL.isEmpty() && stackLL.top() == '[') {
						stackLL.pop();
						continue;
					} else {
						break;
					}
				} else if (exp.charAt(i) == '}') {
					if (!stackLL.isEmpty() && stackLL.top() == '{') {
						stackLL.pop();
						continue;
					} else {
						break;
					}
				} else if (exp.charAt(i) == ')') {
					if (!stackLL.isEmpty() && stackLL.top() == '(') {
						stackLL.pop();
						continue;
					} else {
						break;
					}
				}
			} else if (exp.charAt(i) == '[' || exp.charAt(i) == '{' || exp.charAt(i) == '(') {
				stackLL.push(exp.charAt(i));
			} else {
				continue;
			}
		}
		if (i == exp.length() && stackLL.isEmpty()) {
			isBalanced = true;
		}
		return isBalanced;
	}
	
	public static void main(String[] args) throws StackEmptyException {
		/*
		 Given a string expression, check if brackets present in the expression are balanced or not. 
		 Brackets are balanced if the bracket which opens last, closes first. 
		 
		 You need to return true if it is balanced, false otherwise. 
		 
		 Sample Input 1 : 
		 { a + [ b+ (c + d)] + (e + f) } 
		 
		 Sample Output 1 : 
		 true 
		 
		 Sample Input 2 : 
		 { a + [ b - c } ] 
		 
		 Sample Output 2 : 
		 false
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string expression with brackets to check if it is balanced: ");
		String strExp = scanner.nextLine();
		System.out.println(checkBalanced(strExp));
	}
}
