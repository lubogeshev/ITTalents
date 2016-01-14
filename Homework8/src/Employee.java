
public class Employee extends Person {

	protected double daySalary;
	private static final int WORKING_HOURS = 8;

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		this.setDaySalary(daySalary);
	}

	protected void setDaySalary(double daySalary) {
		if (daySalary >= 0) {
			this.daySalary = daySalary;
		} else {
			System.out.println("Invalid day salary! " + this.name + " day salary is set to 0!");
			this.daySalary = 0;
		}
	}

	public double calculateOvertime(double hours) {
		if (hours > 0) {
			if (this.age > 18) {
				return hours * (daySalary / WORKING_HOURS) * 1.5;
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	}

	public void showEmployeeInfo() {
		showPersonInfo();
		System.out.println("Day salary: " + this.daySalary);
	}
}
