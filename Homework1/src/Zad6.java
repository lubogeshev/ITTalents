import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {
		// ������ 6:
		// �������� 3 ����� �� ������������ �1, �2 � �3. ��������� �����������
		// �� ����, �� �1 �� ��� ���������� �� �2, �2 �� ��� ���������� �� �3, �
		// �3 �� ��� ������� �������� �� �1.

		Scanner sc = new Scanner(System.in);
		System.out.println("����, �������� �������������� 3 ���� ����� a1, a2 � a3:");

		System.out.print("a1 = ");
		int a1 = sc.nextInt();

		System.out.print("a2 = ");
		int a2 = sc.nextInt();

		System.out.print("a3 = ");
		int a3 = sc.nextInt();
		sc.close();

		// �1 �2 �3
		// > > > >
		// �2 �3 �1

		int temp1 = a1;
		a1 = a2;
		a2 = temp1;

		int temp2 = a2;
		a2 = a3;
		a3 = temp2;
		
		System.out.println(a1 + " " + a2 + " " + a3);

	}

}
