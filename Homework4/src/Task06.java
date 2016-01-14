import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		// Задача 6:
		// Имате предварително въведени стойности от естествени числа.
		// Числата са въведени в квадратна таблица с размери 6 реда и 6
		// колони.
		// Да се състави програма, чрез която се намира сумата на всички
		// елементи от редовете с четни номера: 2,4 и 6.
		// Програмата да извежда и сумата на всеки отделен ред.
		// Пример:
		// 11,12,13,14,15,16,
		// 21,22,23,24,25,26,
		// 31,32,33,34,35,36,
		// 41,42,43,44,45,46,
		// 51,52,53,54,55,56,
		// 61,62,63,64,65,66
		// Изход:
		// 21,22,23,24,25,26 сума 141
		// 41,42,43,44,45,46 сума 261
		// 61,62,63,64,65,66 сума 381
		// Сума на елементите 783

//		int[][] table = { { 11, 12, 13, 14, 15, 16 }, 
//						  { 21, 22, 23, 24, 25, 26 }, 
//						  { 31, 32, 33, 34, 35, 36 },
//						  { 41, 42, 43, 44, 45, 46 }, 
//						  { 51, 52, 53, 54, 55, 56 }, 
//						  { 61, 62, 63, 64, 65, 66 }, };

		System.out.println("This is a program that calculates the sum of all elements on the rows \n"
							+ "with index that is an equal number in a 6x6 matrix (rows 2, 4 and 6).");
		
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

		int sumAllEqRows = 0;

		for (int i = 0; i < table.length; i++) {
			if ((i + 1) % 2 == 0) {
				int rowSum = 0;
				for (int j = 0; j < table[i].length; j++) {
					rowSum += table[i][j];
					System.out.print(table[i][j] + ", ");
					if (j == table[i].length - 1) {
						System.out.print(table[i][j]);
						System.out.println(" - The sum of row " + (i + 1) + " is " + rowSum);
						sumAllEqRows += rowSum;
					}
				}
			}
		}
		System.out.println("The sum of all these rows is " + sumAllEqRows);

	}
}
