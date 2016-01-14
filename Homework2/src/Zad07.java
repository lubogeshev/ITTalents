import java.util.Scanner;

public class Zad07 {

	public static void main(String[] args) {

		// Задача 7: Започвайки от 3, да се изведат на екрана първите n
		// числа които се делят на 3. Числата да са разделени със запетая.

		Scanner sc = new Scanner(System.in);
		System.out.println("Това е програма, която извежда първите n положителни числа, които се делят на 3.");

		int n;
		do {
			System.out.println("Моля, въведете броят числа n [n >= 1]:");
			System.out.print("n = ");
			n = sc.nextInt();
		} while (n <= 0);
		sc.close();

		for (int x = 3; x <= (3 * n); x++) {

			if (x == 3) {
				System.out.print(x);
			} else if (x % 3 == 0) {
				System.out.print(", " + x);

			}

		}

	}

}
