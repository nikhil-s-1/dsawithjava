package com.demo.service;

import java.util.Scanner;

public class QuickSortCls {

	Scanner sc = new Scanner(System.in);
	public void accept(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.println("Enter val of "+i +" : ");
			arr[i]=sc.nextInt();
		}
		
		display(arr);
		
	}
	public void display(int[] arr) {
		for(int i=0 ; i<arr.length; i++) {
			System.out.print("arr["+i+"] = "+arr[i]+"\t");
		}
		System.out.println("\n");
		
	}
	public void sortInAccending(int[] arr, int st,int end) {
		if(st<end) {
		int p = setPiot(arr,st, end);
		sortInAccending(arr,st, p-1);
		sortInAccending(arr,p+1, end);
		}
		
	}
	private int setPiot(int[] arr, int st, int end) {
		int piot = st;
		int i=st,j=end;
		
		while(i<j) {
			while( i<end &&  arr[i]<=arr[piot]  ) {
				i++;
			}
			while(j>piot && arr[j] > arr[piot]) {
				j--;
			}
			if(i<j) {
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
			}
		}
		int temp = arr[j];
		arr[j] = arr[piot];
		arr[piot]= temp;
		display(arr);
		return j;
	}
	public void sortInDescending(int[] arr, int start, int end) {
		if(start<end) {
			int p=partation(arr,start,end);
			sortInDescending(arr, start, p-1);
			sortInDescending(arr, p+1, end);
		}
		
	}
	private int partation(int[] arr, int start, int end) {
		int pivot=start;
		int i=start;
		int j=end;
		
		while(i<j)
		{
			while(arr[i]>=arr[pivot] && i<end) {
				i++;
			}
			while(arr[j]<arr[pivot] && j>=pivot)
			{
				j--;
			}
			if(i<j)
			{
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp =arr[j];
		arr[j]=arr[pivot];
		arr[pivot]=temp;
		return j;
	}

}
