import java.util.Scanner;

public class Zad21 {

	public static void main(String[] args) {
		// ������ 21:
		// ������ � �������� ����� �����.
		// ��������� �� ������ �� ����� �: 2,3,4,5,6,7,8,9,10, ����, ����, ���,
		// ���.
		// ��������� �� ���� �� ������� �: ������, ����, ����, ����.
		// �� �� ������� ��������, ���� ����� �� ������� N - ����� �� ���������
		// [1..51] � �� �������� ��������� ����� ����� �
		// ���������� ��-������ ����� �� �������.
		// ������: 47.
		// �����: ��� ����, ��� ����, ��� ������, ��� ����, ��� ����, ��� ����

		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.println("����, �������� ����� �� ����� N �� �������� ����� [1..52]:");
			System.out.print("N = ");
			n = sc.nextInt();
		} while ((n < 1) || (n > 52));
		sc.close();

		for (int card = n; card <= 52; card++) {
			int number = (card - 1) / 4 + 2;
			int suit = card % 4;
			switch (number) {
			case 2:
				System.out.print("2-�� ");
				break;
			case 3:
				System.out.print("3-�� ");
				break;
			case 4:
				System.out.print("4-�� ");
				break;
			case 5:
				System.out.print("5-�� ");
				break;
			case 6:
				System.out.print("6-�� ");
				break;
			case 7:
				System.out.print("7-�� ");
				break;
			case 8:
				System.out.print("8-�� ");
				break;
			case 9:
				System.out.print("9-�� ");
				break;
			case 10:
				System.out.print("10-�� ");
				break;
			case 11:
				System.out.print("���� ");
				break;
			case 12:
				System.out.print("���� ");
				break;
			case 13:
				System.out.print("��� ");
				break;
			case 14:
				System.out.print("��� ");
				break;
			}

			switch (suit) {
			case 0:
				System.out.print("����");
				break;
			case 1:
				System.out.print("������");
				break;
			case 2:
				System.out.print("����");
				break;
			case 3:
				System.out.print("����");
				break;
			}
			if (card != 52) {
				System.out.print(", ");
			}
		}
	}

}
