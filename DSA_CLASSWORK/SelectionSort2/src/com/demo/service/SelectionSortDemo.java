package com.demo.service;

import java.util.Scanner;

public class SelectionSortDemo {

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

		for(int i=0;i<arr.length -1;i++)
		{
			//it find next minimum in arry
			int min_index = findmin(arr,i,arr.length);
			//swap the smallest element in ith position
			int temp = arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
			
		}
	}

	private static int findmin(int[] arr, int start, int end) {
		
		int min=arr[start];
		int min_index = start;
		
		for(int i=start;i<end;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
				min_index=i;
			}
		}
		
		return min_index;
	}

	public static void sortDescending(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++)
		{
			int max_index = findMax(arr,i,arr.length);
			// Swap max no with ith position 
			int temp = arr[i];
			arr[i]=arr[max_index];
			arr[max_index]=temp;
		}
		
	}

	private static int findMax(int[] arr, int start, int end) {
		
		int max=arr[start];
		int max_index=start;
		for(int i=start;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				max_index = i;
			}
		}
		return max_index;
	}
	

}
