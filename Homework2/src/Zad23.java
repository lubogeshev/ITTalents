
public class Zad23 {

	public static void main(String[] args) {
		// ������ 23:
		// �� �� ������� ��������, ����� ���� ����� while �������
		// ��������� �� ���������, �� ��� ����������.
		// �.�. ��� � �������� 4*5 �� �� ������� 5*4.

		System.out.println("���� � ��������, ����� ������� ��������� �� ��������� ��� ����������.");

		int i = 1;
		while (i <= 9) {

			int j = 1;
			while (j <= 9) {
				if (i <= j) {
					System.out.print(i + "*" + j + "; ");
				}
				j++;
			}
			System.out.println();
			i++;
		}

	}
}
