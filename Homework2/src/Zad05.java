import java.util.Scanner;

public class Zad05 {

	public static void main(String[] args) {

		// ������ 5: �� �� ������� �� ����������� 2 �����. � �� ��
		// ������� �� ������ ������ ����� �� ��-������� �� ��-��������.

		Scanner sc = new Scanner(System.in);
		System.out.println("���� � ��������, ����� ������� ������ ����� �� ��-������� �� ��-�������� ������� ��� �����.");

		System.out.println("�������� ������� �����:");
		System.out.print("A = ");
		int a = sc.nextInt();

		System.out.println("�������� ������� �����:");
		System.out.print("B = ");
		int b = sc.nextInt();
		sc.close();

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println("������ ����� ����� " + a + " � " + b + " ����������� ��:");
		for (int x = a; x <= b; x++) {
			System.out.print(x + " ");
		}
	}

}
