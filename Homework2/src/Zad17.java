import java.util.Scanner;

public class Zad17 {

	public static void main(String[] args) {

		// ������ 17:
		// �� �� ������� ��������, ����� ������� �������, ����� ������ ��
		// �������� ��� ����� *, � ������������ � ��������� ��� ������� ����.
		// ������ ����� b - ������� �� �������� ����� �� ��������� [3..20], c -
		// ����� ����.
		// ���������� �� �������� ����� for.
		// ������: 4 +
		// �����:
		// ****
		// *++*
		// *++*
		// ****

		Scanner sc = new Scanner(System.in);
		System.out.println(
				"���� � ��������, ����� ������� �������, ����� ������ �� �������� ��� ����� *, � ������������ � ��������� ��� ������� ����.");

		int b;
		do {
			System.out.println("����, �������� ������ �� �������� [3..20]:");
			System.out.print("b = ");
			b = sc.nextInt();
		} while ((b < 3) || (b > 20));

		System.out.println("����, �������� ������ �� ������������ �� ��������:");
		char c = sc.next().charAt(0);
		sc.close();

		for (int row = 1; row <= b; row++) {
			if (row == 1 || row == b) {
				for (int i = 1; i <= b; i++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= b; j++) {
					if ((j == 1) || (j == b)) {
						System.out.print("*");
					} else {
						System.out.print(c);
					}
				}
			}

			System.out.println();
		}
	}

}
