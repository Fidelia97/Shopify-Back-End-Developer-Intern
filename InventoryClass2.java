package shopifyDevIntern;

import java.util.ArrayList;
import java.util.Scanner;

public class InventoryClass2 {

	Scanner input = new Scanner(System.in);
	
	ArrayList <InventoryClass1> LogisticsCo = new ArrayList <InventoryClass1>();
	boolean successful;
	public void create_inventory(){
		
	try {
		
		System.out.println("Please enter the name or number of the warehouse");
		String warehouse_name = input.next();
		input.nextLine();
		
		System.out.println("Enter the unique identifier of the warehouse");
		int ID = input.nextInt();
		
		System.out.println("Please enter the amount of inventory");
		int num_of_inventory = input.nextInt();
		
		LogisticsCo.add(new InventoryClass1(warehouse_name, num_of_inventory, ID));
	
		successful = true;
	}
	
	catch(Exception e) {
		if (successful == true) {
		System.out.println("Inventory added successfully.");
		
	}
		else {
			System.out.println("Incorrect name or inventory format. Please try again");
		}
		
		}
	
	}
	
	public void delete_inventory() throws Exception{
		
		for(int i = 0; i < LogisticsCo.size(); i++) {
			
			System.out.println(i + "." + LogisticsCo.get(i).getWarehouse_name());
		}
		
		System.out.println("What inventory would you like to delete?");
		int del_inventory = input.nextInt(); 
		
		LogisticsCo.remove(del_inventory);
		
		if(successful == true) {
			System.out.println("Warehouse inventory successfully deleted.");
		}
		
		else
			throw new Exception("Inventory deletion was unsuccessful.");
	}
	public void modify_inventory() {
	
	for(int i = 0; i < LogisticsCo.size(); i++) {
			
			System.out.println(i + "." + LogisticsCo.get(i).getWarehouse_name());
		}
	try {
	System.out.println("What inventory number would you like to modify?");
	int modify_inventory = input.nextInt(); 
	LogisticsCo.remove(modify_inventory);	
	
	System.out.println("Please enter the name or number of the warehouse under modification");
	String warehouse_name = input.next();
	input.nextLine();
	
	System.out.println("Enter the unique identifier of the warehouse");
	int ID = input.nextInt();
	
	System.out.println("Please enter the amount of inventory");
	int new_inventory_no = input.nextInt();
	
	LogisticsCo.add(new InventoryClass1(warehouse_name, new_inventory_no, ID));
	successful = true;

	}
	
	catch(Exception e) {
		
		if (successful == true) {
			System.out.println("Inventory modified successfully.");
			
		}
			else {
				System.out.println("Incorrect name or inventory format. Please try again");
			}
		
	}
	}
	public void view_inventory(){
		
		System.out.println("Warehouse Name|| Warehouse ID Number|| Number of Inventory");
		
		for (InventoryClass1 Ic1 : LogisticsCo) {
	
			System.out.println(Ic1.getWarehouse_name() + "     ||"+ Ic1.getID_num() + "     ||" + Ic1.getNum_of_inventory());
		
		}
		
	}
}
