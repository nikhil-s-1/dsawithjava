package heapsort.test;

import java.util.Scanner;

import heapsort.heapImp.HeapSortImpl;

public class HeapSortTest {

	public static void main(String[] args) {
		HeapSortImpl hsort = new HeapSortImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		
		hsort.acceptData(arr);
		hsort.sortData(arr);
		hsort.display(arr);
	}

}
