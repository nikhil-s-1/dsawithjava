package com.hashtable.test;

import java.util.Scanner;

import com.hashtable.beans.HashTableImpl;

public class HashTableTest {
	public static void main(String[] args) {
		
	
HashTableImpl htable = new HashTableImpl();
Scanner sc = new Scanner(System.in);
int choice =0;
boolean status = false;
do{
	System.out.println("\nEnter 1 to add new Node \n2.Display whole Table \nSearch For a value");
	choice = sc.nextInt();
	switch(choice) {
	case 1:
		System.out.println("Enter any val to insert in HashTable : ");
		int val = sc.nextInt();
		 status =htable.insertData(val);
		if(status) {
			System.out.println("Added sucessfully.");
		}else {
			System.out.println("Not added sucessfully.");
		}
		
		break;
	case 2: 
		htable.Display();
		break;
	case 3:
		System.out.println("Enter Value To search : ");
		 val = sc.nextInt();
		status = htable.searchValue(val);
		if(status) {
			System.out.println("value found ==>  "+val+"\t");
		}else {
			System.out.println("Value not found. ");
		}
		break;
	case 4:
		System.out.println("exit Thank You.");
	default :
		System.out.println("Enter valid choice ");
	break;
	}
}while(choice != 4);

}
}