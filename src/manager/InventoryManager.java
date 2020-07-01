package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import inventory.MadeinKorea;
import inventory.MadeinChina;
import inventory.MadeinJapan;
import inventory.MadeinUSA;
import inventory.MadeinUK;
import inventory.Inventory;
import inventory.InventoryInput;
import inventory.InventoryKind;

public class InventoryManager implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -2781585612550303374L;
	ArrayList<InventoryInput> inventorys = new ArrayList<InventoryInput>();
	transient Scanner input;
	InventoryManager(Scanner input){
		this.input = input;
	}

	public void addInventory() {
		int kind = 0;
		InventoryInput inventoryInput;
		while(kind < 1 || kind > 5) {
			try {
				System.out.println("1 for MadeinKorea");
				System.out.println("2 for MadeinChina");
				System.out.println("3 for MadeinJapan");
				System.out.println("4 for MadeinUSA");
				System.out.println("5 for MadeinUK");
				System.out.print("Select num for Inventory Kind between 1 and 5:");
				kind = Integer.parseInt(input.nextLine());
				switch(kind) {
				case 1:
					inventoryInput = new MadeinKorea(InventoryKind.MadeinKorea);
					inventoryInput.getUserInput(input);
					inventorys.add(inventoryInput);
					break;
				case 2:
					inventoryInput = new MadeinChina(InventoryKind.MadeinChina);
					inventoryInput.getUserInput(input);
					inventorys.add(inventoryInput);
					break;				
				case 3:
					inventoryInput = new MadeinJapan(InventoryKind.MadeinJapan);
					inventoryInput.getUserInput(input);
					inventorys.add(inventoryInput);
					break;				
				case 4:
					inventoryInput = new MadeinUSA(InventoryKind.MadeinUSA);
					inventoryInput.getUserInput(input);
					inventorys.add(inventoryInput);
					break;				
				case 5:
					inventoryInput = new MadeinUK(InventoryKind.MadeinUK);
					inventoryInput.getUserInput(input);
					inventorys.add(inventoryInput);
					break;				
				default:
					System.out.println("Please put an integer between 1 and 5!");
				}
			}
			catch(NumberFormatException e) {
				System.out.println("Please put an integer between 1 and 5!");
				kind = -1;
			}
		}
	}
	public void deleteInventory() {
		System.out.print("Please enter a inventory: ");
		String name = input.nextLine();
		int index = findIndex(name);
		for (int i = 0; i<inventorys.size(); i++) {
			if (inventorys.get(i).getName().equals(name)) {
				index = i;
				break;
			}
		}
		removefromInventorys(index, name);

	}

	public int findIndex(String name) {
		int index = -1;
		for (int i = 0; i<inventorys.size(); i++) {
			if (inventorys.get(i).getName().equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int removefromInventorys(int index, String name) {
		if(index >= 0) {
			inventorys.remove(index);
			System.out.println("the inventory '" + name + "' is deleted");
			return 1;
		}
		else {
			System.out.println("the inventory has not been resistered");
			return -1;
		}
	}

	public void editInventory() {
		System.out.print("Please enter a Name: ");
		String name = input.nextLine();
		for (int i = 0; i<inventorys.size(); i++) {
			InventoryInput inventory = inventorys.get(i);
			if (inventory.getName().equals(name)) {
				int num = -1;
				while(num != 5) {
					try {
						showEditMenu();
						num = Integer.parseInt(input.nextLine());

						switch(num) {
						case 1:
							inventory.setName(input);
							break;
						case 2:
							inventory.setID(input);
							break;
						case 3:
							inventory.setWeight(input);
							break;
						case 4:
							inventory.setSize(input);
							break;
						case 5:
							break;
						default:
							System.out.println("Please put an integer between 1 and 5!");
							continue;
						}
					}
					catch(NumberFormatException e) {
						System.out.println("Please put an integer between 1 and 5!");
						num = -1;
					}
				}
				break;
			}
		}
	}
	public void viewInventorys() {
		System.out.println("# of registered inventorys:" + inventorys.size());
		for (int i = 0; i<inventorys.size(); i++) {
			inventorys.get(i).prinitInfo();
			System.out.println();
		}
	}

	public int size() {
		return inventorys.size();
	}

	public InventoryInput get(int index) {
		return inventorys.get(index);
	}

	public void showEditMenu() {
		System.out.println("** Inventory Info Edit Menu **");
		System.out.println(" 1. Edit Name");
		System.out.println(" 2. Edit ID");
		System.out.println(" 3. Edit Weight");
		System.out.println(" 4. Edit Size");
		System.out.println(" 5. Exit");
		System.out.print("Select one number between 1 - 5:");
	}
	public void setScanner(Scanner input) {
		this.input = input;
	}
}


