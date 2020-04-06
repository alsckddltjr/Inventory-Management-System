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
			System.out.println("the inventory to be edited is " + inventoryid);
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

