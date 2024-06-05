package com.stack.test;

import java.util.Scanner;

import com.stack.beans.StackLinkListImp;

public class TestStackLinkList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StackLinkListImp lstack = new StackLinkListImp();
		int choice ;
		do {
			System.out.println("1.push \n2.pop \n3.Disply Stack \n4.Exit");
			System.out.println("Enter Choice");
			choice = sc.nextInt();
			switch(choice) {
			
			case 1:
			System.out.println("Enter value");
			int val = sc.nextInt();
			boolean status = lstack.push(val);
			if(status==true)
			{
				System.out.println("Pushed");
			}
			else
			{
				System.out.println("Not Pushed");
			}
			break;
			case 2:
			 int deletedVal  = lstack.pop();
			 System.out.println("deleted value "+deletedVal);
			 break;
			case 3:
			 lstack.display();
			 break;
			 
			 default : System.out.println("Invalid choice");
			}
		
			
		} while (choice!=4);
	}
}
