import java.util.Scanner;

public class Zad5 {

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

		if (A != B && B != C && A != C) {
			int temp;
			if (B > A) {
				temp = B;
				B = A;
				A = temp;
			}
			if (C > B) {
				temp = C;
				C = B;
				B = temp;
			}
			if (B > A) {
				temp = B;
				B = A;
				A = temp;
			}
			System.out.println(A + " " + B + " " + C);
		} else {
			System.out.println("���������� ����� �� �� ��������!");
		}
	}
}
