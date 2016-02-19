package Bank;

public class Credit extends BankProduct{

	private double paymentForCredit;

	public Credit(String name, double interest, int periodMonths, double money) {
		super(name, interest, periodMonths, money);
	}
	
	
	public double getPaymentForCredit() {
		return paymentForCredit;
	}

	public void setPaymentForCredit(double paymentForCredit) {
		this.paymentForCredit = paymentForCredit;
	}
	
	
}
