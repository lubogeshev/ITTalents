import java.util.Scanner;

public class Zad15 {

	public static void main(String[] args) {
		// ������ 15:
		// �� �� ������� ��������, ����� ������� ���������� ����� �� ���������
		// [0..24].
		// ���������� �� ������ ������������� ��������� ��������� ��������� ���.
		// ��������� ��:
		// [18..4] - ����� �����;
		// [4..9] - ����� ����;
		// [9..18] - ����� ���
		// ������: 10
		// �����: ����� ���

		Scanner sc = new Scanner(System.in);
		System.out.println("���� � ��������, ����� �� ����������!");
		System.out.println("����, �������� ���. [���� ����� �� 0 �� 24]");
		System.out.print("����� � ����� ");
		int time = sc.nextInt();
		sc.close();

		if (time < 0 || time > 24) {
			System.out.println("���������� ��� � ���������!");
		} else {

			if (time >= 4 && time <= 9) {
				System.out.println("����� ����!");
			}
			if (time > 9 && time < 18) {
				System.out.println("����� ���!");
			}
			if ((time >= 0 && time < 4) || (time >= 18 && time <= 24)) {
				System.out.println("����� �����!");

			}

		}
	}

}
