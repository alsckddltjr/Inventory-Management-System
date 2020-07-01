package inventory;

import java.util.Scanner;

public class MadeinChina extends Inventory {

	public MadeinChina(InventoryKind kind) {	
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
