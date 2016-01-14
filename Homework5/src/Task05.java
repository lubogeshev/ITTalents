import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {

		// ������ 5:
		// �� �� ������� ��������, ���� ����� �� �������� 2 ������ �� �����
		// (����).
		// ��� � ����� ������ ������� ���� � ���� ����, �� �� ������ �� ������
		// ������� ������ ������������, � ������� ����������, ���� �� �� ��
		// �������� � ����� �� ����.
		// ��� �������� ����� ��� ���� �� �� ������ ���� ������������
		// ���������.
		// ������ :
		// �
		// �
		// �����
		// �
		// �
		// �

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
