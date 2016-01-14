import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		// Задача 1:
		// Да се състави програма, чрез която се въвеждат два низа съдържащи
		// до 40 главни и малки букви.
		// Като резултат на екрана да се извеждат низовете само с главни и само
		// с малки букви.
		// Пример: Abcd Efgh
		// Изход: ABCD abcd EFGH efgh

		System.out.println("This is a program that prints two words with uppercases only and lowercases only");

		String text1;
		String text2;
		boolean allLetters = true;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter the first word (up to 40 letters)");
			text1 = sc.nextLine();
			allLetters = true;
			for (int i = 0; i < text1.length(); i++) {
				if (!(
						(text1.charAt(i) >= 'A' && text1.charAt(i) <= 'Z') || 
						(text1.charAt(i) >= 'a' && text1.charAt(i) <= 'z')
						)) 
				{
					System.out.println("There is a non letter symbol in that word.");
					allLetters = false;
					break;
				}
			}
			
		} while (text1.length() > 40 || !allLetters);

		
		do {
			System.out.println("Please enter the second word (up to 40 letters)");
			text2 = sc.nextLine();
			allLetters = true;
			for (int i = 0; i < text2.length(); i++) {
				if (!(
						(text2.charAt(i) >= 'A' && text2.charAt(i) <= 'Z') || 
						(text2.charAt(i) >= 'a' && text2.charAt(i) <= 'z')
						)) 
				{
					System.out.println("There is a non letter symbol in that word.");
					allLetters = false;		
					break;
				}
			}
			
		} while (text2.length() > 40 || !allLetters);
		sc.close();

		System.out.println("The two words in all uppercases and lowercases are:");
		System.out.print(text1.toUpperCase().concat(" "));
		System.out.print(text1.toLowerCase().concat(" "));
		System.out.print(text2.toUpperCase().concat(" "));
		System.out.print(text2.toLowerCase());
	}
}
