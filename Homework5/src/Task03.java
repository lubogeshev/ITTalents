import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		// ������ 3:
		// �� �� ������� ��������, ���� ����� �� �������� �������������� ���
		// ������ �� ������� ��� ���������.
		// ���������� �� ������� ��������� �� ��������� �� ����������� �� ��
		// �������.
		// ������: ���������, ���������
		// �����:
		// ����� ���� �� � ����� �������.
		// ������� �� �������:
		// 8 �-�
		// 9 �-�

		System.out.println("This is a program that compares every symbol of 2 words and prints"
				+ " the positions where they differ and how.");

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first word:");
		String word1 = sc.nextLine().trim();
		System.out.println("Please enter the second word:");
		String word2 = sc.nextLine().trim();
		sc.close();
		
		String shortestWord = word1;
		if (word1.length() > word2.length()) {
			shortestWord = word2;
		}
		boolean identical = true;
		for (int i = 0; i < shortestWord.length(); i++) {
			if (!(word1.charAt(i) == word2.charAt(i))) {
				System.out.println((i + 1) + " " + word1.charAt(i) + "-" + word2.charAt(i));
				identical = false;
			}
		}
		if (identical) {
			System.out.println("Words are identical.");
		}
	}
}
