//import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {

		/*
		 * Задача 5: Напишете програма, която създава масив с 10 елемента и
		 * инициализира всеки от елементите със стойност, равна на индекса на
		 * елемента, умножен по 3. Да се изведат елементите на екрана.
		 */

		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = 3 * i;
		}

		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print("[" + array[i]);
			} else {
				System.out.print(", " + array[i]);
			}
		}
		System.out.println("]");
	}
}
