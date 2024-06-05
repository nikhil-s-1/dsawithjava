package crud.linkedlist.test;

import java.util.Scanner;

import crud.linkedlist.beans.Product;
import crud.linkedlist.service.LinkedListService;

public class linkedListTest {

	public static void main(String[] args) {
		LinkedListService lservice = new LinkedListService();
		
		Scanner sc=new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("1. add new Product by position\n2. display All\n");
			System.out.println("3. display by id\n4. display by name\n5. delete by id\n");
			System.out.println("6. exit\n choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				lservice.addnewProduct();
				break;
			case 2:
				lservice.displayall();
				break;
			case 3:
				System.out.println("Enter Product Id to Search : ");
				int pid = sc.nextInt();
				Product getP = lservice.searchById(pid);
				if(getP != null) {
					System.out.println(getP);
				}else {
					System.out.println("No Product  found ");
				}
				break;
			case 4:
				System.out.println("Enter Product Name to search");
				String nm=sc.next();
				lservice.displayByName(nm);
				break;
			case 5:
				System.out.println("Enter Product  id");
				int id=sc.nextInt();
				lservice.deleteById(id);
				break;
			case 6:
				sc.close();
				System.out.println("Thank you for visiting...");
				break;
			default:
				break;
			}//end of switch
			
			
		}while(choice!=6);
	}

		
		

	}


