import java.util.Scanner;

public class Zad15 {

	public static void main(String[] args) {

		// ������ 15: �� �� ������� ��������, ����� �� ������� ������ ��
		// ������ ����� �� 1 �� �������� ����� N.
		// ������: 5
		// �����: 15

		System.out.println("���� � ��������, ����� ��������� ������ �� ������ ����� �� 1 �� �������� ����� N.");
		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.println("����, �������� ����� N [N >= 1]:");
			System.out.print("N = ");
			n = sc.nextInt();
		} while (n <= 0);
		sc.close();

		int sum = 0;
		int x = 1;
		do {
			sum = sum + x;
			x++;
		} while (x <= n);
		System.out.println("������ �� ������� �� 1 �� " + n + " = " + sum);

	}

}
