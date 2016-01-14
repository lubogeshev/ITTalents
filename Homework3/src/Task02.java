import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		/*
		 * Задача 2: Нека по въведен масив да се конструира нов, като половината
		 * му елементи са точно като на оригиналния, а другите да са тези
		 * елементи, но в обратен ред. Последно, да се изведе новия масив на
		 * екрана.
		 */

		System.out.println("Please enter number for the array's length:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] original = new int[n];
		for (int i = 0; i < original.length; i++) {
			System.out.println("Please enter number for cell " + (i + 1));
			original[i] = sc.nextInt();
		}
		sc.close();

		int[] copy = new int[original.length * 2];

		for (int i = 0; i < (copy.length + 1) / 2; i++) {
			copy[i] = original[i];
			copy[copy.length - i - 1] = original[i];
		}
		
		for (int i = 0; i < copy.length; i++) {
			if (i == 0) {
				System.out.print("[" + copy[i]);
			} else {
				System.out.print(", " + copy[i]);
			}
		}
		System.out.print("]");

	}
}
