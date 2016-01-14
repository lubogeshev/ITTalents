import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {

		// Задача 8:
		// Да се състави програма, чрез която се въвежда ред от символи
		// (стринг, низ).
		// Програмата да изведе на екрана дали въведения стринг е палиндром,
		// т.е. дали четен отляво-надясно и отдясно-наляво е един и същ.
		// Вход: капак
		// Изход: да.
		// Вход: тенджера
		// Изход: не.

		System.out.println("This is a program that checks if a string is palyndrom.");
		System.out.println("Please enter a string:");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		sc.close();

		StringBuilder reverseText = new StringBuilder();

		for (int i = text.length() - 1; i >= 0; i--) {
			reverseText.append(text.charAt(i));
		}

		if (text.equalsIgnoreCase(reverseText.toString())) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}
	}

}
