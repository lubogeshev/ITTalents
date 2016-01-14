import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {

		// Задача 7:
		// Имате предварително въведени стойности от естествени числа,
		// въведени в квадратна таблица с размери 6 реда и 6 колони.
		// Да се състави програма , чрез която се намира сумата на всички
		// елементи, чиято сума на индекси за ред и колона е четно число.
		// Програмата да извежда формираните суми за всеки отделен ред на
		// квадратната таблица, както и общата сума от тези елементи.
		// Да се използва само един цикъл.
		// Пример:
		// 11,12,13,14,15,16,
		// 21,22,23,24,25,26,
		// 31,32,33,34,35,36,
		// 41,42,43,44,45,46,
		// 51,52,53,54,55,56,
		// 61,62,63,64,65,66
		// Изход:
		// 11, ,13, ,15, , сума от елементите за реда: 39
		// 22, ,24, ,26, сума от елементите за реда: 72
		// 31, ,33, ,35, , сума от елементите за реда: 99
		// 42, ,44, ,46, сума от елементите за реда: 132
		// 51, ,53, ,55, , сума от елементите за реда: 159
		// 62, ,64, ,66 сума от елементите за реда: 192
		// Сума на елементите: 693

//		int[][] table = { { 11, 12, 13, 14, 15, 16 }, 
				//		  { 21, 22, 23, 24, 25, 26 }, 
				//		  { 31, 32, 33, 34, 35, 36 },
				//		  { 41, 42, 43, 44, 45, 46 }, 
				//		  { 51, 52, 53, 54, 55, 56 }, 
				//		  { 61, 62, 63, 64, 65, 66 }, };

		System.out.println("This is a program that calculates the sum of all elements \n"
				+ "with sum of indexes that is an equal number in a 6x6 matrix.");

		int[][] table = new int[6][6];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.println("Please enter a value for cell [" + (i + 1) + ", " + (j + 1) + "]");
				table[i][j] = sc.nextInt();
			}
		}
		sc.close();

		System.out.println("You have entered:");
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}

		int sumAll = 0;

		for (int i = 0; i < table.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < table[i].length; j++) {
				if (((i + 1) + (j + 1)) % 2 == 0) {
					rowSum += table[i][j];
					System.out.print(table[i][j] + ", ");
					if ((i + 1) % 2 == 0) {
						if (j == table[i].length - 1) {
							System.out.println(" The sum of these elements is " + rowSum);
							sumAll += rowSum;
						}
					} else {
						if (j == table[i].length - 2) {
							System.out.println(" The sum of these elements is " + rowSum);
							sumAll += rowSum;
						}
					}
				}
			}
		}
		System.out.println("The sum of all these rows is " + sumAll);
	}
}
