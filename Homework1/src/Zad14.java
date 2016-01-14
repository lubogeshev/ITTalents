import java.util.Scanner;

public class Zad14 {

	public static void main(String[] args) {

		// Задача 14:
		// Да се състави програма, която по въведени координати на 2 позиции
		// от шахматната дъска извежда отговор дали са оцветени в еднакъв или
		// различен цвят.
		// Шахматната дъска е квадратна.
		// Въвеждат се две двойки числа от интервала [1..8].
		// Пример: 2 2 3 2
		// Изход: Позициите са с различен цвят

		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Това е програма, която проверява дали 2 позиции от шахматната дъска са оцветени в еднакъв или различен цвят.");
		System.out.println("Моля, въведете координатите на първото поле [1; 8]");
		System.out.print("x1 = ");
		byte x1 = sc.nextByte();

		System.out.print("y1 = ");
		byte y1 = sc.nextByte();
		if ((x1 < 1 || x1 > 8) || (y1 < 1 || y1 > 8)) {
			System.out.println("Въведените координати не са валидни за поле от шахматната дъска!");
		} else {
			System.out.println("Моля, въведете координатите на второто поле [1; 8]");
			System.out.print("x2 = ");
			byte x2 = sc.nextByte();

			System.out.print("y2 = ");
			byte y2 = sc.nextByte();
			sc.close();

			if ((x2 < 1 || x2 > 8) || (y2 < 1 || y2 > 8)) {
				System.out.println("Въведените координати не са валидни за поле от шахматната дъска!");
			} else {

				int sum1 = x1 + y1;
				int sum2 = x2 + y2;

				if ((sum1 + sum2) % 2 == 0) {
					System.out.println("Двете полета [" + x1 + "," + y1 + "] и [" + x2 + "," + y2 + "] са с еднакъв цвят.");

				} else {
					System.out.println("Двете полета [" + x1 + "," + y1 + "] и [" + x2 + "," + y2 + "] са с различен цвят.");
				}

			}

		}

	}

}
