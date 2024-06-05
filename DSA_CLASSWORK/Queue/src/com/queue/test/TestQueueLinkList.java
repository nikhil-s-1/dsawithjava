package com.queue.test;

import com.queue.beans.QueueLinkList;

public class TestQueueLinkList {

	public static void main(String[] args) {
		
		QueueLinkList qlist = new QueueLinkList();
		qlist.enqueue(4);
		qlist.enqueue(8);
		qlist.display();
		int val= qlist.dequeue();
		 val= qlist.dequeue();
		 val= qlist.dequeue();
		System.out.println(val);

	}

}
