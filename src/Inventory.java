
public class Inventory {
	String name;
	int id;
	int weight;
	String size;

	public Inventory() {	
		this.name = name;
		this.id = id;
	}

	public Inventory(String name, int id, int weight, String size) {
		this.name = name;// this �� �ʵ忡 �ִ� name�� ����Ű�� ���ؼ� ����. 
		this.id = id;
		this.weight = weight;
		this.size = size;
	}
	public void printInfo() {
		System.out.println("name:" + name +  " id:" + id + " weight:" + weight + " size:" + size );
	}
}
