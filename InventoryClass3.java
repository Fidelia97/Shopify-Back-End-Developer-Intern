package shopifyDevIntern;

import java.util.Scanner;

public class InventoryClass3 {

	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		
		InventoryClass2 iCl2 = new InventoryClass2();
		while(true) {
		System.out.println("Welcome to Logistics Co. What would you like to do?\n");
		System.out.println("1.) Create or add inventory");
		System.out.println("2.) Delete inventory");
		System.out.println("3.) Modify inventory");
		System.out.println("4.) View inventory");
		System.out.println("5.) Quit program");
		int answer = input.nextInt();
		
		switch(answer) {
		
		case 1: iCl2.create_inventory();
		break;
		
		case 2: iCl2.delete_inventory();
		break;

		case 3: iCl2.modify_inventory();
		break;

		case 4: iCl2.view_inventory();
		break;

		case 5: System.out.println("Thank you for using the program. Goodbye.");
			System.exit(0);
			break;
		}
		}
	}

}
