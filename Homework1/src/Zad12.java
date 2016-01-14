import java.util.Scanner;

public class Zad12 {

	public static void main(String[] args) {

		// Задача 12:
		// Високосни години са всички години кратни на 4 с изключения
		// столетията, но без столетия кратни на 400, т.е. 1900 не е високосна,
		// но 1600 и 2000 са високосни.
		// Съставете програма, която по дадени ден, месец, година отпечатва
		// следващата дата.
		// Входни данни: три числа за ден, месец, година.
		// Пример: 28, 2, 2000
		// Изход: 1,3,2000

		Scanner sc = new Scanner(System.in);
		System.out.println("Това е програма, която пресмята следващата дата в календара");
		System.out.println("Моля, въведете последователно ден, месец и година.");

		System.out.print("Ден: ");
		int day = sc.nextInt();
		if ((day < 1) || (day > 31)) {
			System.out.println("Въведеният ден е невалиден!");
		} else {
			System.out.print("Месец: ");
			int month = sc.nextInt();
			if ((month < 1) || (month > 12)) {
				System.out.println("Въведеният месец е невалиден!");
			} else {
				System.out.print("Година: ");
				int year = sc.nextInt();
				sc.close();

				boolean IsLeap = true;

				if (year % 4 == 0) {
					if (year % 100 == 0) {
						if (year % 400 == 0) {
							IsLeap = true;
						} else {
							IsLeap = false;
						}
					}
				} else {
					IsLeap = false;
				}

				if (day == 31 && month == 12) {
					day = 1;
					month = 1;
					year++;
				} else {

					int LastDay;

					if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
						LastDay = 31;

					} else if (month == 4 || month == 6 || month == 9 || month == 11) {
						LastDay = 30;

					} else {

						if (IsLeap) {
							LastDay = 29;
						} else {
							LastDay = 28;
						}

					}
					if (day > LastDay) {
						System.out.println("Въведената дата не съществува!");
					} else {

						if (day == LastDay) {
							day = 1;
							month++;
						} else {
							day++;
						}
						System.out.println("Следващата дата в календара е " + day + "." + month + "." + year + "г.");
					}
				}
			}
		}
	}
}
