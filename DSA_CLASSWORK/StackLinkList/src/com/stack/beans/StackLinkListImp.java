package com.stack.beans;

public class StackLinkListImp {
	
	Node top=null;
	public class Node
	{
		int data;
		Node next;
		
		public Node()
		{
			data=0;
			next=null;
		}
		public Node(int val)
		{
			data=val;
			next=null;
		}
	}
	public boolean push(int val) {
		
		Node newNode = new Node(val);
		
		if(top==null) // if no node is present 
		{
			top=newNode;
			
			return true;
		}
		else
		{
			newNode.next=top;
			top=newNode;
			
			return true;
		}
	}	
		public int pop() {
			int val =-8;
			if(top==null) // if no node is present 
			{
				System.out.println("Stack is Empty");
				return val;
			}
			else
			{
				if(top.next==null) //if only one node is present 
				{
					Node forDelete = top;//for putting another pointer to remove value
					top = null;
					val = forDelete.data;
					forDelete = null;// delteing value for gc
					return val;
				}
				else {
					Node forDelete = top;
					top= top.next;
					val = forDelete.data;
					forDelete.next = null;
					forDelete= null;
					return val;
					
				}
			}
		}

		public void  display() {
			if(top ==null) {
				System.out.println("No node is present ");
			}else {
				Node temp = top ;
				while(temp!=null) {
					System.out.println(temp.data);
					temp = temp.next;
				}
			}
		}
}
