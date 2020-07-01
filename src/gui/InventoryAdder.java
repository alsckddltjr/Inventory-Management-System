package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class InventoryAdder extends JPanel {

	WindowFrame frame;

	public InventoryAdder(WindowFrame frame) {
		this.frame = frame;


		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

		

		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);

		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);

		JLabel labelWeight = new JLabel("Weight: ", JLabel.TRAILING);
		JTextField fieldWeight = new JTextField(10);
		labelWeight.setLabelFor(fieldWeight);
		panel.add(labelWeight);
		panel.add(fieldWeight);
		
		JLabel labelSize = new JLabel("Size: ", JLabel.TRAILING);
		JTextField fieldSize = new JTextField(10);
		labelSize.setLabelFor(fieldSize);
		panel.add(labelSize);
		panel.add(fieldSize);

		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));

		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);



		this.add(panel);
		this.setVisible(true);


	}

}
