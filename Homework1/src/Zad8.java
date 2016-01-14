import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		// ������ 8:
		// �� �� ������� ��������, ����� ���� �� ��������� 4-������o
		// ���������� ����� �� ��������� [1000.. 9999]. �� ���� ����� ��
		// �������� 2 ���� 2-������� �����. ������� ����� �� ������� �� 1-��
		// � 4-�� ����� �� ���������� �����. ������� ����� �� ������� �� 2-�a -
		// 3-�� ����� �� ���������� �����. ���� �������� �� �� ������ ���� 1-��
		// ���� ����� e ��-����� <, ����� = ��� ��-������ �� 2-�� �����.
		// ������: 3332 �����: ��-����� (32<33)
		// ������: 1144 �����: ����� (14=14)
		// ������: 9875 �����: ��-������ (95>87)

		Scanner sc = new Scanner(System.in);
		System.out.println("����, �������� ���� ������������� ����� x:");

		System.out.print("x = ");
		int x = sc.nextInt();
		sc.close();

		if (x <= 999 || x >= 10000) {
			System.out.println("���������� ����� �� � �������������.");
		} else {
			int a = x / 1000;
			int b = x % 1000 / 100;
			int c = x % 100 / 10;
			int d = x % 10;

			int newnumber1 = 10 * a + d;
			int newnumber2 = 10 * b + c;

			if (newnumber1 < newnumber2) {
				System.out.println("��-����� (" + newnumber1 + " < " + newnumber2 + ")");
			} else if (newnumber1 > newnumber2) {
				System.out.println("��-������ (" + newnumber1 + " > " + newnumber2 + ")");
			} else {
				System.out.println("����� (" + newnumber1 + " = " + newnumber2 + ")");

			}
		}

	}

}
