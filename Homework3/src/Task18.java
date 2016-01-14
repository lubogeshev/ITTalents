import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {

		/*
		 * Задача 18: Дадени са два едномерни масива с естествени числа. Да се
		 * състави програма, която сравнява всички числа с еднакви индекси от
		 * двата масива и записва в трети масив, по-голямото от двете числа. 
		 * Да се изведе съдържанието и на трите масива 
		 * Пример: 
		 * 18,19,32,1,3, 4, 5, 6, 7, 8 
		 * 1, 2, 3,4,5,16,17,18,27,11 
		 * Изход: 
		 * 18,19,32,4,5,16,17,18,27,11
		 */

		System.out.println("This is a program that creates an array from the greatest correspodnding numbers of 2 arrays.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number for the length of both arrays:");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Please enter a number for cell " + (i + 1) + " of the 1st array");
			arr1[i] = sc.nextInt();
		}

		int[] arr2 = new int[n];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("Please enter a number for cell " + (i + 1) + " of the 2nd array");
			arr2[i] = sc.nextInt();
		}
		sc.close();

		System.out.println("You have entered:");
		for (int i = 0; i < arr1.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr1[i]);
			} else {
				System.out.print(", " + arr1[i]);
			}
		}
		System.out.println("]");

		System.out.println("And:");
		for (int i = 0; i < arr2.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr2[i]);
			} else {
				System.out.print(", " + arr2[i]);
			}
		}
		System.out.println("]");

		int arr3[] = new int[arr1.length];
		for (int i = 0; i < arr3.length; i++) {
			if (arr1[i] >= arr2[i]) {
				arr3[i] = arr1[i];
			} else {
				arr3[i] = arr2[i];
			}
		}

		System.out.println("The array of the greatest corresponding numbers is:");
		for (int i = 0; i < arr3.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr3[i]);
			} else {
				System.out.print(", " + arr3[i]);
			}
		}
		System.out.println("]");

	}

}
