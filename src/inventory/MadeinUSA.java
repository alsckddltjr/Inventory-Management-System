package inventory;

import java.util.Scanner;

public class MadeinUSA extends Inventory {

	public MadeinUSA(InventoryKind kind) {	
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
