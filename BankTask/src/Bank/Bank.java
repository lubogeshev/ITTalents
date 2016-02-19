package Bank;
import java.util.List;

import Client.Client;

public class Bank {

	private String name;
	private String address;
	private List<Deposit> deposits;
	private List<Credit> credits;
	private double moneyReserve;
	
	public Bank(String name) {
		setName(name);
		this.moneyReserve = 100_000;
	}

	public void takeDeposit(Deposit deposit, double money) {
		this.moneyReserve += money;
	}

	public void payInterestOnDeposit(Deposit deposit) {
		for (Deposit d : this.deposits) {
			d.money += calculateInterest(deposit);
		}
	}

	public double calculateInterest(Deposit deposit) {
		return deposit.getMoney() * deposit.getInterest();
	}

	public void giveCredit(Client client, Credit credit, int durationMonths) {
		if (calculateMonthPayment(credit) > client.getMonthlySalary()/2) {
			System.out.println(client.getName() + " is not good for credit");
			return;
		}
		if (this.moneyReserve < credit.getMoney()) {
			System.out.println("The bank is unable to provide this credit");
			return;
		}
		else if (checkBankLiquidity()) {
			client.getCredits().add(credit);
			this.credits.add(credit);
			this.moneyReserve -= credit.getMoney();
		}
	}

	private double calculateMonthPayment (Credit credit) {
		return credit.getMoney() / credit.getPeriodMonths();
	}
	
	private boolean checkBankLiquidity() {
		double allDeposits = 0;
		for (Deposit d : this.deposits) {
			allDeposits += d.getMoney();
		}
		return this.moneyReserve < allDeposits / 10;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if (name == null)
			this.name = "unknown";
		else
			this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public List<Deposit> getDeposits() {
		return deposits;
	}

	public List<Credit> getCredits() {
		return credits;
	}


	public double getMoneyReserve() {
		return moneyReserve;
	}

}
