import java.util.Scanner;

public class Zad13 {

	public static void main(String[] args) {

		// ������ 13:
		// �� �� ������� ��������, ����� �� ������� ����� � �������/����� ��
		// ���������� ����������� t � ������ ������.
		// �������������� ��������� ��:
		// ��� -20 ������ �������;
		// ����� 0 � -20 - �������;
		// ����� 15 � 0 - ������;
		// ����� 25 � 15 - �����;
		// ��� 25 � ������.
		// ������ �����: ���� ����� �� ��������� [-100..100].
		// ������: 12
		// �����: ������

		Scanner sc = new Scanner(System.in);
		System.out.println("���� � ��������, ����� ��������� ���� ����� � �������/����� �� ���������� �����������.");
		System.out.println("����, �������� ������������� t � ������ ������ [-100; 100]");
		System.out.print("t = ");
		byte t = sc.nextByte();
		sc.close();
		if (t < -100 || t > 100) {
			System.out.println("���������� ����������� � ������ ��������!");
		} else {
			if (t < -20) {
				System.out.println("������ ������� �!");
			}
			if (t >= -20 && t <= 0) {
				System.out.println("������� �!");
			}
			if (t > 0 && t < 15) {
				System.out.println("������ �!");
			}
			if (t >= 15 && t <= 25) {
				System.out.println("����� �!");
			}
			if (t > 25) {
				System.out.println("������ �!");
			}

		}

	}

}
