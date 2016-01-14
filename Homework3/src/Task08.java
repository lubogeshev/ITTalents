import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {

		/*
		 * Задача 8: Напишете програма, която намира и извежда най-дългата
		 * редица от еднакви поредни елементи в даден масив.
		 */

		System.out.println("This is a program that shows the longest sequence of equal numbers in an array.");

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number for the array's length");
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter a number for cell " + (i + 1));
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

		int counter = 1;
		int idx = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				idx = arr[i];
				counter++;
			} else {
				if (counter == 1) {
					continue;
				}
				break;
			}
		}

		int maxCounter = counter;
		int newCounter = 1;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				newCounter++;
				if (newCounter > maxCounter) {
					idx = arr[i];
					maxCounter = newCounter;
				}
			} else {
				newCounter = 1;
			}
		}

		int[] arrSeq = new int[maxCounter];
		for (int i = 0; i < arrSeq.length; i++) {
			arrSeq[i] = idx;
		}

		System.out.printf("The longest sequence of equal elements is with %d elements. \n", maxCounter);
		System.out.printf("The first sequence with %d elements is:\n",maxCounter);
		for (int i = 0; i < arrSeq.length; i++) {
			if (i == 0) {
				System.out.print("[" + arrSeq[i]);
			} else {
				System.out.print(", " + arrSeq[i]);
			}
		}
		System.out.println("]");
	}

}
