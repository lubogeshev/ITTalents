public class Zad12 {

	public static void main(String[] args) {

		// Задача 12: Да се състави програма, която извежда всички
		// естествени трицифрени числа, които нямат еднакви цифри т.е.
		// 100,101, 606 и т.н. не се извеждат.

		for (int x = 100; x <= 999; x++) {

			int a = x / 100;
			int b = x % 100 / 10;
			int c = x % 10;

			if (a != b && a != c && b != c) {
				System.out.println(x);
			}

		}

	}

}
