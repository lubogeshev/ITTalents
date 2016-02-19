package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Bank.Bank;
import Bank.Credit;
import Bank.Deposit;
import Client.Client;

public class Demo {

	public static void main(String[] args) {
		Bank bank = new Bank("FIBank");

		Deposit shortDeposit = new Deposit("Short Deposit", 3, 3, 1);
		Deposit longDeposit = new Deposit("Short Deposit", 5, 12, 1);

		Credit homeCredit = new Credit("Home Credit", 6, 1, 1);
		Credit consumerCredit = new Credit("Consumer Credit", 10, 1, 1);

		Client cl1 = new Client("Pesho", 10_000, 1111);
		Client cl2 = new Client("Pesho", 20_000, 2222);
		Client cl3 = new Client("Pesho", 30_000, 3333);
		Client cl4 = new Client("Pesho", 40_000, 4444);
		Client cl5 = new Client("Pesho", 50_000, 5555);
		Client cl6 = new Client("Pesho", 60_000, 6666);
		Client cl7 = new Client("Pesho", 70_000, 7777);
		Client cl8 = new Client("Pesho", 80_000, 8888);
		Client cl9 = new Client("Pesho", 90_000, 9999);
		Client cl10 = new Client("Pesho", 100_000, 12_000);

		List<Client> clients = new ArrayList<>();
		clients.add(cl1);
		clients.add(cl2);
		clients.add(cl3);
		clients.add(cl4);
		clients.add(cl5);
		clients.add(cl6);
		clients.add(cl7);
		clients.add(cl8);
		clients.add(cl9);
		clients.add(cl10);

		Random r = new Random();
		for (Client c : clients) {
			Deposit d;
			if (r.nextBoolean())
				d = shortDeposit;
			else
				d = longDeposit;

			c.openDeposit(bank, d, r.nextInt(180) - 100, r.nextInt(60));
		}

		System.out.println(bank.getName() + " has " + bank.getMoneyReserve() + " BGN liquid reserve");

		for (Client c : clients) {
			Credit credit;
			if (r.nextBoolean())
				credit = homeCredit;
			else
				credit = consumerCredit;

			c.applyForCredit(bank, credit, r.nextInt(60));
		}

		
	}
}
