import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {

		// ������ 7:
		// �� �� ������� ��������, ����� ���� ����� �� ���� ��������� �
		// ��������.
		// ���� �������� �� �� �������� ���� �� ���������� ����, ����� � ����
		// ����� � ���-������� ����.
		// ������: asd fg hjkl
		// �����: 3 ����, ���-������� � � 4 �������.

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
