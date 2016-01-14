import java.util.Scanner;

public class Zad16 {

	public static void main(String[] args) {

		// ������ 16:
		// �� �� ������� ��������, ���� ����� �� �������� 2 ����������
		// ����� N, M �� ��������� [10..5555].
		// ����������, ���� ����� for, �� ������� ������ ����� ��
		// ���������, ����� �� ������ �� 50 � �������� ���.
		// ������: 25,249
		// �����: 200,150,100, 50.

		Scanner sc = new Scanner(System.in);
		System.out.println("���� � ��������, ����� ������� ������ ����� �� �������� [N,M], ����� �� ������ �� 50 � �������� ���.");

		int n;
		do {
			System.out.println("�������� ������� ����� [10..5555]:");
			System.out.print("N = ");
			n = sc.nextInt();
		} while ((n < 10) || (n > 5555));

		int m;
		do {
			System.out.println("�������� ������� ����� [10..5555]:");
			System.out.print("M = ");
			m = sc.nextInt();
		} while ((m < 10) || (m > 5555));
		sc.close();

		if (m > n) {
			int temp = m;
			m = n;
			n = temp;
		}

		if (m < 50 && n < 50) {
			System.out.println("� ��������� ����� " + m + " � " + n + " ���� ����� ������ �� 50.");
		} else {
			for (int x = n; x >= m; x--) {
				if (x % 50 == 0) {
					System.out.println(x);
				}
			}
		}
	}
}
