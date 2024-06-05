package com.demo.test;

import com.demo.service.QuickSortDemo;

public class TestQuickSort {

	public static void main(String[] args) {
		
		int [] arr = new int[5];
		
		QuickSortDemo.acceptData(arr);
		QuickSortDemo.displayData(arr);
		QuickSortDemo.sortInAscending(arr,0,arr.length-1);
		

	}

}
