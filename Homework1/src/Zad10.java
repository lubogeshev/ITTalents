import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		// ������ 10:
		// ������ �� �� ������� �������� � ����. ����� 2 ���� � ���������� 2 �
		// 3 ����� � �� �������� ������������.
		// �� �� ������� ��������, ����� �� ����� ���� ������� ��� �� ��������
		// ��������� � ���� ����, �.�. ��-����� ���� �� �� ����� ����� ��
		// ������. ������ �� ����� �� �� ������� � �������� ���������� ����.
		// ������ �����: ���������� ����� �� ��������� [10..9999].
		// ������: 107
		// �����: 21 ���� �� 2 �����,
		// 21 ���� �� 3 �����
		// ������������ ���� �� 2 �����

		Scanner sc = new Scanner(System.in);
		System.out.println("����, �������� ����� �� �������� � ���� V [�� 10 �� 9999�.]:");
		System.out.print("V = ");
		int v = sc.nextInt();
		sc.close();
		if ((v < 10) || (v > 9999)) {
			System.out.println("���������� ���� � ����� ����������� �������!");
		} else {
			System.out.println("� ������� �� 2 ���� �� �� 2�. � 3�. ��������� �� �� ������, �����������");

			int bucket2 = v / 5;
			int bucket3 = v / 5;
			int last = v % 5;

			if (last == 1) {
				bucket2++;
				bucket3--;
			}
			if (last == 2) {
				bucket2++;
			}
			if (last == 3) {
				bucket3++;
			}
			if (last == 4) {
				bucket2 += 2;
			}
			System.out.println(bucket2 + " ���� 2-��������� � " + bucket3 + " ���� 3-��������� ����.");

		}
	}

}
