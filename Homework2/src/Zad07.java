import java.util.Scanner;

public class Zad07 {

	public static void main(String[] args) {

		// ������ 7: ���������� �� 3, �� �� ������� �� ������ ������� n
		// ����� ����� �� ����� �� 3. ������� �� �� ��������� ��� �������.

		Scanner sc = new Scanner(System.in);
		System.out.println("���� � ��������, ����� ������� ������� n ����������� �����, ����� �� ����� �� 3.");

		int n;
		do {
			System.out.println("����, �������� ����� ����� n [n >= 1]:");
			System.out.print("n = ");
			n = sc.nextInt();
		} while (n <= 0);
		sc.close();

		for (int x = 3; x <= (3 * n); x++) {

			if (x == 3) {
				System.out.print(x);
			} else if (x % 3 == 0) {
				System.out.print(", " + x);

			}

		}

	}

}
