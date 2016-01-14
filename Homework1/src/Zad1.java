import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {

		// Задача 1:
		// Да се изведат съобщения към потребителя и да се прочетат 2 числа от
		// клавиатурата A и B (може да са с плаваща запетая – double).
		// После да се прочете 3-то число C и да се провери дали то е м/у A и B.
		// Да се изведе подходящо съобщение за това дали C е между A и B.

		Scanner sc = new Scanner(System.in);

		System.out.println("Това е програма, която изчислява дали дадено число C се намира между други 2 числа.");
		System.out.println("Моля, въведете последователно 2 реални числа А и B, които да са граница на проверката:");

		System.out.print("A = ");
		double A = sc.nextDouble();

		System.out.print("B = ");
		double B = sc.nextDouble();

		System.out.println("Моля, въведете числото, за което искате да проверите дали е между предходните две:");
		System.out.print("C = ");
		double C = sc.nextDouble();

		sc.close();

		if (((C < A) && (C < B)) || ((C > A) && (C > B))) {
			System.out.println("C е извън интервала от A до B");
		} else {
			System.out.println("C е в интервала от A до B");
		}

	}
}
