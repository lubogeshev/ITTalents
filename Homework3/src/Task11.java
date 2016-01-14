import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		/*
		 * Задача 11: Да се състави програма, която въвежда от клавиатурата 7
		 * цели числа в едномерен масив 
		 * Програмата да изведе всички числа кратни на 5, но по големи от 5. 
		 * Пример: -23, -55, 17, 75, 56, 105, 134
		 * Изход: 75,105 - 2 числа
		 */

		System.out.println("This is a program that shows all numbers (out of 7 entered) greater than 5, that divides by 5");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter number " + (i + 1));
			arr[i] = sc.nextInt();
		}
		sc.close();

		System.out.println("You have entered");
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print(arr[i]);
			} else {
				System.out.print(", " + arr[i]);
			}
		}
		System.out.println();

		int counter = 0;

		boolean divides = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0 && arr[i] > 5) {
				divides = true;
				counter++;
				if (counter == 1) {
					System.out.print(arr[i]);
				} else {
					System.out.print(", " + arr[i]);
				}
			}
		}
		if (!divides) {
			System.out.println("There are no numbers greater than 5, that divides by 5!");
		} else {
			System.out.print(" - " + counter);
			System.out.print(counter == 1 ? " number" : " numbers");
			System.out.println(", greater than 5, that divides by 5.");
		}
	}

}
