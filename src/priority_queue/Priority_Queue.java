package priority_queue;

import java.util.ArrayList;
import java.util.Scanner;

public class Priority_Queue {
	
	private ArrayList<Integer> heap;
	
	public Priority_Queue() {
		heap = new ArrayList<>();
	}
	
	public boolean isEmpty() {
		return heap.size() == 0;
	}
	
	public int size() {
		return heap.size();
	}
	
	public int getMin() throws PriorityQueueEmptyException {
		if (isEmpty()) {
			throw new PriorityQueueEmptyException();
		}
		return heap.get(0);
	}
	
	public void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;
		while (childIndex > 0) {
			if (heap.get(childIndex) < heap.get(parentIndex)) {
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
	
	public int removeMin() throws PriorityQueueEmptyException {
		if (isEmpty()) {
			throw new PriorityQueueEmptyException();
		}
		int temp = heap.get(0);
		heap.set(0, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);
		int index = 0;
		int minIndex = index;
		int leftChildIndex = 1;
		int rightChildIndex = 2;
		while (leftChildIndex < heap.size()) {
			if (heap.get(leftChildIndex) < heap.get(minIndex)) {
				minIndex = leftChildIndex;
			}
			if (rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(minIndex)) {
				minIndex = rightChildIndex;
			}
			if (minIndex == index) {
				break;
			} else {
				int temp2 = heap.get(index);
				heap.set(index, heap.get(minIndex));
				heap.set(minIndex, temp2);
				index = minIndex;
				leftChildIndex = 2 * index + 1;
				rightChildIndex = 2 * index + 2;
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		Priority_Queue pq = new Priority_Queue();
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		while(choice != -1) {
			switch(choice) {
				case 1 : // insert
					int element = scanner.nextInt();
					pq.insert(element);
					break;
				case 2 : // getMin
				try {
					System.out.println(pq.getMin());
				} catch (PriorityQueueEmptyException e) {
					return;
				}
					break;
				case 3 : // removeMin
				try {
					System.out.println(pq.removeMin());
				} catch (PriorityQueueEmptyException e) {
					return;
				}
					break;
				case 4 : // size
					System.out.println(pq.size());
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
