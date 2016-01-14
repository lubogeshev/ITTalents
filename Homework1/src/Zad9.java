import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {
		// Задача 9:
		// Да се състави програма, която чете от конзолата 2 естествени
		// двуцифрени числа a,b.
		// Програмата да изведе в конзолата дали последната цифра от
		// произведението на двете числа е четна, както и самата цифра.
		// Входни данни: a,b - естествени числа от интервала [10..99].
		// Пример: 15, 25
		// Изход: 375, 5 нечетна

		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Това е програма, която разпечатва дали последната цифра от произведението на двете числа е четна, както и самата цифра.");
		System.out.println("Моля, въведете последователно 2 естествени двуцифрени числа a и b:");

		System.out.print("a = ");
		int a = sc.nextInt();
		if ((a < 10) || (a > 99)) {
			System.out.println("Въведеното число a не е двуцифрено!");
		} else {
			System.out.print("b = ");
			int b = sc.nextInt();
			sc.close();
			if ((b < 10) || (b > 99)) {
				System.out.println("Въведеното число b не е двуцифрено!");

			} else {

				int mul = a * b;
				int unit = mul % 10;

				if (mul % 2 == 0) {
					System.out.println("a * b = " + mul + ", " + unit + " четна");
				} else {
					System.out.println("a * b = " + mul + ", " + unit + " нечетна");

				}
			}
		}
	}
}
