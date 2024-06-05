package com.demo.linkedlist;

public class LinkedList {
	public Node head;
	class Node{
		int data;
		Node next;
		public Node() {
			data=0;
			next=null;
		}
		public Node(int val) {
			data=val;
			next=null;
		}
	}
	public void addNodebyposition(int val,int pos) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			//create a new node
			Node newNode=new Node(val);
			//add at the first position, means before head
			if(pos==1) {
				newNode.next=head;
				head=newNode;
			}else {
				//otherwise add at the given position
				Node temp=head;               
				for(int i=0;temp!=null && i<pos-2;i++) {
					temp=temp.next;
				}
				//adding the node after temp, 
				//i.e at the particualr position
				if(temp!=null) {
				   newNode.next=temp.next;
				   temp.next=newNode;
				}
			}
		}
	}
	
	public void addNode(int val) {
		Node newNode=new Node(val);
		//add at the first position if the list is empty
		if(head==null) {//list is empty
			head=newNode;
		}else { //add at the end
			Node temp=head;
			//this loop will place the temp at the last node
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
		
	}
	
	public void displaydata() {
		
		if(head==null) {
			System.out.println("list is empty");
		}
		for(Node temp=head;temp.next!=null;temp=temp.next) {
			System.out.print(temp.data+",");
		}
	}
	

}
