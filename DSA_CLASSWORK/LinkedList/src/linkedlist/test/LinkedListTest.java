package linkedlist.test;

import linkedlist.beans.LinkedListImpl;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListImpl llist = new LinkedListImpl();
		llist.appendNode(4);
		llist.appendNode(7);
		llist.appendNode(242);
		llist.appendNode(4);
		llist.appendNode(7);
		llist.appendNode(242);

		llist.display();
		
	}

}
