
public class ComputerDemo {
	
	public static void main(String[] args) {
		
		Computer asus = new Computer();
		asus.year = 2014;
		asus.price = 999.99;
		asus.hardDiskMemory = 500;
		asus.freeMemory = 400;
		asus.operationSystem = "Linux";
		asus.isNotebook = true;
		
		Computer hp = new Computer();
		hp.year = 2015;
		hp.price = 1999.99;
		hp.hardDiskMemory = 2000;
		hp.freeMemory = 1100;
		hp.operationSystem = "Windows 10";
		hp.isNotebook = false;
		
	}

}
