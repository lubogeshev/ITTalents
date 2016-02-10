package Scheduler;

public class Demo {

	public static void main(String[] args) {
		Scheduler homeDuties = new Scheduler();

		ITask doDishes = new ITask() {

			@Override
			public void doWork() {
				System.out.println("Do the dishes!");
			}
		};
		homeDuties.push(doDishes);

		homeDuties.push(new ITask() {
			@Override
			public void doWork() {
				System.out.println("Clean up!");
			}
		});

		homeDuties.push(() -> System.out.println("Fill the fridge!"));

		homeDuties.push(null);

		homeDuties.push(() -> System.out.println("Do the laundry!"));

		System.out.println("The current tasks on the schedule are:");
		for (ITask t : homeDuties.getTasks()) {
			t.doWork();
		}

		System.out.println("\nLet's do some home duties now:");
		while (!homeDuties.getTasks().isEmpty())
			homeDuties.main();
		
		homeDuties.push(null);
		homeDuties.main();
	}

}
