import java.util.Scanner;

public class Zad06 {

	public static void main(String[] args) {

		// Задача 6: Да се прочете число от екрана(конзолата) и да се
		// изведе сбора на всички числа между 1 и въведеното число.

		Scanner sc = new Scanner(System.in);
		System.out.println("Това е програма, която извежда сбора от всички числа от 1 до въведено число");

		int x;
		do {
			System.out.println("Моля, въведете число >= 1:");
			System.out.print("x = ");
			x = sc.nextInt();
		} while (x <= 0);
		sc.close();

		int sum = 0;
		for (int i = 1; i <= x; i++) {
			sum = sum + i;

		}
		System.out.print("Резултатът е " + sum);

	}

}
