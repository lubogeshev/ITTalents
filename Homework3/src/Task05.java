//import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {

		/*
		 * ������ 5: �������� ��������, ����� ������� ����� � 10 �������� �
		 * ������������ ����� �� ���������� ��� ��������, ����� �� ������� ��
		 * ��������, ������� �� 3. �� �� ������� ���������� �� ������.
		 */

		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = 3 * i;
		}

		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print("[" + array[i]);
			} else {
				System.out.print(", " + array[i]);
			}
		}
		System.out.println("]");
	}
}
