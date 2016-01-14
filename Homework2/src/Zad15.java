import java.util.Scanner;

public class Zad15 {

	public static void main(String[] args) {

		// Задача 15: Да се състави програма, която да изчисли сумата на
		// всички числа от 1 до въведено число N.
		// Пример: 5
		// Изход: 15

		System.out.println("Това е програма, която изчислява сумата на всички числа от 1 до въведено число N.");
		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.println("Моля, въведете число N [N >= 1]:");
			System.out.print("N = ");
			n = sc.nextInt();
		} while (n <= 0);
		sc.close();

		int sum = 0;
		int x = 1;
		do {
			sum = sum + x;
			x++;
		} while (x <= n);
		System.out.println("Сумата на числата от 1 до " + n + " = " + sum);

	}

}
