package linkedlist;

public class LinkedListUse3 {
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head; 
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
			}
		System.out.println();
		} 
	
	public static void increment(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			temp.data++; temp = temp.next;
			}
		} 
	
	public static void main(String args[]){
		Node<Integer> node1 = new Node<Integer>(10);
		Node<Integer> node2 = new Node<Integer>(20);
		node1.next = node2; 
		increment(node1);
		print(node1); 
		} 
}
