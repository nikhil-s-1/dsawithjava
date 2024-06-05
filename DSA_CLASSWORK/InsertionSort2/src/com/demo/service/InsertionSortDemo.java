package com.demo.service;

import java.util.Scanner;

public class InsertionSortDemo {

public static void acceptdata(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Data");
			arr[i]=sc.nextInt();	
		}	
	}
	public static void displayData(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+"====>"+arr[i]);	
		}	
	}
	public static void sortAscending(int[] arr) {
		
		for(int i=1;i<arr.length;i++)
		{    // value we want to insert in sorted area
			int key=arr[i];
			
			//j is placed at end of sorted element
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				
			}
		}
		
	}
	
}
