import java.util.Scanner;

public class Zad12 {

	public static void main(String[] args) {

		// ������ 12:
		// ��������� ������ �� ������ ������ ������ �� 4 � ����������
		// ����������, �� ��� �������� ������ �� 400, �.�. 1900 �� � ���������,
		// �� 1600 � 2000 �� ���������.
		// ��������� ��������, ����� �� ������ ���, �����, ������ ���������
		// ���������� ����.
		// ������ �����: ��� ����� �� ���, �����, ������.
		// ������: 28, 2, 2000
		// �����: 1,3,2000

		Scanner sc = new Scanner(System.in);
		System.out.println("���� � ��������, ����� �������� ���������� ���� � ���������");
		System.out.println("����, �������� �������������� ���, ����� � ������.");

		System.out.print("���: ");
		int day = sc.nextInt();
		if ((day < 1) || (day > 31)) {
			System.out.println("���������� ��� � ���������!");
		} else {
			System.out.print("�����: ");
			int month = sc.nextInt();
			if ((month < 1) || (month > 12)) {
				System.out.println("���������� ����� � ���������!");
			} else {
				System.out.print("������: ");
				int year = sc.nextInt();
				sc.close();

				boolean IsLeap = true;

				if (year % 4 == 0) {
					if (year % 100 == 0) {
						if (year % 400 == 0) {
							IsLeap = true;
						} else {
							IsLeap = false;
						}
					}
				} else {
					IsLeap = false;
				}

				if (day == 31 && month == 12) {
					day = 1;
					month = 1;
					year++;
				} else {

					int LastDay;

					if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
						LastDay = 31;

					} else if (month == 4 || month == 6 || month == 9 || month == 11) {
						LastDay = 30;

					} else {

						if (IsLeap) {
							LastDay = 29;
						} else {
							LastDay = 28;
						}

					}
					if (day > LastDay) {
						System.out.println("���������� ���� �� ����������!");
					} else {

						if (day == LastDay) {
							day = 1;
							month++;
						} else {
							day++;
						}
						System.out.println("���������� ���� � ��������� � " + day + "." + month + "." + year + "�.");
					}
				}
			}
		}
	}
}
