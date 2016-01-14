import java.util.Scanner;

public class Zad14 {
	public static void main(String[] args) {

		// Задача 14: Да се състави програма, която по въведено
		// естествено число N от интервала [10..200] извежда в обратен
		// ред всички числа, които са кратни на 7 и са по-малки от N.

		System.out.println("Това е програма, която извежда в обратен ред всички числа, които са кратни на 7 и са по-малки от N.");
		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.println("Моля, въведете число N [10...200]");
			System.out.print("N = ");
			n = sc.nextInt();
		} while ((n < 10) || (n > 200));
		sc.close();

		for (int x = n; x >= 10; x--) {

			if (x % 7 == 0) {
				System.out.println(x);
			}

		}

	}
}