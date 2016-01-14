import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {

		// Задача 5:
		// Да се състави програма, при която предварително са въведени
		// естествени числа в двумерен масив 4*4 елемента.
		// Програмата да извежда резултат от проверката какво е съотношението
		// на най-голямата сума по редове спрямо най-голямата сума по колони.
		// Пример:
		// 1,2,3,4
		// 5,6,7,8
		// 9,10,11,12
		// 13,14,15,16
		// Изход:
		// най-голяма сума по редове 58
		// най-голяма сума по колони 40
		// Максималната сума по редове е > от максималната сума по колони

//		int[][] table = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, };
//		for (int i = 0; i < table.length; i++) {
//			for (int j = 0; j < table[i].length; j++) {
//				table[i][j] = -table[i][j];
//			}
//		}

		System.out.println("This is a program that compares the max sum by rows " + 
							"and the max sum by columns of 4x4 matrix");
		int[][] table = new int[4][4];

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

		int maxRowSum = 0;

		for (int i = 0; i < table[0].length; i++) {
			maxRowSum += table[0][i];
		}

		for (int i = 1; i < table.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < table[i].length; j++) {
				rowSum += table[i][j];
			}
			if (rowSum > maxRowSum) {
				maxRowSum = rowSum;
			}
		}

		int maxColSum = 0;

		for (int i = 0; i < table.length; i++) {
			maxColSum += table[i][0];
		}

		for (int j = 1; j < table[0].length; j++) {
			int colSum = 0;
			for (int i = 0; i < table.length; i++) {
				colSum += table[i][j];
			}
			if (colSum > maxColSum) {
				maxColSum = colSum;
			}
		}
		System.out.println("The max sum by rows is " + maxRowSum);
		System.out.println("The max sum by columns is " + maxColSum);
		if (maxRowSum > maxColSum) {
			System.out.println("Max sum by rows is > max sum by columns.");
		} else if (maxRowSum < maxColSum) {
			System.out.println("Max sum by rows is < max sum by columns.");
		} else {
			System.out.println("Max sum by rows is = max sum by columns.");
		}

	}
}
