import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {

		// ������ 2:
		// �������� 2 �������� ����������� ����� �� ���������. ��������
		// ������� ����, �������, ������������, ������� �� ������� �
		// ����������� ������� � ������� ���������� � ������������ ����
		// ��������� � ���������. �������� ������ � ����� � ������� �������.

		Scanner sc = new Scanner(System.in);
		System.out.println("���� � ��������, ����� ��������� ����, �������, ������������, ������� �� ������� � ����������� ������� �� 2 �����.");
		System.out.println("����, �������� �������������� 2 �������� ���� ����� � � B:");

		System.out.print("A = ");
		int A = sc.nextInt();

		System.out.print("B = ");
		int B = sc.nextInt();

		if (A == B) {
			System.out.println("���������� ����� �� �������!");
		} else {

			int sum = A + B;
			int sub = A - B;
			int mul = A * B;
			int mod = A % B;
			int div = A / B;

			System.out.println("A + B = " + sum);
			System.out.println("A - B = " + sub);
			System.out.println("A * B = " + mul);
			System.out.println("A % B = " + mod);
			System.out.println("A / B = " + div);
		}
		System.out.println("� ���� �������� �������������� 2 �������� ������ ����� � � B:");

		System.out.print("X = ");
		double X = sc.nextDouble();

		System.out.print("Y = ");
		double Y = sc.nextDouble();
		sc.close();
		if (A == B) {
			System.out.println("���������� ����� �� �������!");
		} else {
			double sum1 = X + Y;
			double sub1 = X - Y;
			double mul1 = X * Y;
			double mod1 = X % Y;
			double div1 = X / Y;

			System.out.println("A + B = " + sum1);
			System.out.println("A - B = " + sub1);
			System.out.println("A * B = " + mul1);
			System.out.println("A % B = " + mod1);
			System.out.println("A / B = " + div1);
		}
	}

}
