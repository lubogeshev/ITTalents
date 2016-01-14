import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {

		// ������ 7:
		// ����� ������������� �������� ��������� �� ���������� �����,
		// �������� � ��������� ������� � ������� 6 ���� � 6 ������.
		// �� �� ������� �������� , ���� ����� �� ������ ������ �� ������
		// ��������, ����� ���� �� ������� �� ��� � ������ � ����� �����.
		// ���������� �� ������� ����������� ���� �� ����� ������� ��� ��
		// ����������� �������, ����� � ������ ���� �� ���� ��������.
		// �� �� �������� ���� ���� �����.
		// ������:
		// 11,12,13,14,15,16,
		// 21,22,23,24,25,26,
		// 31,32,33,34,35,36,
		// 41,42,43,44,45,46,
		// 51,52,53,54,55,56,
		// 61,62,63,64,65,66
		// �����:
		// 11, ,13, ,15, , ���� �� ���������� �� ����: 39
		// 22, ,24, ,26, ���� �� ���������� �� ����: 72
		// 31, ,33, ,35, , ���� �� ���������� �� ����: 99
		// 42, ,44, ,46, ���� �� ���������� �� ����: 132
		// 51, ,53, ,55, , ���� �� ���������� �� ����: 159
		// 62, ,64, ,66 ���� �� ���������� �� ����: 192
		// ���� �� ����������: 693

//		int[][] table = { { 11, 12, 13, 14, 15, 16 }, 
				//		  { 21, 22, 23, 24, 25, 26 }, 
				//		  { 31, 32, 33, 34, 35, 36 },
				//		  { 41, 42, 43, 44, 45, 46 }, 
				//		  { 51, 52, 53, 54, 55, 56 }, 
				//		  { 61, 62, 63, 64, 65, 66 }, };

		System.out.println("This is a program that calculates the sum of all elements \n"
				+ "with sum of indexes that is an equal number in a 6x6 matrix.");

		int[][] table = new int[6][6];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.println("Please enter a value for cell [" + (i + 1) + ", " + (j + 1) + "]");
				table[i][j] = sc.nextInt();
			}
		}
		sc.close();

		System.out.println("You have entered:");
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}

		int sumAll = 0;

		for (int i = 0; i < table.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < table[i].length; j++) {
				if (((i + 1) + (j + 1)) % 2 == 0) {
					rowSum += table[i][j];
					System.out.print(table[i][j] + ", ");
					if ((i + 1) % 2 == 0) {
						if (j == table[i].length - 1) {
							System.out.println(" The sum of these elements is " + rowSum);
							sumAll += rowSum;
						}
					} else {
						if (j == table[i].length - 2) {
							System.out.println(" The sum of these elements is " + rowSum);
							sumAll += rowSum;
						}
					}
				}
			}
		}
		System.out.println("The sum of all these rows is " + sumAll);
	}
}
