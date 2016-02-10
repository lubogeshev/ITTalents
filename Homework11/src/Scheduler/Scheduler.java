package Scheduler;
import java.util.LinkedList;
import java.util.Queue;

public class Scheduler {

	private Queue<ITask> tasks;

	public Scheduler() {
		this.tasks = new LinkedList<ITask>();
	}

	void push(ITask task) {
		if (task != null)
			this.tasks.offer(task);
		else
			System.out.println("The task you try to add is null!");
	}

	void main() {
		if (!this.tasks.isEmpty())
			this.tasks.poll().doWork();
		else
			System.out.println("The queue of tasks is empty!");
	}
	
	public Queue<ITask> getTasks() {
		return tasks;
	}
}
