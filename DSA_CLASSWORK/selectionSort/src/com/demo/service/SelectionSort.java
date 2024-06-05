package com.demo.service;

import java.util.Scanner;

public class SelectionSort {

	Scanner sc = new Scanner(System.in);
	
	public void accept(int[] arr) {
	
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[ "+i+" ] = "+i);
			arr[i] = sc.nextInt();
		}
		
	}

	public void display(int[] arr) {
		for(int val : arr) {
			System.out.print(val+"\t");
		}
		
	}

	public void sortInDescending(int[] arr) {
		//to sort in acceding order 
		//in every iteration find maximum no and swap it with that iteration index
		//In selection sort we select that no and finds max no in that arr.
		//we returns maximum no's position
		
		for(int i=0; i<arr.length-1; i++) {
			int pos = findMaxNoPosition(arr,i);
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos]= temp;
		}
	}
	
	public int findMaxNoPosition(int[] arr, int st) {
		int max = arr[st];
		int maxPos = st;
		for (int i=st; i<arr.length; i++) {
			if(arr[i] >max) {
				max = arr[i];
				maxPos = i;
			}
		}
		return maxPos;
	}
	
	
	public void sortInAssending(int[] arr) {
		//to get decending order using selection sort then we have to find min element in every iteration
		//swap that elemment with index values
		for(int i=0; i<arr.length-1; i++) {
			int pos = findMinPos(arr,i);
			int temp = arr[pos];
			arr[pos]= arr[i];
			arr[i]= temp;
		}
		
	}
	
	public int findMinPos(int[] arr, int st) {
		int min = arr[st];
		int minPos = st;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				minPos = i;
			}
		}
		
		
		return minPos;
	}

	public void FindNthMax(int[] arr, int nthTerm) {
		int pos =-1;
		for(int i = 0; i<nthTerm ; i++) {
			pos = findMaxNoPosition(arr,i);
			
		}
		if(pos!= -1)
		System.out.println(nthTerm+" s maz no is "+arr[pos]);
	}
	
	

}
