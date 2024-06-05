package com.queue.beans;

public class QueueLinkList {

	Node front;
	Node rear;
	public class Node{
		int data;
		Node next;
		public Node() {
			data=0;
			next= null;
		}
		public Node(int val) {
			data = val;
			next= null;
		}
	}
	
	//insertion always happens from end node and deletion always happens from front
	
	public int dequeue() {
		int val =-5;
		if(front == null && rear == null) {
			System.out.println("no node is present");
		}else {
			//if only one node is present
			if(front  == rear){// if only one node is present
				 val = front.data;
				front=null;
				rear= null;
			}else { //deletion in between and last 
				val = front.data;
				Node delNode = front;
				front = front.next;
				delNode.next = null;
				delNode= null;
			}
		}
		return val;
	}
	
	public void enqueue(int val) {
		Node newNode = new Node(val);
		//case 1 if No value is present in the queue.
		if(front == null &&rear == null) {
			front = newNode;
			rear = newNode;
		}else {
			//newNode.next = rear.next;
			rear.next = newNode;
			rear = newNode;
			
		    
		}
	}
	
	public void display() {
		if(front == null && rear == null) {
			System.out.println("Queue is Empty ");
		}else {
			Node temp = front;
			//System.out.println(temp.data);
			while(temp.next != null) {
				System.out.print(temp.data+"\t");
				temp =temp.next;
			}
			System.out.println(temp.data+"\t");
		}
	}
}
