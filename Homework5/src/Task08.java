import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {

		// ������ 8:
		// �� �� ������� ��������, ���� ����� �� ������� ��� �� �������
		// (������, ���).
		// ���������� �� ������ �� ������ ���� ��������� ������ � ���������,
		// �.�. ���� ����� ������-������� � �������-������ � ���� � ���.
		// ����: �����
		// �����: ��.
		// ����: ��������
		// �����: ��.

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
