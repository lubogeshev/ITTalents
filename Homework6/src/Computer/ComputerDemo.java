package Computer;
public class ComputerDemo {

	public static void main(String[] args) {

		Computer asus = new Computer();
		asus.year = 2014;
		asus.price = 999.99;
		asus.hardDiskMemory = 500;
		asus.freeMemory = 450.5;
		asus.operationSystem = "Linux";
		asus.isNotebook = true;

		Computer hp = new Computer();
		hp.year = 2015;
		hp.price = 1499.99;
		hp.hardDiskMemory = 2000;
		hp.freeMemory = 1664.13;
		hp.operationSystem = "Windows 10";
		hp.isNotebook = false;

		hp.useMemory(100);
		asus.changeOperationSystem("Windows 8");

		System.out.println("Computers comparison:");
		System.out.println("ASUS vs HP");
		System.out.println("Type:");
		System.out.println(((asus.isNotebook) ? "Notebook" : "Laptop") + " | " + 
							((hp.isNotebook) ? "Notebook" : "Laptop"));
		System.out.println("Year of manufacture:");
		System.out.println(asus.year + " | " + hp.year);
		System.out.println("Price in BGN:");
		System.out.println(asus.price + " | " + hp.price);
		System.out.println("Hard disk memory:");
		System.out.println(asus.hardDiskMemory + " GB | " + hp.hardDiskMemory + " GB");
		System.out.println("Free memory:");
		System.out.println(asus.freeMemory + " GB | " + hp.freeMemory + " GB");
		System.out.println("Operational System:");
		System.out.println(asus.operationSystem + " | " + hp.operationSystem);

	}

}
