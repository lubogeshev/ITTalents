import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {
		// ������ 9:
		// �� �� ������� ��������, ����� ���� �� ��������� 2 ����������
		// ���������� ����� a,b.
		// ���������� �� ������ � ��������� ���� ���������� ����� ��
		// �������������� �� ����� ����� � �����, ����� � ������ �����.
		// ������ �����: a,b - ���������� ����� �� ��������� [10..99].
		// ������: 15, 25
		// �����: 375, 5 �������

		Scanner sc = new Scanner(System.in);
		System.out.println(
				"���� � ��������, ����� ���������� ���� ���������� ����� �� �������������� �� ����� ����� � �����, ����� � ������ �����.");
		System.out.println("����, �������� �������������� 2 ���������� ���������� ����� a � b:");

		System.out.print("a = ");
		int a = sc.nextInt();
		if ((a < 10) || (a > 99)) {
			System.out.println("���������� ����� a �� � ����������!");
		} else {
			System.out.print("b = ");
			int b = sc.nextInt();
			sc.close();
			if ((b < 10) || (b > 99)) {
				System.out.println("���������� ����� b �� � ����������!");

			} else {

				int mul = a * b;
				int unit = mul % 10;

				if (mul % 2 == 0) {
					System.out.println("a * b = " + mul + ", " + unit + " �����");
				} else {
					System.out.println("a * b = " + mul + ", " + unit + " �������");

				}
			}
		}
	}
}
