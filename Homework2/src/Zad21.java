import java.util.Scanner;

public class Zad21 {

	public static void main(String[] args) {
		// Задача 21:
		// Дадено е наредено тесте карти.
		// Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама, Поп,
		// Асо.
		// Наредбата по цвят на картите е: спатия, каро, купа, пика.
		// Да се създаде програма, чрез която се въвежда N - число от интервала
		// [1..51] и се извеждат въведения номер карта и
		// останалите по-големи карти от тестето.
		// Пример: 47.
		// Изход: Поп купа, Поп пика, Асо спатия, Асо каро, Асо купа, Асо пика

		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.println("Моля, въведете номер на карта N от наредено тесте [1..52]:");
			System.out.print("N = ");
			n = sc.nextInt();
		} while ((n < 1) || (n > 52));
		sc.close();

		for (int card = n; card <= 52; card++) {
			int number = (card - 1) / 4 + 2;
			int suit = card % 4;
			switch (number) {
			case 2:
				System.out.print("2-ка ");
				break;
			case 3:
				System.out.print("3-ка ");
				break;
			case 4:
				System.out.print("4-ка ");
				break;
			case 5:
				System.out.print("5-ца ");
				break;
			case 6:
				System.out.print("6-ца ");
				break;
			case 7:
				System.out.print("7-ца ");
				break;
			case 8:
				System.out.print("8-ца ");
				break;
			case 9:
				System.out.print("9-ка ");
				break;
			case 10:
				System.out.print("10-ка ");
				break;
			case 11:
				System.out.print("Вале ");
				break;
			case 12:
				System.out.print("Дама ");
				break;
			case 13:
				System.out.print("Поп ");
				break;
			case 14:
				System.out.print("Асо ");
				break;
			}

			switch (suit) {
			case 0:
				System.out.print("Пика");
				break;
			case 1:
				System.out.print("Спатия");
				break;
			case 2:
				System.out.print("Каро");
				break;
			case 3:
				System.out.print("Купа");
				break;
			}
			if (card != 52) {
				System.out.print(", ");
			}
		}
	}

}
