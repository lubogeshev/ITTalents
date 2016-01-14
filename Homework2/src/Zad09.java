import java.util.Scanner;

public class Zad09 {

	public static void main(String[] args) {

		// ������ 9: �� �� �������� 2 ����� �� ������������ � � �.
		// �� �� ������� ������ ����� �� � �� � �� ������ 2(��������� ���
		// �������).��� ����� ����� � ������ �� 3, �� �� ������ ��������� ��
		// ������� �� �������� �skip 3�.��� ������ �� ������ �������� ����� (���
		// ������������) ����� ��-������ �� 200, �� �� �������� �����������.

		Scanner sc = new Scanner(System.in);
		System.out.println("����, �������� �������������� 2 �����");

		System.out.println("�������� ������� �����:");
		System.out.print("A = ");
		int a = sc.nextInt();

		System.out.println("�������� ������� �����:");
		System.out.print("B = ");
		int b = sc.nextInt();
		sc.close();

		int sum = 0;

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}

		System.out.printf("���������� �� ������� �� %d �� %d, ����������� ����, ������ �� 3, \n", a, b);
		System.out.println("������������� ����������� ��� ���� �� ���������� > 200, ��:");

		for (int i = a; i <= b; i++) {
			int sqr = i * i;
			int sqr3 = i * i;
			if (sqr3 % 3 == 0) {
				System.out.print("skip " + sqr3 + ", ");
			} else {
				System.out.print(sqr + ", ");
				sum = sum + sqr;
				if (sum > 200) {
					break;
				}
			}

		}
		System.out.println();
		System.out.println("� ������ �� ���� �����, ��� �����������, � " + sum);
		
	}

}
