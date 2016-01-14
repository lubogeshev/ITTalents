import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		// Задача 11:
		// Да се създаде метод, който отпечатва масив в конзолата.

		System.out.println("Please enter number for the array's length:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter number for cell " + (i + 1));
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		printArray(arr);
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
