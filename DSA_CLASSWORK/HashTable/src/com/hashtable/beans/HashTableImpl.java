package com.hashtable.beans;

public class HashTableImpl {
	Node[] heads = new Node[5];
	
	public class Node{
		int data;
		Node next;
		public Node() {
			data=0;
			next= null;
		}
		public Node(int val) {
			data = val ;
			next = null;
		}
	}
	
	public boolean insertData(int val ) {
		Node newNode = new Node(val);
		int pos = val % heads.length; //to find out postion by mod opration on 
										//which position we need to store data to get faster.
		if(heads[pos] == null) {
			heads[pos] = newNode;//if not any node present there then just add newNode and put head on the position pointing to that 
			return true;
		}else {
			// if any value is present then we pnly have to insert data so, its easy to add  before firs node 
			newNode.next = heads[pos];//linking with existing list
			heads[pos] = newNode;//pointing head there
			return true;
		}
	}
	
	public void Display() {
		for(int i=0; i<heads.length; i++) {
			Node temp = heads[i];
			while(temp != null) {
				System.out.print(temp.data +"\t");
				temp= temp.next;
			}
			System.out.println("\n===============================\n");
		}
	}
	
	public boolean searchValue(int val) {
		
		for(int i=0; i<heads.length; i++) {
			Node temp = heads[i];
			while(temp!= null) {
				if(temp.data == val ) {
					return true;
				}
				temp = temp.next;
			}
			
		}
		return false;//after traversing whole table if no element is found.
		
	}
}
