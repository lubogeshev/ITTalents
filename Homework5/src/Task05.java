import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {

		// Задача 5:
		// Да се състави програма, чрез която се въвеждат 2 редици от знаци
		// (думи).
		// Ако в двете редици участва един и същи знак, да се изведе на екрана
		// първата редица хоризонтално, а втората вертикално, така че да се
		// пресичат в общия си знак.
		// Ако редиците нямат общ знак да се изведе само уведомително
		// съобщение.
		// Пример :
		// м
		// а
		// шапка
		// и
		// н
		// а

		System.out.println("This is a program that crosses 2 words on their first common symbol.");

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first word:");
		String wordHor = sc.nextLine().trim();
		System.out.println("Please enter the second word:");
		String wordVer = sc.nextLine().trim();
		sc.close();

		boolean willCross = false;
		int common = -1;

		for (int i = 0; i < wordHor.length(); i++) {

			common = wordVer.indexOf(wordHor.charAt(i));

			if (common >= 0) {
				willCross = true;
				break;
			}
		}

		for (int j = 0; j < wordVer.length(); j++) {

			for (int i = 0; i < wordHor.length(); i++) {

				if (i == common) {
					
					System.out.print(wordVer.charAt(j));
				}
				else {
					System.out.print(" ");
				}
				System.out.println();
			}
		}
		if (!willCross)

		{
			System.out.println("The words do not have a common letter.");
		}

	}
}
