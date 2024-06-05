package cpm.demo.test;

import com.demo.service.InsertionSortDemo;

public class TestInsertionSort {

	public static void main(String[] args) {
		
		int []arr = new int[5];
		InsertionSortDemo.acceptdata(arr);
		InsertionSortDemo.displayData(arr);
	    InsertionSortDemo.sortAscending(arr);

	}

}
