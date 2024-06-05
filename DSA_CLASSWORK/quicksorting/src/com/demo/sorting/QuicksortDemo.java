package com.demo.sorting;
import java.util.Scanner;
public class QuicksortDemo {
	public static Scanner sc = new Scanner(System.in);
	public static void acceptData(int[] arr) {
		for(int i=0; i<=arr.length-1;i++) {
			System.out.println("Enter number");
			arr[i]=sc.nextInt();
		}
		}
		public static void displayData(int[] arr) {
		for(int i=0; i<=arr.length; i++) {
			System.out.println("Display Data");
		}
		}
		
		private static int partition(int[] arr,int first, int last) 
		{
			int pivot=first;
			int i=first;
			int j=last;
			
			while(i<j)
			{
				while(i<last && arr[i]<=arr[pivot])
					i++;
				while(j>pivot && arr[j]>arr[pivot])
					j--;
			if(i<j) 
			{
			int	temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
		   }
			}
			int	temp=arr[j];
				arr[j]=arr[pivot];
				arr[pivot]=temp;
				return j;
	}
		
}

