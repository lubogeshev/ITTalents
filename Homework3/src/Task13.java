import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		/*
		 * Задача 13: Да се състави програма, чрез която се въвежда число и се
		 * представя като число в двоична бройна система. 
		 * Програмата, чрез
		 * масив, да изчислява последователно всички цифри на въведеното
		 * естествено число в 2-ична бройна система. 
		 * Пример: 99 
		 * Изход: 1100011
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("This is a program that turns a number to its binary equivalent");
		System.out.println("Please enter a number");
		int x = sc.nextInt();
		sc.close();

		int number = x;
		int digits = 0;

		while (number != 0) {
			number = number / 2;
			digits++;
		}
		if (digits == 0) {
			digits = 1;
		}

		int[] array = new int[digits];
		for (int i = array.length - 1; i >= 0; i--) {
			int digit = x % 2;
			array[i] = digit;
			x = x / 2;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}
