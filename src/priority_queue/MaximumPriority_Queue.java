package priority_queue;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumPriority_Queue {
	
	private ArrayList<Integer> heap;
	
	public MaximumPriority_Queue() {
		heap = new ArrayList<>();
	}
	
	public boolean isEmpty() {
		return heap.size() == 0;
	}
	
	public int getSize() {
		return heap.size();
	}
	
	public int getMax() {
		if (isEmpty()) {
			return Integer.MIN_VALUE;
		}
		return heap.get(0);
	}
	
	public void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;
		while (childIndex > 0) {
			if (heap.get(childIndex) > heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}
	
	public int removeMax() {
		if (isEmpty()) {
			return Integer.MIN_VALUE;
		}
		int temp = heap.get(0);
		heap.set(0, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);
		int index = 0;
		int maxIndex = index;
		int leftChildIndex = 1;
		int rightChildIndex = 2;
		while (leftChildIndex < heap.size()) {
			if (heap.get(leftChildIndex) > heap.get(maxIndex)) {
				maxIndex = leftChildIndex;
			}
			if (rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(maxIndex)) {
				maxIndex = rightChildIndex;
			}
			if (maxIndex == index) {
				break;
			} else {
				int temp2 = heap.get(index);
				heap.set(index, heap.get(maxIndex));
				heap.set(maxIndex, temp2);
				index = maxIndex;
				leftChildIndex = 2 * index + 1;
				rightChildIndex = 2 * index + 2;
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		/*
		 Implement the class for Max Priority Queue which includes following functions - 
		 
		 1. getSize - 
		 
		 Return the size of priority queue i.e. number of elements present in the priority queue. 
		 
		 2. isEmpty - 
		 
		 Check if priority queue is empty or not. Return true or false accordingly. 
		 
		 3. insert - 
		 
		 Given an element, insert that element in the priority queue at the correct position. 
		 
		 4. getMax - 
		 
		 Return the maximum element present in the priority queue without deleting. 
		 Return -Infinity if priority queue is empty. 
		 
		 5. removeMax - 
		 
		 Delete and return the maximum element present in the priority queue. 
		 Return -Infinity if priority queue is empty.
		 */
		MaximumPriority_Queue pq = new MaximumPriority_Queue();
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		while(choice != -1) {
			switch(choice) {
				case 1 : // insert
					int element = scanner.nextInt();
					pq.insert(element);
					break;
				case 2 : // getMax
					System.out.println(pq.getMax());
					break;
				case 3 : // removeMax
					System.out.println(pq.removeMax());
					break;
				case 4 : // size
					System.out.println(pq.getSize());
					break;
				case 5 : // isEmpty
					System.out.println(pq.isEmpty());
				default :
					return;
			}
			choice = scanner.nextInt();
		}
	}
}
