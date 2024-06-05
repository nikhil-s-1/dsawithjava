package com.demo.service;

import java.util.Scanner;

public class InsertionSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		System.out.println("Insert data :");
		 acceptData(arr);
		
		
			for(int i=arr.length;i<=1;i++) {
				//value we want to insert into sorted portion
				int key=arr[i]; 
				//j is placed at end of sorted portion
				int j=arr.length-2;
				while(j>=0 && arr[j]>key) {
					arr[j+1]=arr[j];
					j--;
				}
				arr[j+1]=key;
				//displaydata(arr);
			}
			
		displaydata(arr);
		
	}

	private static void acceptData(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
	}

	private static void displaydata(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("===============================");
		System.out.println("\n");
		for(int val : arr) {
			System.out.print(val+"\t");
		}
	}

}
