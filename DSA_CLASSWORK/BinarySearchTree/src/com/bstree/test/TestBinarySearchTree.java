package com.bstree.test;

import java.util.Scanner;

import com.bstree.beans.BinarySearchTreeImpl;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTreeImpl bsearchtree = new BinarySearchTreeImpl();
		Scanner sc = new Scanner(System.in);
		int val;
		boolean status = false;
		int choice =0;
		do {
			System.out.println("1. Insert New Node \n 2.Display in prefix \n3.Display in postfix"
					+ "\n4. Display in Infix   \n5. Search Given value  \n6. Exit ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter val to insert in binary seach Tree ");
				val  = sc.nextInt(); 
				bsearchtree.inserKey(val);
				if (status ) {
					System.out.println("Element inserted sucessfully. ");
				}else {
					System.out.println("Elements cant insert ");
				}
				break;
			case 2:
				bsearchtree.preOder();
				break;
			
			case 3:
				bsearchtree.postOder();
				break;
			case 4:
				bsearchtree.inOrder();
				break;
			case 5:
				System.out.println("Enter val to insert in binary seach Tree ");
				val = sc.nextInt();
				status = bsearchtree.searchValue(val);
				if (status ) {
					System.out.println("Element found  "+val +"\n");
				}else {
					System.out.println("Element not found . ");
				}
//				
				break;
			case 6:
				System.out.println("Thank You visit again : ");
				break;
			default :
				System.out.println("Enter currect choice : ");
				break;
			}
		
		}while(choice!=6);
		
	}

}
