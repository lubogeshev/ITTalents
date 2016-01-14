import java.util.Scanner;

public class Zad24 {

	public static void main(String[] args) {

		// Задача 24:
		// Едно число X е палиндром, aко се чете еднакво отпред назад и
		// отзад напред.
		// Да се състави програма, която проверява дали въведено число е
		// палиндром.
		// Входни данни: N - естествено число от интервала [10 .. 30000].
		// Пример: 17571
		// Изход: числото е палиндром
		// Използвайте цикъл do-while.

		System.out.println("Това е програма, която  проверява дали дадено число е палиндром.");
		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.println("Моля, въведете число N [10..30000]:");
			System.out.print("N = ");
			n = sc.nextInt();
		} while ((n < 10) || (n > 30_000));
		sc.close();

		int number = n;
		int reverse = 0;

		do {
			int digits = n % 10;
			reverse = reverse * 10 + digits;
			n = n / 10;
		} while (n > 0);

		System.out.println(number == reverse ? "Числото е палиндром" : "Числото не е палиндром");



	}
}
