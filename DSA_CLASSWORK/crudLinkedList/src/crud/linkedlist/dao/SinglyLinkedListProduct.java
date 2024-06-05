package crud.linkedlist.dao;

import crud.linkedlist.beans.Product;

public class SinglyLinkedListProduct {

	public Node head ;
	class Node{
		Product data;
		Node next;
		public  Node(Product pobj) {
			this.data = pobj;
			next = null;
		}
		
	}
	public void addProductByPos(Product pobj ,int  pos) {
		
		if(head == null) {
			Node newNode = new Node(pobj);
			System.out.println("Linked List is Empty ");
			newNode.next =head;
			head = newNode;
		}else  {
			Node newNode = new  Node(pobj);
			
		if(pos <= 1) {	// when we have to add Product at the beginning
			
			newNode.next =  head;
			head = newNode;
		}else { // when we have to add an object at the given position then
			//we just havae to move till pos - 2 because at postion of 3 we add at before 3 postion
			// for that we move temp till pos 1 so form i=0 to 1
			 Node temp = head;
			for( int i=0; i<pos-2 && temp != null ; i++) { // this many times move temp to add before given pos  
				temp = temp.next;
			}
			if(temp!= null) {
			newNode.next = temp.next; // we are assigning temp next address to newNode
			temp.next = newNode;
			}
			
		}
				
		}
	}
		
		//*** display method *****
		public void  display() {
			if(head == null) {
				System.out.println("No Node found in the list");
			}else {
				Node temp = head;
				
				while(temp!= null) {
					System.out.println(temp.data);
					temp = temp.next;
				}
			
			}
		}//end of display function 

		public Product seachById(int pid) {
			if(head == null) {
				System.out.println("LinkedList is Empty");
				return null; // if no data will be found then we are returning null
			}
			Node temp = head ;
			while(temp != null) {
				if(temp.data.getId() == pid) {
					Product p = temp.data;
					return p;
				}
			}
			
			return null;
		}

		public void searchByName(String nm) {
			if(head == null) {
				System.out.println("List is Empty ");
			}else {
				boolean flag = false;
				Node temp = null;
				while(temp != null) {
					if (temp.data.getName().equalsIgnoreCase(nm)) {
						flag= true;
						System.out.println(temp.data);
					}
				}
				
				if(!flag) {
					System.out.println("No Matching data found ");
				}
			}
			
		}

		public void deleteData(int id) {
			
			if(head == null) {
				System.out.println("Data List  is Empty ");
			}else {
				if(head.data.getId() == id) {	//if id matches with first node then 
					Node temp = head;
					head= head.next;
					temp.next = null;
					temp =null;
				}else {
				Node temp = head;
				Node prev = null;
				while(temp!=null && temp.data.getId()==id  ) {
					
					prev= temp;
					temp =temp.next;
					
				}
				prev.next = temp.next;
				temp.next = null;//breaking connection with previous elements
				temp=null; // make ready for gc 
				
			}
			}
		}
		
	
	
}
