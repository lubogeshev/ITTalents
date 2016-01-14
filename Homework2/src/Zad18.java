import java.util.Scanner;

public class Zad18 {

	public static void main(String[] args) {

		// Задача 18:
		// Да се състави програма, чрез която се въвежда две числа от
		// интервала [1..9].
		// Програмата да извежда таблицата за умножение.
		// Максималната стойност на множителите е определена от 2-те числа.
		// Пример: 2 2
		// Изход:
		// 1*1= 1;
		// 1*2= 2;
		// 2*1= 2;
		// 2*2= 4;

		System.out.println("Това е програма, която извежда таблицата за умножение.");
		System.out.println("Максималната стойност на множителите е определена от 2-те числа.");
		Scanner sc = new Scanner(System.in);

		int x;
		do {
			System.out.println("Въведете първото число [1..9]:");
			System.out.print("x = ");
			x = sc.nextInt();
		} while ((x < 1) || (x > 9));

		int y;
		do {
			System.out.println("Въведете второто число [1..9]:");
			System.out.print("y = ");
			y = sc.nextInt();
		} while ((x < 1) || (x > 9));
		sc.close();

		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {

				System.out.println(i + "*" + j + " = " + (i * j));

			}
		}

	}

}
