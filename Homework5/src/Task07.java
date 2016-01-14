import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {

		// Задача 7:
		// Да се състави програма, която чете набор от думи разделени с
		// интервал.
		// Като резултат да се извеждат броя на въведените думи, както и броя
		// знаци в най-дългата дума.
		// Пример: asd fg hjkl
		// Изход: 3 думи, най-дългата е с 4 символа.

		System.out.println("This is a program that counts the number of words in a word sequence "
				+ "and tells the length of the longes word");
		System.out.println("Please enter a word sequence:");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine().trim();
		sc.close();

		String[] words = sentence.split(" ");

		String longest = words[0];

		for (int i = 0; i < words.length; i++) {

			if (words[i].length() > longest.length()) {
				longest = words[i];
			}
		}
		System.out.println(words.length + " words, the longest is " + longest.length() + " symbols long.");
	}
}
