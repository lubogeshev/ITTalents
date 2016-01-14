import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		/*
		 * ������ 3: �� �� ������ �����, ���� ����� �� �� ������� ����� � 10
		 * �������� �� ������� �����: 
		 * ������� 2 �������� �� ������ �� ���������� �����. 
		 * ����� ������� ������� �� ������ � ����� �� ����� �� ����������
		 * 2 �������� � ������. 
		 * ���� ���� �������� ������ .
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number for the array's length");
		int n = sc.nextInt();
		sc.close();

		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			if (i == 0 || i == 1) {
				array[i] = n;
			} else {
				array[i] = (array[i - 1] + array[i - 2]);
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print("[" + array[i]);
			} else {
				System.out.print(", " + array[i]);
			}
		}
		System.out.print("]");

	}

}
