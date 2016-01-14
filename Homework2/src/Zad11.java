import java.util.Scanner;

public class Zad11 {

	public static void main(String[] args) {

		// Задача 11: Въведете число N чрез конзолата и изкарайте като
		// резултат следния триъгълник с височина N:
		//   *
		//  ***
		// *****
		// .................
		// Кaто допълнително упражнение – нарисувайте същия
		// триъгълник, но незапълнен.


		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.println("Моля, въведете число N [N >= 1]:");
			System.out.print("N = ");
			n = sc.nextInt();
		} while (n <= 0);
		sc.close();

		// Запълнен:
		for (int row = 1; row <= n; row++) {
			for (int i = 1; i <= n - row; i++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * row - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// Кух:
		for (int row = 1; row <= n; row++) {
			if (row == n) {
				for (int k = 1; k <= 2 * row - 1; k++) {
					System.out.print("*");
				}
			} else {
				for (int i = 1; i <= n - row; i++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 2 * row - 1; j++) {
					if ((j == 1) || (j == 2 * row - 1)) {
						System.out.print("*");

					} else {
						System.out.print(" ");
					}
				}
			}

			System.out.println();
		}

	}
}
