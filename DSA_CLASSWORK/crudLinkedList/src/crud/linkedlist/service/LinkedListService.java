package crud.linkedlist.service;

import java.util.Scanner;

import crud.linkedlist.beans.Product;
import crud.linkedlist.dao.SinglyLinkedListProduct;

public class LinkedListService {
	SinglyLinkedListProduct llist = new SinglyLinkedListProduct();
	Scanner sc = new Scanner(System.in);
	public void addnewProduct() {
		System.out.println("enter id");
		int id=sc.nextInt();
		
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter price");
		float price=sc.nextFloat();
		System.out.println("enetr ratings");
		short ratings=sc.nextShort();
		
		System.out.println("---------Enter position to add ----------");
		int pos = sc.nextInt();
		Product p = new Product(id,nm,price,ratings);
		
		llist.addProductByPos(p, pos);
		
	}
	public void displayall() {
		llist.display();//displays all data 
		
	}
	public Product searchById(int pid) {
		
		return llist.seachById(pid);
	}
	public void displayByName(String nm) {
		
		llist.searchByName(nm);
		
	}
	public void deleteById(int id) {
		llist.deleteData(id);
		
	}

}
