package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		InventoryManager inventoryManager = getObject("inventorymanager.ser");
		if(inventoryManager == null) {
			inventoryManager = new InventoryManager(input);
		}
		else {
			inventoryManager.setScanner(input);
		}

		WindowFrame frame = new WindowFrame(inventoryManager);
		selectMenu(input, inventoryManager);
		putObject(inventoryManager, "inventorymanager.ser");
	}

	public static void selectMenu(Scanner input, InventoryManager inventoryManager) {
		int num = -1;


		while(num != 5) {
			try {
				showMenu();
				num = Integer.parseInt(input.nextLine());

				switch(num){
				case 1:
					inventoryManager.addInventory();
					logger.log("add a inventory");
					break;
				case 2:
					inventoryManager.deleteInventory();
					logger.log("delete a inventory");
					break;
				case 3:
					inventoryManager.editInventory();
					logger.log("edit a inventory");
					break;
				case 4:
					inventoryManager.viewInventorys();
					logger.log("view a list of Inventorys");
					break;
				case 5:
					break;
				default:
					System.out.println("Please put an integer between 1 and 5!");
					continue;
				}
			}
			catch(NumberFormatException e){
				System.out.println("Please put an integer between 1 and 5!");
				num = -1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("*** Inventory Management System Menu ***");
		System.out.println(" 1. Add Inventory");
		System.out.println(" 2. Delete Inventory");
		System.out.println(" 3. Edit Inventory");
		System.out.println(" 4. View Inventorys");
		System.out.println(" 5. Exit");
		System.out.print("Select one number between 1 - 5:");
	}

	public static InventoryManager getObject(String filename) {
		InventoryManager inventoryManager = null;



		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			inventoryManager = (InventoryManager) in.readObject();

			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return inventoryManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return inventoryManager;
	}

	public static void putObject(InventoryManager inventoryManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(inventoryManager);

			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}