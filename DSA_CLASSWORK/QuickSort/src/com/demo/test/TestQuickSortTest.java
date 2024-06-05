package com.demo.test;

import java.util.Scanner;

import com.demo.service.QuickSortCls;

public class TestQuickSortTest {

	public static void main(String[] args) {
		QuickSortCls qCls = new QuickSortCls(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		
		qCls.accept(arr);
		qCls.sortInAccending(arr,0, arr.length-1);
		qCls.display(arr);
		qCls.sortInDescending(arr,0,arr.length-1);
		qCls.display(arr);
		
	}

}
