import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		// Задача 2:
		// Да се състави програма, чрез която от клавиатурата се въвеждат
		// последователно две думи с дължина 10-20 знака.
		// Програмата да размени първите им 5 знака и да изведе дължината на
		// по-дългата, както и новото им съдържание.
		// Пример: uchilishe uchenik
		// Изход: 9 uchenishe

		System.out.println("This is a program that makes a new word from the first 5 letters of 2 words");

		Scanner sc = new Scanner(System.in);
		boolean twoWords = true;
		boolean wrodsLength = true;
		String[] words;

		do {
			System.out.println();
			System.out.println("Please enter two words on the next line, dividing them with a space.");
			System.out.println("Both words should contain from 10 to 20 letters.");
			String inputText = sc.nextLine();
			inputText = inputText.trim();
			words = inputText.split(" ");
			twoWords = true;
			wrodsLength = true;

			if (inputText.indexOf(" ") == -1) {
				System.out.println("You have entered just 1 word!");
				twoWords = false;
			}
			for (int i = 0; i < words.length; i++) {
				if (i > 1) {
					System.out.println("You have entered more than 2 words!");
					twoWords = false;
					break;
				}
				if (words[i].length() < 10 || words[i].length() > 20) {
					System.out.println("Word " + (i + 1) + " is not in the required lentgth range.");
					wrodsLength = false;
				}
			}

		} while (!twoWords || !wrodsLength);
		sc.close();

		String longest = words[0];
		if (words[0].length() < words[1].length()) {
			longest = words[1];
		}
		System.out.println("The longest word contains " + longest.length() + " letters");

		StringBuilder newWord1 = new StringBuilder();
		StringBuilder newWord2 = new StringBuilder();

		newWord1.append(words[0].substring(0, 5)).append(words[1].substring(5, words[1].length()));
		newWord2.append(words[1].substring(0, 5)).append(words[0].substring(5, words[0].length()));

		System.out.println("After swapping the first 5 letters of the words, they become:");
		System.out.println(newWord1 + " " + newWord2);

	}
}
