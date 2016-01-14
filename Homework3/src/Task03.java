import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		/*
		 * Задача 3: Да се въведе число, след което да се създаде масив с 10
		 * елемента по следния начин: 
		 * Първите 2 елемента на масива са въведеното число. 
		 * Всеки следващ елемент на масива е равен на сбора от предишните
		 * 2 елемента в масива. 
		 * След това изведете масива .
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number for the array's length");
		int n = sc.nextInt();
		sc.close();

		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			if (i == 0 || i == 1) {
				array[i] = n;
			} else {
				array[i] = (array[i - 1] + array[i - 2]);
			}
		}

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
