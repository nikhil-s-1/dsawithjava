package com.demo.test;

import com.demo.service.SelectionSortDemo;

public class TestSelectionSort {

	public static void main(String[] args) {
		
		int [] arr = new int[8];
		SelectionSortDemo.acceptdata(arr);
		SelectionSortDemo.displayData(arr);
		System.out.println("==============================================");
		SelectionSortDemo.sortAscending(arr);
		SelectionSortDemo.displayData(arr);
		System.out.println("==============================================");
		SelectionSortDemo.sortDescending(arr);
		SelectionSortDemo.displayData(arr);

	}

}
