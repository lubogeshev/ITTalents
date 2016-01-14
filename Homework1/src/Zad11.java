import java.util.Scanner;

public class Zad11 {

	public static void main(String[] args) {
		// ������ 11:
		// ��������� ��������, ����� �� ������ ���������o ����� ���������
		// ���� ������� �� ���� �� ����� ���� �����. ��� ���������� ����� ��
		// ���� ����� 0.

		Scanner sc = new Scanner(System.in);
		System.out.println("���� � ��������, ����� ��������� ���� ������ ���������� ����� �� ���� �� ����� ���� �����.");
		System.out.println("����, �������� ���� ���������� ����� x, ����� �� �������� ������� 0");
		System.out.print("x = ");
		int x = sc.nextInt();
		sc.close();

		if (x <= 99 || x >= 1000) {
			System.out.println("���������� ����� �� � ����������.");
		} else {
			
			int a = x / 100;
			int b = x % 100 / 10;
			int c = x % 10;
			
			if (a == 0 || b == 0 || c == 0) {
				System.out.println("���������� ����� ������� ������� 0.");
			} else {
				if (x % a == 0 && x % b == 0 && x % c == 0) {
					System.out.println("������� �� ���� �� �������� �� ����� ��� �������.");
				} else {
					System.out.println("������� �� �� ���� �� �������� �� ����� ��� �������.");
				}
			}
		}
	}
}
