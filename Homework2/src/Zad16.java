import java.util.Scanner;

public class Zad16 {

	public static void main(String[] args) {

		// Задача 16:
		// Да се състави програма, чрез която се въвеждат 2 естествени
		// числа N, M от интервала [10..5555].
		// Програмата, чрез цикъл for, да извежда всички числа от
		// интервала, които са кратни на 50 в низходящ ред.
		// Пример: 25,249
		// Изход: 200,150,100, 50.

		Scanner sc = new Scanner(System.in);
		System.out.println("Това е програма, която извежда всички числа от интервал [N,M], които са кратни на 50 в низходящ ред.");

		int n;
		do {
			System.out.println("Въведете първото число [10..5555]:");
			System.out.print("N = ");
			n = sc.nextInt();
		} while ((n < 10) || (n > 5555));

		int m;
		do {
			System.out.println("Въведете второто число [10..5555]:");
			System.out.print("M = ");
			m = sc.nextInt();
		} while ((m < 10) || (m > 5555));
		sc.close();

		if (m > n) {
			int temp = m;
			m = n;
			n = temp;
		}

		if (m < 50 && n < 50) {
			System.out.println("В интервала между " + m + " и " + n + " няма числа кратни на 50.");
		} else {
			for (int x = n; x >= m; x--) {
				if (x % 50 == 0) {
					System.out.println(x);
				}
			}
		}
	}
}
