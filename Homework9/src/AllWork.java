
public class AllWork {

	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;

	public AllWork() {
		this.tasks = new Task[10];
		this.freePlacesForTasks = tasks.length;
		this.currentUnassignedTask = 0;
	}

	public void addTask(Task newTask) {
		if (this.freePlacesForTasks > 0) {
			this.tasks[this.tasks.length - this.freePlacesForTasks] = newTask;
			this.freePlacesForTasks--;
		} else {
			System.out.println("There's no place for new tasks at the moment!");
		}
	}

	public Task getNextTask() {
		if (this.freePlacesForTasks == this.tasks.length) {
			System.out.println("No tasks to work on!");
			return null;
		}
		return this.tasks[this.currentUnassignedTask++];
	}

	public boolean isAllWorkDone() {
		if (this.getNextTask() != null) {
			if ((this.tasks.length - this.freePlacesForTasks) == this.currentUnassignedTask) {
				if (this.tasks[this.currentUnassignedTask].getWorkingHours() == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
