import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		/*
		 * ������ 2: ���� �� ������� ����� �� �� ���������� ���, ���� ����������
		 * �� �������� �� ����� ���� �� �����������, � ������� �� �� ����
		 * ��������, �� � ������� ���. ��������, �� �� ������ ����� ����� ��
		 * ������.
		 */

		System.out.println("Please enter number for the array's length:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] original = new int[n];
		for (int i = 0; i < original.length; i++) {
			System.out.println("Please enter number for cell " + (i + 1));
			original[i] = sc.nextInt();
		}
		sc.close();

		int[] copy = new int[original.length * 2];

		for (int i = 0; i < (copy.length + 1) / 2; i++) {
			copy[i] = original[i];
			copy[copy.length - i - 1] = original[i];
		}
		
		for (int i = 0; i < copy.length; i++) {
			if (i == 0) {
				System.out.print("[" + copy[i]);
			} else {
				System.out.print(", " + copy[i]);
			}
		}
		System.out.print("]");

	}
}
