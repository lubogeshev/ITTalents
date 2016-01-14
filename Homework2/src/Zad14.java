import java.util.Scanner;

public class Zad14 {
	public static void main(String[] args) {

		// ������ 14: �� �� ������� ��������, ����� �� ��������
		// ���������� ����� N �� ��������� [10..200] ������� � �������
		// ��� ������ �����, ����� �� ������ �� 7 � �� ��-����� �� N.

		System.out.println("���� � ��������, ����� ������� � ������� ��� ������ �����, ����� �� ������ �� 7 � �� ��-����� �� N.");
		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.println("����, �������� ����� N [10...200]");
			System.out.print("N = ");
			n = sc.nextInt();
		} while ((n < 10) || (n > 200));
		sc.close();

		for (int x = n; x >= 10; x--) {

			if (x % 7 == 0) {
				System.out.println(x);
			}

		}

	}
}