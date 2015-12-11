package Computer;

public class Computer {

	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	public Computer() {
		isNotebook = false;
		operationSystem = "Win XP";
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
	}

	void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
	}

	void useMemory(int memory) {
		if ((freeMemory - memory) > 0)
			freeMemory -= memory;
		else
			System.out.println("Not enough free memory!");
	}

}
