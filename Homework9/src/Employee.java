
public class Employee {

	private String name;
	private Task currentTask;
	private int hoursLeft;
	private AllWork allWork;

	public Employee(final String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			boolean allLetters = true;
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) == ' ') {
					continue;
				} else if (!Character.isLetter(name.charAt(i))) {
					allLetters = false;
					break;
				}
			}
			if (allLetters) {
				this.name = name.trim();
			} else {
				this.name = "Unknown";
				System.out.println(
						"Invalid name! Name set to \"Unknown\"." + " Use setName to set valid name! (letters only)");
			}

		} else {
			System.out.println(
					"Name cannot be null! Name set to \"Unknown\"." + " Use setName to set valid name! (letters only)");
			this.name = "Unknown";
		}
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 0 && hoursLeft <= 12) {
			this.hoursLeft = hoursLeft;
		} else if (hoursLeft < 0) {
			System.out.println(this.getName() + " working hours are set to 0!");
			this.hoursLeft = 0;
		} else {
			System.out.println(this.getName() + " working hours are set to 12!");
			this.hoursLeft = 12;
		}
	}

	public AllWork getAllWork() {
		return allWork;
	}

	public void setAllWork(AllWork allWork) {
		this.allWork = allWork;
	}

	public void startWorkingDay() {
		System.out.println("New day for "+ this.getName() + " at work!");
		this.setHoursLeft(8);
	}

	public void work() {
		
		if (!this.allWork.isAllWorkDone()) {
			if (this.getCurrentTask() == null) {
				this.setCurrentTask(this.allWork.getNextTask());
			}

			if (this.getCurrentTask().getWorkingHours() == 0) {
				System.out.println(this.getCurrentTask().getTaskName() + " is done!");
				System.out.println("New task for " + this.name + " is " + this.allWork.getNextTask().getTaskName());
				this.setCurrentTask(this.allWork.getNextTask());
			}

			if (this.getHoursLeft() == 0) {
				System.out.println(this.getName() + " shift is over!");
				this.startWorkingDay();
			}

			if (this.getHoursLeft() < this.getCurrentTask().getWorkingHours()) {
				this.getCurrentTask().setWorkingHours(this.getCurrentTask().getWorkingHours() - this.getHoursLeft());
				this.startWorkingDay();
			} else {
				this.setHoursLeft(this.getHoursLeft() - this.getCurrentTask().getWorkingHours());
				this.getCurrentTask().setWorkingHours(0);
				this.setCurrentTask(this.allWork.getNextTask());
			}
			this.showReport();

		} else {
			System.out.println("Congratulations! All the work is done!");
		}
	}

	private void showReport() {
		System.out.println("Work report:");
		System.out.println(this.getName() + " worked on " + this.getCurrentTask().getTaskName());
		System.out.println(this.getName() + " has " + this.getHoursLeft() + " hours left till the end of his shift!");
		System.out.println(this.getCurrentTask().getTaskName() + " needs " + this.getCurrentTask().getWorkingHours()
				+ " hours work to be completed!");
	}

}
