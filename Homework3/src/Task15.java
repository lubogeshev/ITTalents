import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {

		/*
		 * Задача 15: Да се състави програма, която въвежда в едномерен масив
		 * реални числа. 
		 * Като изход: програма извежда онези 3 различни числа,
		 * чиято абсолютна стойност формира максималната обща сума. 
		 * Пример: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12 
		 * Изход: 5.1; 6.34; 7.13
		 */

		System.out.println("This is a program that shows the 3 numbers, part of an array, with the greatest absolute value.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number for the array's length");
		int n = sc.nextInt();

		double[] arr = new double[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter a number for cell " + (i + 1));
			arr[i] = sc.nextDouble();
		}
		sc.close();

		System.out.println("You have entered:");
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr[i]);
			} else {
				System.out.print(", " + arr[i]);
			}
		}
		System.out.println("]");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arr[i] = -arr[i];
			}
		}

		double[] max = new double[3];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max[0]) {
				max[2] = max[1];
				max[1] = max[0];
				max[0] = arr[i];
			} else if (arr[i] > max[1]) {
				max[2] = max[1];
				max[1] = arr[i];
			} else if (arr[i] > max[2]) {
				max[2] = arr[i];
			}

		}
		System.out.println("the 3 numbers with the greatest absolute value are:");
		for (int i = 0; i < max.length; i++) {
			if (i == 0) {
				System.out.print("[" + max[i]);
			} else {
				System.out.print(", " + max[i]);
			}
		}
		System.out.println("]");

	}
}
