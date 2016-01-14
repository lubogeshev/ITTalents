import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {

		/*
		 * ������ 7: �������� ��������, ����� ����� ���� ����� � ����� �������
		 * ��� ����� ��� ����� ������ �� ������� �����: ���������� �� �����
		 * ������� �� ������ ����� �� � ����� �� ����� �� ���������� �
		 * ���������� ������� �� ���������� ������� �� ������ �����. ������� �
		 * ���������� ������� �� ������ ����� ������ �� �� ������� ����� ��
		 * ������� � ���������� �� ������� �� ������ �����. �� �� ������
		 * ��������� �����.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number for the array's length:");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter a number for cell " + (i + 1));
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int[] newArr = new int[arr.length];

		for (int i = 0; i < newArr.length; i++) {

			if (i == 0 || i == newArr.length - 1) {
				newArr[i] = arr[i];
			} else {
				newArr[i] = arr[i - 1] + arr[i + 1];
			}

		}
		System.out.println("Original array:");
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr[i]);
			} else {
				System.out.print(", " + arr[i]);
			}
		}
		System.out.println("]");

		System.out.println("New array:");
		for (int i = 0; i < newArr.length; i++) {
			if (i == 0) {
				System.out.print("[" + newArr[i]);
			} else {
				System.out.print(", " + newArr[i]);
			}
		}
		System.out.print("]");

	}
}
