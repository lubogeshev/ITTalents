
public class Task13 {

	public static void main(String[] args) {

		// ������ 13:
		// �� �� ������� �����, ����� ������ ��� ������ �� ����� � �����
		// �����, �������� ������ �������� �� ���������� ������, ���� �
		// ������� ���� �� ������ �� ���������� �� ������ ������� �����,
		// � ��� ������� ���� � ���� �� ������ ������� �����.

		int[] array1 = { 1, 4, 5, 7, 1, 3, 5, 7 };
		int[] array2 = { 34, 321, 12, 35, 4123, 1, 13, 312 };

		int[] mergedArray = mergeArrays(array1, array2);
		printArray(mergedArray);
	}

	static int[] mergeArrays(int[] arr1, int[] arr2) {

		int[] merged = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			merged[i] = arr1[i];
		}
		for (int i = arr1.length; i < merged.length; i++) {
			merged[i] = arr2[i - arr1.length];
		}

		return merged;
	}

	static void printArray(int[] array) {

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
