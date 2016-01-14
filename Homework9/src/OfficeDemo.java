import java.util.Random;

public class OfficeDemo {

	public static void main(String[] args) {

		AllWork work = new AllWork();
		Random r = new Random();

		Task[] tasks = new Task[11];
		for (int i = 0; i < tasks.length; i++) {
			tasks[i] = new Task("Task" + i, r.nextInt(100));
			work.addTask(tasks [i]);
		}
		Employee ivan = new Employee("Ivan");
		Employee pesho = new Employee("Petyr");
		Employee gosho = new Employee("Georgi");
		
		while (true){
			ivan.startWorkingDay();
			pesho.startWorkingDay();
			gosho.startWorkingDay();
			
			ivan.work();
		//	pesho.work();
		//	gosho.work();
		}

	}

}
