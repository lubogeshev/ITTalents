import java.util.Scanner;

public class Zad25 {

	public static void main(String[] args) {
		// Задача 25:
		// Да се направи програма, която по дадено число N, да изчислява
		// N!, т.е. 1*2*3*4...*N.
		// Пример: 5
		// Изход: 120
		// Използвайте цикъл do-while.
		System.out.println("Това е програма, която изчислява N! (N факториел)");

		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.println("Моля, въведете число N [N >= 1]:");
			System.out.print("N = ");
			n = sc.nextInt();
		} while (n <= 0);
		sc.close();

		int fact = 1;
		int i = 1;
		do {
			fact = fact * i;
			i++;
		} while (i <= n);

		System.out.println("N! = " + fact);

	}

}
