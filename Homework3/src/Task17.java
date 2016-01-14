import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {

		/*
		 * Задача 17: Една редица от естествени числа ще наричаме зигзагообразна
		 * нагоре, ако за елементите и са изпълняват условията: 
		 * N1 < N2 > N3 < N4 > N5 <.. 
		 * Съставете програма, която проверява дали въведени в
		 * едномерен масив редица от числа изпълняват горните изисквания.
		 * Пример: 1 3 2 4 3 7 
		 * Изход: изпълнява изискванията за зигзагообразна нагоре редица
		 */

		System.out.println("This is a program that tells if an array is jagged.");
		System.out.println("Please enter a number for the array's length:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter number " + (i + 1));
			arr[i] = sc.nextInt();
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

		boolean isJagged = true;

		for (int i = 1; i < arr.length - 1; i++) {
			if (!((arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) || (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]))) {
				isJagged = false;
				break;
			}
		}

		System.out.println(isJagged ? "Array is jagged!" : "Array is not jagged!");

	}

}
