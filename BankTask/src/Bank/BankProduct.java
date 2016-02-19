package Bank;

public abstract class BankProduct {

	protected String name;
	protected double interest;
	protected int periodMonths;
	protected double money;

	public BankProduct(String name, final double interest, int periodMonths, double money) {
		setName(name);
		setInterest(interest);
		setPeriodMonths(periodMonths);
		setMoney(money);
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

	public double getInterest() {
		return interest;
	}

	private void setInterest(double interest) {
		if (interest > 0)
			this.interest = interest;
		else {
			this.interest = 1;
			System.out.println("Interest set to 1%");
		}
	}

	public int getPeriodMonths() {
		return periodMonths;
	}

	private void setPeriodMonths(int periodMonths) {
		if (periodMonths < 1) {
			this.periodMonths = 1;
			System.out.println("Period set to 1 month");
		} else if (periodMonths > 30) {
			this.periodMonths = 60;
			System.out.println("Period set to 60 month");
		} else
			this.periodMonths = periodMonths;
	}

	public double getMoney() {
		return money;
	}

	private void setMoney(double money) {
		if (money > 0)
			this.money = money;
		else {
			this.money = 1;
			System.out.println("Money set to 1 BGN");
		}
	}
}
