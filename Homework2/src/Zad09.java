import java.util.Scanner;

public class Zad09 {

	public static void main(String[] args) {

		// Задача 9: Да се прочетат 2 числа от клавиатурата А и В.
		// Да се изведат всички числа от А до В на степен 2(разделени със
		// запетая).Ако някое число е кратно на 3, да се изведе съобщение че
		// числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
		// пропуснатите) стане по-голяма от 200, да се прекрати извеждането.

		Scanner sc = new Scanner(System.in);
		System.out.println("Моля, въведете последователно 2 числа");

		System.out.println("Въведете първото число:");
		System.out.print("A = ");
		int a = sc.nextInt();

		System.out.println("Въведете второто число:");
		System.out.print("B = ");
		int b = sc.nextInt();
		sc.close();

		int sum = 0;

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}

		System.out.printf("Квадратите на числата от %d до %d, прескачайки тези, кратни на 3, \n", a, b);
		System.out.println("прекратявайки извеждането при сума от квадратите > 200, са:");

		for (int i = a; i <= b; i++) {
			int sqr = i * i;
			int sqr3 = i * i;
			if (sqr3 % 3 == 0) {
				System.out.print("skip " + sqr3 + ", ");
			} else {
				System.out.print(sqr + ", ");
				sum = sum + sqr;
				if (sum > 200) {
					break;
				}
			}

		}
		System.out.println();
		System.out.println("а сумата от тези числа, без пескочените, е " + sum);
		
	}

}
