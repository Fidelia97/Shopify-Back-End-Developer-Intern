package shopifyDevIntern;

import java.util.ArrayList;

public class InventoryClass1 {
	
	private int ID_num;
	private String warehouse_name;
	private int num_of_inventory;
	
	InventoryClass1(String whs_name, int inv_num,int ID){
		
		this.warehouse_name = whs_name;
		this.num_of_inventory = inv_num;
		this.ID_num = ID;
		
	}

	public int getID_num() {
		return ID_num;
	}

	public void setID_num(int iD_num) {
		ID_num = iD_num;
	}


	public String getWarehouse_name() {
		return warehouse_name;
	}

	public void setWarehouse_name(String warehouse_name) {
		this.warehouse_name = warehouse_name;
	}

	public int getNum_of_inventory() {
		return num_of_inventory;
	}

	public void setNum_of_inventory(int num_of_inventory) {
		this.num_of_inventory = num_of_inventory;
	}

}
