import java.util.Scanner;

public class Zad22 {

	public static void main(String[] args) {

		// ������ 22:
		// �� �� ������� ��������, ����� ������� ������� 10 ���-�����
		// �����, ����� �� ����� �� 2, 3 ��� �� 5 � ����� �� ��-������ ��
		// �������� ���������� �����.
		// ������� �� ��������, ������ � ������ ������� �����.
		// ������ �����: ����� �� ��������� [1..999]
		// ������: 1
		// �����: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
		// ����������� ����� while.

		Scanner sc = new Scanner(System.in);

		System.out.println("���� � ��������, ����� ������� ������� 10 �����, ������ �� 2, 3 ��� �� 5 � ��-������ �� n.");
		
		int n;
		do {
			System.out.println("����, �������� n [1..999]:");
			System.out.print("n = ");
			n = sc.nextInt();
		} while ((n < 1) || (n > 999));
		sc.close();

		int counter = 0;
		while (counter < 10) {
			n++;
			if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
				counter++;
				System.out.print(counter + ":" + n + " ");
			}
		}

	}

}
