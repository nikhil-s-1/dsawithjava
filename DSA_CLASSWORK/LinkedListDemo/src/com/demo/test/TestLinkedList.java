package com.demo.test;

import com.demo.linkedlist.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList mylist=new LinkedList();
		mylist.addNode(5);
		mylist.addNode(12);
		mylist.addNode(3);
		mylist.addNode(5);
		mylist.displaydata();
		System.out.println("\n--------------------\n");
		mylist.addNodebyposition(100, 1);
        mylist.addNodebyposition(200, 3); 
        mylist.displaydata();
	}

}
