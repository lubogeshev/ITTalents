import java.util.Scanner;

public class Zad08 {

	public static void main(String[] args) {

		// Задача 8: По зададено число n, да се изведе на екрана таблица по
		// следния начин:
		// Въведете n: Въведете n: Въведете n: Въведете n:
		// 1 			2			 3			 4
		// 0			11 			222 		3333
		// 				33 			444 		5555
		// 							666			7777
		// 										9999

		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.println("Моля, въведете число n [n >= 1]:");
			System.out.print("n = ");
			n = sc.nextInt();
		} while (n <= 0);
		sc.close();

		int j = n - 1;

		for (int row = 1; row <= n; row++) {
			
			for (int i = 1; i <= n; i++) {
				System.out.print(j);
			}
			j += 2;
			System.out.println();
		}

	}

}
