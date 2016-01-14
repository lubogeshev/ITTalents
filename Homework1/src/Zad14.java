import java.util.Scanner;

public class Zad14 {

	public static void main(String[] args) {

		// ������ 14:
		// �� �� ������� ��������, ����� �� �������� ���������� �� 2 �������
		// �� ���������� ����� ������� ������� ���� �� �������� � ������� ���
		// �������� ����.
		// ���������� ����� � ���������.
		// �������� �� ��� ������ ����� �� ��������� [1..8].
		// ������: 2 2 3 2
		// �����: ��������� �� � �������� ����

		Scanner sc = new Scanner(System.in);
		System.out.println(
				"���� � ��������, ����� ��������� ���� 2 ������� �� ���������� ����� �� �������� � ������� ��� �������� ����.");
		System.out.println("����, �������� ������������ �� ������� ���� [1; 8]");
		System.out.print("x1 = ");
		byte x1 = sc.nextByte();

		System.out.print("y1 = ");
		byte y1 = sc.nextByte();
		if ((x1 < 1 || x1 > 8) || (y1 < 1 || y1 > 8)) {
			System.out.println("���������� ���������� �� �� ������� �� ���� �� ���������� �����!");
		} else {
			System.out.println("����, �������� ������������ �� ������� ���� [1; 8]");
			System.out.print("x2 = ");
			byte x2 = sc.nextByte();

			System.out.print("y2 = ");
			byte y2 = sc.nextByte();
			sc.close();

			if ((x2 < 1 || x2 > 8) || (y2 < 1 || y2 > 8)) {
				System.out.println("���������� ���������� �� �� ������� �� ���� �� ���������� �����!");
			} else {

				int sum1 = x1 + y1;
				int sum2 = x2 + y2;

				if ((sum1 + sum2) % 2 == 0) {
					System.out.println("����� ������ [" + x1 + "," + y1 + "] � [" + x2 + "," + y2 + "] �� � ������� ����.");

				} else {
					System.out.println("����� ������ [" + x1 + "," + y1 + "] � [" + x2 + "," + y2 + "] �� � �������� ����.");
				}

			}

		}

	}

}
