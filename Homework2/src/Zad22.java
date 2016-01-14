import java.util.Scanner;

public class Zad22 {

	public static void main(String[] args) {

		// Задача 22:
		// Да се състави програма, която извежда първите 10 най-малки
		// числа, които се делят на 2, 3 или на 5 и които са по-големи от
		// въведено естествено число.
		// Числата се извеждат, заедно с техния пореден номер.
		// Входни данни: число от интервала [1..999]
		// Пример: 1
		// Изход: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
		// Използвайте цикъл while.

		Scanner sc = new Scanner(System.in);

		System.out.println("Това е програма, която извежда първите 10 числа, кратни на 2, 3 или на 5 и по-големи от n.");
		
		int n;
		do {
			System.out.println("Моля, въведете n [1..999]:");
			System.out.print("n = ");
			n = sc.nextInt();
		} while ((n < 1) || (n > 999));
		sc.close();

		int counter = 0;
		while (counter < 10) {
			n++;
			if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
				counter++;
				System.out.print(counter + ":" + n + " ");
			}
		}

	}

}
