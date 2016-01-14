import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		 * Задача 4: Да се прочете масив и да се отпечата дали е огледален.
		 * Следните масиви са огледални: 
		 * [3 7 7 3] 
		 * [4] 
		 * [1 55 1] 
		 * [6 27 -1 5 7 7 5 -1 27 6]
		 */

		System.out.println("This is a program that tells you if an array is specular.");
		System.out.println("Please enter a number for the array's length");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter a number for cell " + (i + 1));
			array[i] = sc.nextInt();
		}
		sc.close();

		boolean specular = true;

		for (int i = 0; i < array.length; i++) {

			if (array[i] != array[array.length - i - 1]) {
				specular = false;
				break;
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print("[" + array[i]);
			} else {
				System.out.print(", " + array[i]);
			}
		}
		System.out.println("]");

		System.out.println(specular ? "The array is specular" : "The array is not specular");

	}

}
