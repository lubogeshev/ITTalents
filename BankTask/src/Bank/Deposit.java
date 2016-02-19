package Bank;

public class Deposit extends BankProduct {

	public Deposit(String name, double interest, int periodMonths, double money) {
		super(name, interest, periodMonths, money);
	}

	private double paymentOnDeposit;

	
	
	public double getPaymentOnDeposit() {
		return paymentOnDeposit;
	}

	public void setPaymentOnDeposit(double paymentOnDeposit) {
		this.paymentOnDeposit = paymentOnDeposit;
	}
}
