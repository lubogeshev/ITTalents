import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		// Задача 4:
		// Имате предварително въведени стойности на елементи в двумерен
		// масив - естествени числа.
		// Да се състави програма, чрез която се извеждат стойностите на
		// елементите в двумерен масив след обръщането му на +90 градуса.
		// Пример:
		// 1,2,3,4
		// 5,6,7,8
		// 9,10,11,12
		// 13,14,15,16
		// Изход
		// 13,9,5,1
		// 14,10,6,2
		// 15,11,7,3
		// 16,12,8,4
	
		System.out.println("This is a program that rotates a table by +90 degrees.");

		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert number of rows");
		int rows = sc.nextInt();
		System.out.println("Please insert number of columns");
		int cols = sc.nextInt();

		int[][] table = new int[rows][cols];

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

		int[][] rotatedTable = new int[cols][rows];

		for (int i = 0; i < rotatedTable.length; i++) {
			for (int j = 0; j < rotatedTable[i].length; j++) {
				rotatedTable[i][j] = table[table.length - 1 - j][i];
			}
		}

		System.out.println("After the +90 degrees rotation the table becomes:");
		for (int i = 0; i < rotatedTable.length; i++) {
			for (int j = 0; j < rotatedTable[i].length; j++) {
				System.out.print(rotatedTable[i][j] + " ");
			}
			System.out.println();
		}

	}
}
