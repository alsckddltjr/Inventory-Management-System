package inventory;

import java.util.Scanner;

public class MadeinUK extends Inventory {

	public MadeinUK(InventoryKind kind) {	
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setName(input);

		setID(input);

		setWeight(input);

		setSize(input);
	}
	public void prinitInfo() {
		System.out.println("Kind:"+kind+"\rName:"+ name +" \rID:"+ id +" \rWeight:"+ weight +" \rSize:"+ size );
	}
}
