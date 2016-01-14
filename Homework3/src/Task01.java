import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {

		/*
		 * ������ 1: �� �� ������� ����� � �� �� ������ ���-������� ����� ������
		 * �� 3 �� ������.
		 */

		System.out.println("This is a program that shows which number, part of an array, is the smallest that divides by 3.");
		Scanner sc = new Scanner(System.in);

		System.out.println("How long would the array be?");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter a number for cell " + (i + 1));
			array[i] = sc.nextInt();

		}
		sc.close();
		int min = array[0];

		boolean divides = false;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				divides = true;
				min = array[i];
				break;
			}

		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				divides = true;
				if (array[i] < min) {
					min = array[i];
				}
			}
		}
		if (divides) {
			System.out.print("The smallest number that divides by 3 is " + min);
		} else {
			System.out.println("There is no number that divides by 3 in this array!");
		}

	}
}
