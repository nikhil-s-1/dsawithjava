package heapsort.heapImp;

import java.util.Scanner;

public class HeapSortImpl {
	Scanner sc = new Scanner(System.in);
	public void acceptData(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print("arr[ "+i+" ] = ");
			arr[i]= sc.nextInt();
		}
		
	}
	public void display(int[] arr) {
		for(int val : arr) {
			System.out.println(val+"\t");
		}
		
	}
	public void sortData(int[] arr) {
		//assign value in the n 
		int n = arr.length;
		
		for( int i=n/2 ; i>=0; i++) {
			heapyFy(arr,i,n);
		}
		//swapping last element with indexing
		for(int i = n-1; i>0; i--) {
			int temp = arr[0];
			arr[0]= arr[i];
			arr[i] = temp;
			heapyFy(arr,0,n);
		}
	}
	//heapyfy function will always semd maximum element at the end 
	//swapping largest element at the top of the tree. 
	
	public void  heapyFy(int[] arr , int first, int last) {
		int largest = first;
		int left = 2*first +1;
		int right = 2*first +2;
		
		if(left <last && arr[first] < arr[left] ) {
			first = left;
		}
		if(right < last && arr[first] < arr[right] ) {
			first = right;
		}
	}
	
}
