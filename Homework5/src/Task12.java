
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {

		// Задача 12:
		// Да се създаде метод, който приема за входни данни число N и
		// връща масив от числа с дължина N, който съдържа всички числа
		// от 1 до N.

		System.out.println("Please enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int[] array = fromOnetoN(n);
		printArray(array);
	}

	static int[] fromOnetoN(int n) {

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}

	static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print("[" + array[i]);
			} else {
				System.out.print(", " + array[i]);
			}
		}
		System.out.print("]");

	}
}
