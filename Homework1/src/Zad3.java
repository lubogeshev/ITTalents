import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {

		// ������ 3:
		// �������� 2 �������� ����� �� ��������� � ��������� ���������� ��.
		// ������������ ������ ���������

		Scanner sc = new Scanner(System.in);
		System.out.println("���� � ��������, ����� ������� ����������� �� 2 �����.");
		System.out.println("����, �������� �������������� 2 �������� ���� ����� � � B:");

		System.out.print("A = ");
		int A = sc.nextInt();

		System.out.print("B = ");
		int B = sc.nextInt();
		sc.close();

		if (A != B) {
			int temp = A;
			A = B;
			B = temp;
			System.out.println("���� ���� �������� �����������:");
			System.out.println("A = " + A);
			System.out.println("B = " + B);
		} else {
			System.out.println("���������� ����� �� �������!");
		}
	}

}
