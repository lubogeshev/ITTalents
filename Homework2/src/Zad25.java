import java.util.Scanner;

public class Zad25 {

	public static void main(String[] args) {
		// ������ 25:
		// �� �� ������� ��������, ����� �� ������ ����� N, �� ���������
		// N!, �.�. 1*2*3*4...*N.
		// ������: 5
		// �����: 120
		// ����������� ����� do-while.
		System.out.println("���� � ��������, ����� ��������� N! (N ���������)");

		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.println("����, �������� ����� N [N >= 1]:");
			System.out.print("N = ");
			n = sc.nextInt();
		} while (n <= 0);
		sc.close();

		int fact = 1;
		int i = 1;
		do {
			fact = fact * i;
			i++;
		} while (i <= n);

		System.out.println("N! = " + fact);

	}

}
