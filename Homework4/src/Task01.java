import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		// Задача 1:
		// Имате двумерен масив 6х5 от естествени числа, чийто стойности са
		// въведени предварително.
		// Да се състави програма, чрез която се извеждат елементите от масива
		// с най-малката и най-голямата стойност.
		// Пример:
		// 48,72,13,14,15
		// 21,22,53,24,75
		// 31,57,33,34,35
		// 41,95,43,44,45
		// 59,52,53,54,55
		// 61,69,63,64,65
		// Изход:
		// най-малко 13;
		// най-голямо 95

		System.out.println("This is a program that calculates the max and min value of 6x5 table.");
		int[][] table = new int[6][5];

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

		int min = table[0][0];
		int max = table[0][0];

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				if (table[i][j] < min) {
					min = table[i][j];
				}
				if (table[i][j] > max) {
					max = table[i][j];
				}
			}
		}
		
		System.out.println("The minimum value is: " + min);
		System.out.println("The maximum value is: " + max);

	}

}
