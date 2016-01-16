package Student;

public class Student {

	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;

	public Student() {
		this.grade = 4;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}

	public Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	
	void upYear () {
		if (!this.isDegree) {
			this.yearInCollege++;
			if (this.yearInCollege == 4) {
				this.isDegree = true;
			}
		} else {
			System.out.println(this.name + " already graduated.");
		}
	}
	
	double receiveScholarship (double min, double amount) {
		if (this.grade >= min && this.age < 30) {
			this.money += amount;
		}
		return this.money;
	}
	

}
