import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

		/*
		 * Задача 14: Имате предварително въведен едномерен масив, съдържащ
		 * реални числа. 
		 * Да се състави програма, чрез която се избират само
		 * елементи от масива със стойности от интервала [-2.99..2.99] и се
		 * отпечатват в нов масив. Новият масив да се извежда на екрана. 
		 * Пример: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2 
		 * Изход: 0.2; 0.99; 1.4; 1.2
		 */

		System.out.println("This is a program that shows all numbers between [-2.99..2.99] from an array.");

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the array's length:");
		int n = sc.nextInt();

		double[] arr = new double[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter a number for cell " + (i + 1));
			arr[i] = sc.nextDouble();
		}
		sc.close();

		System.out.println("You have entered");
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr[i]);
			} else {
				System.out.print(", " + arr[i]);
			}
		}
		System.out.println("]");

		boolean isInInterval = false;
		int counter = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= -2.99 && arr[i] <= 2.99) {
				isInInterval = true;
				counter++;
				if (counter == 1) {
					System.out.println("The numbers between [-2.99..2.99] are:");
					System.out.print("[");
					System.out.print(arr[i] + ", ");
				} else {
					System.out.print(arr[i]);
				}
			}
		}
		if (counter != 0) {
			System.out.println("]");
		}
		
		if (!isInInterval) {
			System.out.println("There are no numbers between [-2.99..2.99] in this array.");
		}
	}
}
