import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {

		/*
		 * Задача 16: Да се състави програма, чрез която предварително въведени
		 * 10 реални числа от интервала се обработват по следния начин: 
		 * 1. Извежда съществуващите числа. 
		 * 2. Всички елементи със стойност по-малки от -0.231 се заменят със 
		 * сумата от квадрата на поредния им
		 * номер + числото 41.25, а всички останали елементи се заменят с
		 * произведението между самия елемент и неговият пореден номер.
		 * Поредният номер на първият елемент е 1. 
		 * 3. Да се изведат елементите от началния и новообразувания масив. 
		 * Пример: -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4 
		 * Изход: 42.25, 45.25, 9.3, 16.8, 0, 38.4, 90.25, 68.8, 81.9,141.25
		 */

		System.out.println("This is a program that transforms a 10 number array to a new wierd array.");
		double[] arr = new double[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter a number for cell " + (i + 1));
			arr[i] = sc.nextDouble();
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

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < -0.231) {
				arr[i] = (i + 1) * (i + 1) + 41.25;
			} else {
				arr[i] *= (i + 1);
			}
		}

		System.out.println("After the transformation, the array is:");
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr[i]);
			} else {
				System.out.print(", " + arr[i]);
			}
		}
		System.out.println("]");
	}
}
