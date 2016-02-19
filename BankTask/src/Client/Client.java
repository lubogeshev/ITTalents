package Client;
import java.util.List;

import Bank.Bank;
import Bank.Credit;
import Bank.Deposit;

public class Client {

	private String name;
	private String address;
	private double cash;
	private double monthlySalary;
	private List<Deposit> deposits;
	private List<Credit> credits;
	
	public Client(String name) {
		setName(name);
		this.cash = 0;
		this.monthlySalary = 0;
	}

	public Client(String name, double cash, double monthlySalary) {
		this (name);
		this.cash = cash;
		this.monthlySalary = monthlySalary;
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

	public void openDeposit (Bank bank, Deposit deposit, double money, int durationMonths) {
		if (this.cash > 0){
			this.cash -= money;
			bank.takeDeposit(deposit, money);
		} else
			System.out.println("Not enough money to make a deposit in the banks");
	}
	
	public void applyForCredit (Bank bank, Credit credit, int durationMonths) {
		double allCredits = 0;
		for (Credit c : this.credits){
			allCredits += c.getMoney();
		}
		if (allCredits > this.getMonthlySalary()/2) {
			bank.giveCredit(this, credit, durationMonths);
		}
	}
	
	public void payForCredit (Credit credit){
		
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

	public double getMonthlySalary() {
		return monthlySalary;
	}

	
}
