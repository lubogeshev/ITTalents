import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		// ������ 10:
		// �� �� ������� ��������, ����� �� ����� ��� ����� ����,
		// ���������, �� ����� �� �������� ���� ��� ����� ��� �� ������
		// �� ASCII ��������� � ���������� ������� 5 � � �������
		// ������������� ������.
		// ������ :
		// ����: Hello
		// �����: Mjqqt

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