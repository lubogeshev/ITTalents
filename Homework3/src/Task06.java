import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		/*
		 * Задача 6: Напишете програма, която първо чете 2 масива и после
		 * извежда съобщение дали са еднакви, и дали са с еднакъв размер.
		 */

		System.out.println("This is a program that checks if 2 arrays are equal.");

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number for the 1st array's length:");
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Please enter a number for cell " + (i + 1));
			arr1[i] = sc.nextInt();
		}

		System.out.println("Please enter a number for the 2nd array's length:");
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("Please enter a number for cell " + (i + 1));
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
		
		for (int i = 0; i < arr2.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr2[i]);
			} else {
				System.out.print(", " + arr2[i]);
			}
		}
		System.out.println("]");
		
		boolean equals = true;

		if (arr1.length != arr2.length) {
			equals = false;
			System.out.println("Arrays are with different lengths, therefore");
		} else {
			for (int i = 1; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					equals = false;
					break;
				}
			}
		}		
		System.out.println(equals ? "Arrays are with the same length and are equal!" : "Arrays are not equal!");
	}
}
