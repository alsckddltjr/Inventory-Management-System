package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.InventoryManager;

public class WindowFrame extends JFrame{

	InventoryManager inventoryManager;

	MenuSelection menuselection;
	InventoryAdder inventoryadder;
	InventoryViewer inventoryviewer;


	public WindowFrame(InventoryManager inventoryManager) {
		this.inventoryManager = inventoryManager;
		menuselection = new MenuSelection(this);
		inventoryadder = new InventoryAdder(this);
		inventoryviewer = new InventoryViewer(this, this.inventoryManager);


		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		this.setupPanel(menuselection);

		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public InventoryAdder getInventoryadder() {
		return inventoryadder;
	}

	public void setInventoryadder(InventoryAdder inventoryadder) {
		this.inventoryadder = inventoryadder;
	}

	public InventoryViewer getInventoryviewer() {
		return inventoryviewer;
	}

	public void setInventoryviewer(InventoryViewer inventoryviewer) {
		this.inventoryviewer = inventoryviewer;
	}


}
