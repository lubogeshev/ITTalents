import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {

		/*
		 * Задача 9: Напишете програма, в която потребителя въвежда масив, след
		 * което елементите на масива се обръщат в обратен ред (Целта не е
		 * масива да се отпечата в обратен ред, ами първо да се обърне, след
		 * което да се отпечата в нормален ред). Пробвайте да решите задачата
		 * първо с един допълнителен масив и после без да използвате друг масив.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the array's length:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter a number for cell " + (i + 1));
			arr[i] = sc.nextInt();
		}
		sc.close();

		// Reversing the array using another array

		int[] rev = new int[arr.length];

		for (int i = 0; i < rev.length; i++) {
			rev[i] = arr[arr.length - i - 1];
		}

		for (int i = 0; i < rev.length; i++) {
			rev[i] = arr[i];
		}

		for (int i = 0; i < rev.length; i++) {
			if (i == 0) {
				System.out.print("[" + rev[i]);
			} else {
				System.out.print(", " + rev[i]);
			}
		}
		System.out.print("]");

		// Reversing the array without using another array

		System.out.println();

		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}

		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}

		for (int i = 0; i < rev.length; i++) {
			if (i == 0) {
				System.out.print("[" + rev[i]);
			} else {
				System.out.print(", " + rev[i]);
			}
		}
		System.out.print("]");
	}
}
