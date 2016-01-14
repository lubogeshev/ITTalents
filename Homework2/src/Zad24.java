import java.util.Scanner;

public class Zad24 {

	public static void main(String[] args) {

		// ������ 24:
		// ���� ����� X � ���������, a�� �� ���� ������� ������ ����� �
		// ����� ������.
		// �� �� ������� ��������, ����� ��������� ���� �������� ����� �
		// ���������.
		// ������ �����: N - ���������� ����� �� ��������� [10 .. 30000].
		// ������: 17571
		// �����: ������� � ���������
		// ����������� ����� do-while.

		System.out.println("���� � ��������, �����  ��������� ���� ������ ����� � ���������.");
		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.println("����, �������� ����� N [10..30000]:");
			System.out.print("N = ");
			n = sc.nextInt();
		} while ((n < 10) || (n > 30_000));
		sc.close();

		int number = n;
		int reverse = 0;

		do {
			int digits = n % 10;
			reverse = reverse * 10 + digits;
			n = n / 10;
		} while (n > 0);

		System.out.println(number == reverse ? "������� � ���������" : "������� �� � ���������");



	}
}
