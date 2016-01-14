import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {

		// Задача 9:
		// Да се състави програма, чрез която по въведен низ съдържащ букви,
		// цифри, знак минус '-' се извежда сборът на въведените числа като се
		// отчита знакът '-' пред съответното число.
		// Вход: asd-12sdf45-56asdf100
		// Изход:
		// -12
		// 45
		// -56
		// 100
		// Сума = 77

		System.out.println("This is a program that calculates the sum of all numbers in a string");
		System.out.println("Please enter a string");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		sc.close();

		int sum = 0;
		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) >= '0' && text.charAt(i) <= '9') {

				int x = Character.getNumericValue(text.charAt(i));

				if (i != 0 && text.charAt(i - 1) == '-') {

					x = -Character.getNumericValue(text.charAt(i));
				}
				System.out.println(x);
				sum += x;
			}
		}
		System.out.println("The sum of the digits in this string is " + sum);

	}

}
