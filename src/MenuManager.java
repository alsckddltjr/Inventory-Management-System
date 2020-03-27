import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;


		while (num !=6) {
			System.out.println("*** Inventory Management System Menu ***");
			System.out.println(" 1. Add Inventory");
			System.out.println(" 2. Delete Inventory"); 
			System.out.println(" 3. Edit Inventory");
			System.out.println(" 4. View Inventory");
			System.out.println(" 5. Show a menu");
			System.out.println(" 6. Exit");
			System.out.println("Select one number between 1 - 6:");
			num=input.nextInt();
			if (num == 1) {
				addInventory();
			}
			else if (num == 2) {
				deleteInventory();
			}  
			else if (num == 3) {
				editInventory();
			}
			else if (num == 4) {
				viewInventory();
			}
			else {
				continue;
			}
		}
	}
	public static void addInventory() {
		Scanner input = new Scanner(System.in);
		System.out.print("Inventory ID:");
		int inventoryid = input.nextInt();
		System.out.print("Inventory name:");
		String inventoryname = input.next();
		System.out.println(inventoryname);
		System.out.print("Inventory weight:");
		int inventoryweight = input.nextInt();
		System.out.println(inventoryweight);
		System.out.print("Inventory size:");
		String inventorysize = input.next();
	}

	public static void deleteInventory() {
		Scanner input = new Scanner(System.in);
		System.out.print("Inventory ID:");
		int inventoryid = input.nextInt();
	}

	public static void editInventory() {
		Scanner input = new Scanner(System.in);
		System.out.print("Inventory ID:");
		int inventoryid = input.nextInt();
	}


	public static void viewInventory() {
		Scanner input = new Scanner(System.in);
		System.out.print("Inventory ID:");
		int inventoryid = input.nextInt();
	}
}