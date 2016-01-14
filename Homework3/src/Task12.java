import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {

		/*
		 * ������ 12: �� �� ������� ��������, ���� ����� �� �������������
		 * �������� 7 ����� � ��������� ����� �� �������� ������� �� �������� �
		 * �������: 
		 * - 0 � 1 ���� ����� ����������; 
		 * - 2 � 3 ���� ��������; 
		 * - 4 � 5 ���� ���������. 
		 * ������: 1,2,3,4,5,6,7 
		 * �����: 2,1,4,3,6,5,7
		 */

		System.out.println("This is a program that swaps the places of 7 numbers.");
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter number " + (i + 1));
			arr[i] = sc.nextInt();
		}
		sc.close();

		System.out.println("You have entered");
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print(arr[i]);
			} else {
				System.out.print(", " + arr[i]);
			}
		}
		
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;

		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] = arr[2] - arr[3];

		arr[4] = arr[4] * arr[5];
		arr[5] = arr[4] / arr[5];
		arr[4] = arr[4] / arr[5];

		System.out.println();
		System.out.println("After swapping number 1 with number 2, 3 with 4 and 5 with 6, the numbers are:");
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print(arr[i]);
			} else {
				System.out.print(", " + arr[i]);
			}
		}
	}

}
