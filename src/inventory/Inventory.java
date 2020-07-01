package inventory;

import java.io.Serializable;
import java.util.Scanner;

public abstract class Inventory implements InventoryInput, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3290193548799538556L;
	protected InventoryKind kind = InventoryKind.MadeinKorea;
	protected String name;
	protected String id;
	protected String weight;
	protected String size;

	public Inventory(){}

	public Inventory(InventoryKind kind){
		this.kind = kind;
	}

	public Inventory(String name,String id,String weight,String size){
		this.name=name;
		this.id=id;
		this.weight=weight;
		this.size=size;
	}

	public Inventory(String name,String id){
		this.name=name;
		this.id=id;
	}

	public Inventory(InventoryKind kind, String name,String id,String weight,String size){
		this.kind = kind;
		this.name=name;
		this.id=id;
		this.weight=weight;
		this.size=size;
	}

	public InventoryKind getKind() {
		return kind;
	}

	public void setKind(InventoryKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return id;
	}

	public void setID(String id) {
		this.id = id;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public abstract void prinitInfo();

	public void setName(Scanner input) {
		System.out.print("Please enter a name:");
		String name = input.nextLine();
		this.setName(name);
	}

	public void setID(Scanner input) {
		System.out.print("Please enter the id:");
		String id = input.nextLine();
		this.setID(id);
	}

	public void setWeight(Scanner input) {
		System.out.print("Please enter the weight:");
		String weight = input.nextLine();
		this.setWeight(weight);
	}

	public void setSize(Scanner input) {
		System.out.print("Please enter the size:");
		String size = input.nextLine();
		this.setSize(size);
	}




}
