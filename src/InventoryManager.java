import java.util.Scanner;

public class InventoryManager {
	Inventory Inventory;
	Scanner input;

	InventoryManager(Scanner input) {
		this.input = input;
	}

	public void addInventory() {
		Inventory = new Inventory();
		System.out.print("Inventory ID:");
		Inventory.id = input.nextInt();
		System.out.print("Inventory name:");
		Inventory.name = input.next();
		System.out.print("Inventory weight:");
		Inventory.weight = input.nextInt();
		System.out.print("Inventory size:");
		Inventory.size = input.next();
	}

	public void deleteInventory() {
		System.out.print("Inventory ID:");
		int inventoryid = input.nextInt();
		if (Inventory == null) {
			System.out.println("the inventory has not been registered");
			return;
		}
		if(Inventory.id == inventoryid) {
			Inventory = null;
			System.out.println("the inventory is deleted");
		}
	}

	public void editInventory() {
		System.out.print("Inventory ID:");
		int inventoryid = input.nextInt();
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
				}
			}
		}
	}

	public void viewInventory() {
		System.out.print("Inventory ID:");
		int inventoryid = input.nextInt();
		if (Inventory.id == inventoryid) {
			Inventory.printInfo();		
		}
	}
}

