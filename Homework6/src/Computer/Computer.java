package Computer;

public class Computer {

	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

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
