
public class Demo {

	public static void main(String[] args) {

		Person people[] = new Person[10];
		int nextFreePos = 0;

		Person ivan = new Person("Ivan", 22, true);
		people[nextFreePos++] = ivan;
		Person gosho = new Person("Georgi", 20, true);
		people[nextFreePos++] = gosho;

		Student mariq = new Student("Mariya", 24, false, 5.65);
		people[nextFreePos++] = mariq;
		Student stefan = new Student("Stefan", 19, true, 3.43);
		people[nextFreePos++] = stefan;

		Employee penka = new Employee("Penka", 14, false, 25);
		people[nextFreePos++] = penka;
		Employee delyan = new Employee("Peevski", 35, true, 25000);
		people[nextFreePos] = delyan;

		for (int i = 0; i < people.length - nextFreePos + 1; i++) {
			if (people[i].getClass().equals(Person.class)) {
				people[i].showPersonInfo();
			} else if (people[i].getClass().equals(Student.class)) {
				Student s = (Student) people[i];
				s.showStudentInfo();
			} else if (people[i].getClass().equals(Employee.class)) {
				Employee e = (Employee) people[i];
				e.showEmployeeInfo();
			}
		}

		for (int i = 0; i < people.length - nextFreePos + 1; i++) {
			if (people[i].getClass().equals(Employee.class)) {
				Employee e = (Employee) people[i];
				e.showEmployeeInfo();
				System.out.println(e.name + " should be paid " + e.calculateOvertime(2) + " BGN extra today"
						+ " for working 2 hours overtime.");
			}
		}

	}
}
