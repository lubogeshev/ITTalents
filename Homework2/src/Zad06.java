import java.util.Scanner;

public class Zad06 {

	public static void main(String[] args) {

		// ������ 6: �� �� ������� ����� �� ������(���������) � �� ��
		// ������ ����� �� ������ ����� ����� 1 � ���������� �����.

		Scanner sc = new Scanner(System.in);
		System.out.println("���� � ��������, ����� ������� ����� �� ������ ����� �� 1 �� �������� �����");

		int x;
		do {
			System.out.println("����, �������� ����� >= 1:");
			System.out.print("x = ");
			x = sc.nextInt();
		} while (x <= 0);
		sc.close();

		int sum = 0;
		for (int i = 1; i <= x; i++) {
			sum = sum + i;

		}
		System.out.print("���������� � " + sum);

	}

}
