package com.demo.service;

import java.util.Scanner;

public class QuickSortDemo {

	public static void acceptData(int[] arr) {
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Data");
			arr[i] = sc.nextInt();
		}
		
	}

	public static void displayData(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println( i +"===> "+arr[i] );
			
		}
		
	}

	public static void sortInAscending(int[] arr, int start, int end) {
		
		if(start<end)
		{
			int p=partation(arr,start,end);
			sortInAscending(arr,start,p-1);
			sortInAscending(arr,p+1,end);
		}
		
	}

	private static int partation(int[] arr, int start, int end) {
		
		int pivot = start;
		int i=start;
		int j=end;
		
		while(i<j)
		{
			while(i<end && arr[i]<=arr[pivot])
				i++;
		    while(j>pivot && arr[j]> arr[pivot])
		    	j--;
		    
		    if(i<j)
		    {
		    	//swapping values at i and j position
		    	int temp= arr[i];
		    	arr[i]=arr[j];
		    	arr[j]=temp;
		    	
		    }
		}
		//swap j and pivot
		int temp = arr[j];
	    arr[j]=arr[pivot];
	    arr[pivot]= temp;
	    System.out.println("pivot "+arr[j]+"is placed at"+j+"position");
	    displayData(arr);
		return j;
	}

	

}
