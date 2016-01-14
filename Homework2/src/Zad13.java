import java.util.Scanner;

public class Zad13 {

	public static void main(String[] args) {

		// ������ 13: �� �� ������� ��������, ����� ������� ������
		// ���������� ���������� �����, ����� ���� ���� �� ������� �����
		// �� ������ �����.
		// ������ : sum, ������ 2>=sum<=27.
		// ������: 26
		// �����: 899, 989, 998.

		System.out.println(
				"���� � ��������, ����� ������� ������ ���������� ���������� �����, ����� ���� ���� �� ������� ����� �� ������ �����.");
		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.println("����, �������� ����� N [2>=N<=27]");
			System.out.print("N = ");
			n = sc.nextInt();
		} while ((n < 2) || (n > 27));
		sc.close();

		for (int x = 100; x <= 999; x++) {

			int a = x / 100;
			int b = x % 100 / 10;
			int c = x % 10;

			if (a + b + c == n) {
				System.out.println(x);
			}

		}
	}
}
