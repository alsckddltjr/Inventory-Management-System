
public class Inventory {
	String name;
	int id;
	int weight;
	String size;
	static int numInventorysRegistered = 0;
	public Inventory() {
		numInventorysRegistered++;
	}
	public Inventory(String name, int id) {	

		this.name = name;
		this.id = id;
		numInventorysRegistered++;
	}

	public Inventory(String name, int id, int weight, String size) {
		this.name = name;// this 는 필드에 있는 name을 가리키기 위해서 쓴다. 
		this.id = id;
		this.weight = weight;
		this.size = size;
		numInventorysRegistered++;
	}
	public void printInfo() {
		System.out.println("name:" + name +  " id:" + id + " weight:" + weight + " size:" + size );
	}
}
