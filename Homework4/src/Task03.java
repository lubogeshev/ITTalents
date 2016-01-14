import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		// Задача 3:
		// Имате двумерен масив от числа, чийто стойности са въведени
		// предварително. Да се отпечатат сумата на елементите на масива,
		// както и средноаритметичното на тези числа.

		System.out.println("This is a program that calculates the sum and the avarage of all elements of a table.");

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

		int sum = 0;
		double avg = 0;

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				sum += table[i][j];
			}
		}
		avg = sum / (rows * cols);
		
		System.out.println("The sum of all elements of the table is " + sum);
		System.out.println("And their avarage is " + avg);
	}
}
