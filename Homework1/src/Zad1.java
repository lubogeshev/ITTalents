import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {

		// ������ 1:
		// �� �� ������� ��������� ��� ����������� � �� �� �������� 2 ����� ��
		// ������������ A � B (���� �� �� � ������� ������� � double).
		// ����� �� �� ������� 3-�� ����� C � �� �� ������� ���� �� � �/� A � B.
		// �� �� ������ ��������� ��������� �� ���� ���� C � ����� A � B.

		Scanner sc = new Scanner(System.in);

		System.out.println("���� � ��������, ����� ��������� ���� ������ ����� C �� ������ ����� ����� 2 �����.");
		System.out.println("����, �������� �������������� 2 ������ ����� � � B, ����� �� �� ������� �� ����������:");

		System.out.print("A = ");
		double A = sc.nextDouble();

		System.out.print("B = ");
		double B = sc.nextDouble();

		System.out.println("����, �������� �������, �� ����� ������ �� ��������� ���� � ����� ����������� ���:");
		System.out.print("C = ");
		double C = sc.nextDouble();

		sc.close();

		if (((C < A) && (C < B)) || ((C > A) && (C > B))) {
			System.out.println("C � ����� ��������� �� A �� B");
		} else {
			System.out.println("C � � ��������� �� A �� B");
		}

	}
}
