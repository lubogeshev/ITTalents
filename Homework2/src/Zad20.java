
public class Zad20 {

	public static void main(String[] args) {
		// ������ 20:
		// �� �� ������� ��������, ���� ����� �� ������� ������� ��
		// �����. ������ �� ���������� �� ���������� ��� ��� ����� ��
		// ����� �� 45.
		// ������:
		// 1 2 3 4 5 6 7 8 9 0
		// 2 3 4 5 6 7 8 9 0 1
		// 3 4 5 6 7 8 9 0 1 2
		// 4 5 6 7 8 9 0 1 2 3
		// 5 6 7 8 9 0 1 2 3 4
		// 6 7 8 9 0 1 2 3 4 5
		// 7 8 9 0 1 2 3 4 5 6
		// 8 9 0 1 2 3 4 5 6 7
		// 9 0 1 2 3 4 5 6 7 8
		// 0 1 2 3 4 5 6 7 8 9

		int counter = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {

				if (counter == 10) {
					counter = 0;
				}

				System.out.print(counter + " ");
				counter++;
			}
			counter++;
			System.out.println();
		}

	}

}
