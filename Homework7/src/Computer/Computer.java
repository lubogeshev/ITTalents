package Computer;

public class Computer {

	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	String model;
	
	public Computer() {
		isNotebook = false;
		operationSystem = "Windows XP";
	}

	public Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}

	public Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,
			String operationSystem) {
		this(year, price, hardDiskMemory, freeMemory);
		this.isNotebook = isNotebook;
		this.operationSystem = operationSystem;
	}

	void changeOperationSystem(String newOperationSystem) {
		this.operationSystem = newOperationSystem;
	}

	void useMemory(int memory) {
		if ((this.freeMemory - memory) > 0)
			this.freeMemory -= memory;
		else
			System.out.println("Not enough free memory!");
	}

	byte comparePrice (Computer c){
		if (this.price > c.price){
			return -1;
		}
		else if (this.price < c.price){
			return 1;
		}
		else {
			return 0;
		}
	}
	

}
