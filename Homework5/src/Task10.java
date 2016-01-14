import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		// Задача 10:
		// Да се състави програма, която по даден низ връща друг,
		// символите, на който са получени като към всеки код на символ
		// от ASCII таблицата е добавеното числото 5 и е записан
		// новополучения символ.
		// Пример :
		// Вход: Hello
		// Изход: Mjqqt

		System.out.println("Please enter a word");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		sc.close();

		for (int i = 0; i < word.length(); i++) {
			char newLetter = (char) (word.charAt(i) + 5);

			System.out.print(newLetter);
		}
	}

}