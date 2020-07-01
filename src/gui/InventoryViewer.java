package gui;




import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.InventoryManager;
import inventory.InventoryInput;

public class InventoryViewer extends JPanel {

	WindowFrame frame;
	InventoryManager inventoryManager;

	public InventoryViewer(WindowFrame frame, InventoryManager inventoryManager) {
		this.frame = frame;
		this.inventoryManager = inventoryManager;

		System.out.println("***" + inventoryManager.size() + "***");

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("ID");
		model.addColumn("Weight");
		model.addColumn("Size");

		for(int i=0; i<inventoryManager.size(); i++) {
			Vector row = new Vector();
			InventoryInput si = inventoryManager.get(i);
			row.add(si.getName());
			row.add(si.getID());
			row.add(si.getWeight());
			row.add(si.getSize());
			model.addRow(row);
		}

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}

}
