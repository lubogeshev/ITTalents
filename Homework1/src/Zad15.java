import java.util.Scanner;

public class Zad15 {

	public static void main(String[] args) {
		// Задача 15:
		// Да се състави програма, която въвежда естествено число от интервала
		// [0..24].
		// Програмата да изведе съответстващо съобщение съобразно въведения час.
		// Периодите са:
		// [18..4] - Добър вечер;
		// [4..9] - Добро утро;
		// [9..18] - Добър ден
		// Пример: 10
		// Изход: Добър ден

		Scanner sc = new Scanner(System.in);
		System.out.println("Това е програма, която ви поздравява!");
		System.out.println("Моля, въведете час. [цяло число от 0 до 24]");
		System.out.print("Часът е около ");
		int time = sc.nextInt();
		sc.close();

		if (time < 0 || time > 24) {
			System.out.println("Въведеният час е невалиден!");
		} else {

			if (time >= 4 && time <= 9) {
				System.out.println("Добро утро!");
			}
			if (time > 9 && time < 18) {
				System.out.println("Добър ден!");
			}
			if ((time >= 0 && time < 4) || (time >= 18 && time <= 24)) {
				System.out.println("Добър вечер!");

			}

		}
	}

}
