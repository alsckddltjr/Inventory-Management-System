import java.util.ArrayList;
import java.util.Scanner;

public class InventoryManager {
	ArrayList<Inventory> inventorys = new ArrayList<Inventory>();
	Scanner input;

	InventoryManager(Scanner input) {
		this.input = input;
	}

	public void addInventory() {
		Inventory Inventory = new Inventory();
		System.out.print("Inventory ID:");
		Inventory.id = input.nextInt();
		System.out.print("Inventory name:");
		Inventory.name = input.next();
		System.out.print("Inventory weight:");
		Inventory.weight = input.nextInt();
		System.out.print("Inventory size:");
		Inventory.size = input.next();
		inventorys.add(Inventory);
	}

	public void deleteInventory() {
		System.out.print("Inventory ID:");
		int inventoryid = input.nextInt();
		int index = -1;
		for (int i = 0; i<inventorys.size(); i++) {
			if(inventorys.get(i).id == inventoryid) {
				index = i;
				break;
			}
		}

		if (index >=0) {
			inventorys.remove(index);
			Inventory.numInventorysRegistered--;
			System.out.println("the inventory "+ inventoryid + "is deleted");
		}
		else {
			System.out.println("the inventory has not been registered");
			return;
		}
	}

	public void editInventory() {
		System.out.print("Inventory ID:");
		int inventoryid = input.nextInt();
		for (int i = 0; i<inventorys.size(); i++) {
			Inventory Inventory = inventorys.get(i);
			if(Inventory.id == inventoryid) {
				int num = -1;
				while (num !=5) {
					System.out.println("** Inventory Info Edit Menu **");
					System.out.println(" 1. Edit Id");
					System.out.println(" 2. Edit Name"); 
					System.out.println(" 3. Edit weight");
					System.out.println(" 4. Edit size");
					System.out.println(" 5. Exit");
					System.out.println("Select one number between 1 - 5:");
					num=input.nextInt();
					if (num == 1) {
						System.out.print("Inventory ID:");
						Inventory.id = input.nextInt();
					}
					else if (num == 2) {
						System.out.print("Inventory name:");
						Inventory.name = input.next();
					}  
					else if (num == 3) {
						System.out.print("Inventory weight:");
						Inventory.weight = input.nextInt();
					}
					else if (num == 4) {
						System.out.print("Inventory size:");
						Inventory.size = input.next();
					}
					else {
						continue;
					}//if
				}//while
				break;
			}//if
		}//for
	}

	public void viewInventorys() {
		//		System.out.print("Inventory ID:");
		//		int inventoryid = input.nextInt();
		System.out.println("# of registered inventorys:" + Inventory.numInventorysRegistered);
		for (int i = 0; i<inventorys.size(); i++) {
			inventorys.get(i).printInfo();		

		}
	}
}
