package linkedlist.beans;

public class LinkedListImpl {

	public Node head = null;
	
	public class Node{
		public int data;
		public Node next;
		
		public Node() {
			data = 0;
			next= null;
		}
		public Node(int val) {
			this.data = val ;
			this.next = null;
		}
	}
	
	
	public void appendNode(int val ) {
		// this creating an empty node to add 
		Node newNode = new Node(val);
		if(head == null) { // means no node is present
			head = newNode;
		}else { // if any Node will present then newNode will add at the end.
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			
		}
	}
	
	
	public void display() {
		if(head == null ) {
			System.out.println("Linked List is Empty ");
		}else {
			//if any element is present in the node then we should traverse it 
			//we can traverse an linked list using check next nodes address 
			//we will traverse till node's next will be null.
			Node temp = head;
			while(temp != null) {
				System.out.println("val "+temp.data +"\t");
				temp = temp.next;
			}
		}
	}

}
