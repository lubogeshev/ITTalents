import java.util.Scanner;

public class Zad18 {

	public static void main(String[] args) {

		// ������ 18:
		// �� �� ������� ��������, ���� ����� �� ������� ��� ����� ��
		// ��������� [1..9].
		// ���������� �� ������� ��������� �� ���������.
		// ������������ �������� �� ����������� � ���������� �� 2-�� �����.
		// ������: 2 2
		// �����:
		// 1*1= 1;
		// 1*2= 2;
		// 2*1= 2;
		// 2*2= 4;

		System.out.println("���� � ��������, ����� ������� ��������� �� ���������.");
		System.out.println("������������ �������� �� ����������� � ���������� �� 2-�� �����.");
		Scanner sc = new Scanner(System.in);

		int x;
		do {
			System.out.println("�������� ������� ����� [1..9]:");
			System.out.print("x = ");
			x = sc.nextInt();
		} while ((x < 1) || (x > 9));

		int y;
		do {
			System.out.println("�������� ������� ����� [1..9]:");
			System.out.print("y = ");
			y = sc.nextInt();
		} while ((x < 1) || (x > 9));
		sc.close();

		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {

				System.out.println(i + "*" + j + " = " + (i * j));

			}
		}

	}

}
