package Computer;

import java.util.Random;

public class ComputerDemo {

	public static void main(String[] args) {

		Computer asus = new Computer();
		asus.year = 2014;
		asus.price = 999.99;
		asus.hardDiskMemory = 500;
		asus.freeMemory = 450.5;
		asus.operationSystem = "Linux";
		asus.isNotebook = true;
		asus.model = "Asus";

		Computer hp = new Computer();
		hp.year = 2015;
		hp.price = 1499.99;
		hp.hardDiskMemory = 2000;
		hp.freeMemory = 1664.13;
		hp.operationSystem = "Windows 10";
		hp.model = "HP";

		Computer acer = new Computer(2012, 799.99, 500, 400);
		acer.model = "Acer";

		Computer toshiba = new Computer(2015, 1499.99, false, 1500, 1500, "DOS");
		toshiba.model = "Toshiba";

		hp.useMemory(100);
		asus.changeOperationSystem("Windows 8");

		Computer mac = new Computer(2015, 4999.99, true, 100, 40, "MacOS");
		mac.model = "MAC";

		Computer lenovo = new Computer(2013, 999.99, false, 1000, 900, "Windows Vista");
		lenovo.model = "Lenovo";

		Computer computersList[] = { asus, hp, acer, toshiba, mac, lenovo };

		int compares = 5;

		Random r = new Random();
		for (int i = 0; i < compares; i++) {

			int comp1 = r.nextInt(computersList.length);
			int comp2 = r.nextInt(computersList.length);
			byte result = computersList[comp1].comparePrice(computersList[comp2]);
			if (comp1 == comp2) {
				System.out.println("You are comparing 2 identical models " + computersList[comp1].model);
			} else {
				if (result == -1) {
					System.out.println(computersList[comp1].model + "(" + computersList[comp1].price + ")"
										+ " is more expensive than " + 
										computersList[comp2].model + "(" + computersList[comp2].price + ")");
				} else if (result == 1) {
					System.out.println(computersList[comp1].model + "(" + computersList[comp1].price + ")"
										+ " is cheaper than " + 
										computersList[comp2].model + "(" + computersList[comp2].price + ")");
				} else {
					System.out.println(computersList[comp1].model + "(" + computersList[comp1].price + ")"
							+ " price equals " + 
							computersList[comp2].model + "(" + computersList[comp2].price + ") price");
				}
			}
		}

	}

}
