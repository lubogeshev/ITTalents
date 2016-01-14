import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {

		// Задача 10: Въведете число от клавиатурата и определете дали е
		// просто. Просто число е това което се дели САМО на 1 и на себе си.

		Scanner sc = new Scanner(System.in);
		System.out.println("Това е програма, която показва дали дадено число е просто.");

		int x;
		do {
			System.out.println("Моля, въведете число >=2 :");
			x = sc.nextInt();
		} while (x < 2);
		sc.close();

		boolean isPrime = true;

		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(isPrime ? "Числото е просто" : "Числото не е просто");
	}

}
