package stacks_and_queues;

import java.util.Scanner;

public class ReverseStack {
	
	public static void reverseStack(StackUsingLL<Integer> s1, StackUsingLL<Integer> s2) throws StackEmptyException {
		int temp;
		int counter;
		int limiter = s1.size() - 1;
		for (int i = 0; i < s1.size() - 1; i++) {
			counter = i;
			s2.push(s1.pop());
			temp = s2.pop();
			while (counter < limiter) {
				s2.push(s1.pop());
				counter++;
			}
			s1.push(temp);
			while (s2.size() != 0) {
				s1.push(s2.pop());
			}
		}
	}
	
	public static void main(String[] args) throws StackEmptyException {
		/*
		 Reverse a given Stack with the help of another empty stack. Two stacks will be given. 
		 Out of which first contains some integers and second one is empty. You need to reverse 
		 the first one using second stack. Change in the given first stack itself. 
		 
		 Note : You don't need to print or return the stack, just reverse the given stack and it will be printed internally. 
		 
		 Input format : 
		 Line 1 : Size of Stack 
		 Line 2 : Stack elements (separated by space) 
		 
		 Sample Input 1 : 
		 4 
		 1 2 3 4 (4 is at top) 
		 
		 Sample Output 1 : 
		 1 2 3 4 (1 is at top)
		 */
		StackUsingLL<Integer> stack1 = new StackUsingLL<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the size of the stack: ");
		int n = scanner.nextInt();
		System.out.print("Please enter the stack elements separated by space: ");
		for (int i = 0; i < n; i++) {
			stack1.push(scanner.nextInt());
		}
		StackUsingLL<Integer> stack2 = new StackUsingLL<>();
		reverseStack(stack1, stack2);
		while (!stack1.isEmpty()) {
			try {
				System.out.print(stack1.pop() + " ");
			} catch (StackEmptyException e) {
				e.printStackTrace();
			}
		}
	}

}
