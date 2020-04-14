import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		InventoryManager inventoryManager = new InventoryManager(input);

		int num = -1;
		while (num !=5) {
			System.out.println("*** Inventory Management System Menu ***");
			System.out.println(" 1. Add Inventory");
			System.out.println(" 2. Delete Inventory"); 
			System.out.println(" 3. Edit Inventory");
			System.out.println(" 4. View Inventorys");
			System.out.println(" 5. Exit");
			System.out.println("Select one number between 1 - 5:");
			num=input.nextInt();
			if (num == 1) {
				inventoryManager.addInventory();
			}
			else if (num == 2) {
				inventoryManager.deleteInventory();
			}  
			else if (num == 3) {
				inventoryManager.editInventory();
			}
			else if (num == 4) {
				inventoryManager.viewInventorys();
			}
			else {
				continue;
			}
		}
	}
}
