package com.demo.test;

import java.util.Scanner;

import com.demo.service.SelectionSort;

public class SelectionSortTest {
	public static void main(String[] args) {
		SelectionSort slSort = new SelectionSort();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		slSort.accept(arr);
		slSort.sortInAssending(arr);
		slSort.display(arr);
		System.out.println();
		slSort.sortInDescending(arr);
		slSort.display(arr);
		
		System.out.println("Enter no to find that no of maximum no ");
		int nthTerm = sc.nextInt();
		slSort.FindNthMax(arr,nthTerm);
		
	}

}
