import java.util.Scanner;

public class Zad5v2 {

	public static void main(String[] args) {

		// ������ 5:
		// �������� 3 �������� ����� �� ��������� � �� ������������ � ��������
		// ���.

		Scanner sc = new Scanner(System.in);
		System.out.println("���� � ��������, ����� ���������� � �������� ��� 3 �����.");
		System.out.println("����, �������� �������������� 3 �������� ���� ����� �, B � C:");

		System.out.print("A = ");
		int A = sc.nextInt();

		System.out.print("B = ");
		int B = sc.nextInt();

		System.out.print("C = ");
		int C = sc.nextInt();
		sc.close();

		if (A > B) {
			if (B > C) {
				System.out.println(A + " " + B + " " + C);
			} else {
				if (A > C)
					System.out.println(A + " " + C + " " + B);
				else
					System.out.println(C + " " + A + " " + B);
			}
		} else {
			if (C > B) {
				System.out.println(C + " " + B + " " + A);
			} else {
				if (C > A)
					System.out.println(B + " " + C + " " + A);
				else
					System.out.println(B + " " + A + " " + C);
			}
		}
	}

}
