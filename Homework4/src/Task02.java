import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		// Задача 2:
		// Имате квадратен двумерен масив от естествени числа, чийто стойности
		// се въвеждат от конзолата. Да се отпечатат диагоналите на масива.
		// Пример:
		// 1,4,6,3
		// 5,9,7,2
		// 4,8,1,9
		// 2,3,4,5
		// Изход:
		// 1 9 1 5
		// 3 7 8 2

		System.out.println("This is a program that prints the diagonals of a square table.");
		System.out.println("Please enter a number for the table's heigth and length:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] table = new int[n][n];

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

		System.out.println("The numbers that are on the main diagonal are:");
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				if (i == j) {
					System.out.print(table[i][j] + " ");
				}
			}
		}
		System.out.println();

		System.out.println("The numbers that are on the antidiagonal are:");
		for (int i = 0; i < table.length; i++) {
			System.out.print(table[i][table.length-1 - i] + " ");
		}
	}
}
