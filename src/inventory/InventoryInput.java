package inventory;

import java.util.Scanner;

public interface InventoryInput {
	public String getName();
	public String getID();
	public String getWeight();
	public String getSize();
	public void setName(String name);
	public void setID(String id);
	public void setWeight(String weight);
	public void setSize(String size);

	public void getUserInput(Scanner input);
	public void prinitInfo();

	public void setName(Scanner input);
	public void setID(Scanner input);
	public void setWeight(Scanner input);
	public void setSize(Scanner input);

}
