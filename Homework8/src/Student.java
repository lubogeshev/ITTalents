
public class Student extends Person {

	protected double score;

	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		this.setScore(score);
	}

	protected void setScore(double score) {
		if (score >= 2 && score <= 6) {
			this.score = score;
		} else if (score < 2) {
			System.out.println("Invalid score! " + this.name + " score is set to 2!");
			this.score = 2;
		} else {
			System.out.println("Invalid score! " + this.name + " score is set to 6!");
			this.score = 6;
		}
	}

	public void showStudentInfo() {
		showPersonInfo();
		System.out.println("Score: " + this.score);
	}

}
