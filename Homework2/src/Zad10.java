import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {

		// ������ 10: �������� ����� �� ������������ � ���������� ���� �
		// ������. ������ ����� � ���� ����� �� ���� ���� �� 1 � �� ���� ��.

		Scanner sc = new Scanner(System.in);
		System.out.println("���� � ��������, ����� ������� ���� ������ ����� � ������.");

		int x;
		do {
			System.out.println("����, �������� ����� >=2 :");
			x = sc.nextInt();
		} while (x < 2);
		sc.close();

		boolean isPrime = true;

		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(isPrime ? "������� � ������" : "������� �� � ������");
	}

}
