package Work;

public class WorkDemo {

	public static void main(String[] args) {
		
		Task kopane = new Task(null,11);
		kopane.setTaskName("Kopane");
		Task torene = new Task("Torene", 3);
		Employee ivan = new Employee("      Ivan Georgiev   ");
		Employee gosho = new Employee("Georgi Petrov");
		
		Employee pesho = new Employee("32");
		System.out.println(pesho.getName());
		pesho.setName("Petyr Stoyanov");
		System.out.println(pesho.getName());
				
		ivan.setHoursLeft(42);
		gosho.setHoursLeft(-6);
		gosho.setHoursLeft(9);

		gosho.setCurrentTask(kopane);
		gosho.work();
		gosho.work();
		
		ivan.work();
		
		ivan.setCurrentTask(torene);
		ivan.work();
	}

}
