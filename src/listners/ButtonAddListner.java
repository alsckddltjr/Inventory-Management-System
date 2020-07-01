package listners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import gui.InventoryAdder;
import gui.WindowFrame;

public class ButtonAddListner implements ActionListener {

	WindowFrame frame;

	public ButtonAddListner(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		InventoryAdder adder = frame.getInventoryadder();
		frame.setupPanel(adder);

	}

}
