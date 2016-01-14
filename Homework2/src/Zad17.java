import java.util.Scanner;

public class Zad17 {

	public static void main(String[] args) {

		// Задача 17:
		// Да се състави програма, която извежда квадрат, чийто страни са
		// оформени със знака *, а вътрешността е запълнена със въведен знак.
		// Входни данни b - дължина на страната число от интервала [3..20], c -
		// желан знак.
		// Програмата да използва цикъл for.
		// Пример: 4 +
		// Изход:
		// ****
		// *++*
		// *++*
		// ****

		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Това е програма, която извежда квадрат, чийто страни са оформени със знака *, а вътрешността е запълнена със въведен знак.");

		int b;
		do {
			System.out.println("Моля, въведете страна на квадрата [3..20]:");
			System.out.print("b = ");
			b = sc.nextInt();
		} while ((b < 3) || (b > 20));

		System.out.println("Моля, въведете символ за вътрешността на квадрата:");
		char c = sc.next().charAt(0);
		sc.close();

		for (int row = 1; row <= b; row++) {
			if (row == 1 || row == b) {
				for (int i = 1; i <= b; i++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= b; j++) {
					if ((j == 1) || (j == b)) {
						System.out.print("*");
					} else {
						System.out.print(c);
					}
				}
			}

			System.out.println();
		}
	}

}
