import java.util.Scanner;

public class Zad11 {

	public static void main(String[] args) {
		// Задача 11:
		// Съставете програма, която по дадено трицифренo число проверява
		// дали числото се дели на всяка своя цифра. Във въведеното число да
		// няма цифра 0.

		Scanner sc = new Scanner(System.in);
		System.out.println("Това е програма, която проверява дали дадено трицифрено число се дели на всяка своя цифра.");
		System.out.println("Моля, въведете цяло трицифрено число x, което не съдържац цифрата 0");
		System.out.print("x = ");
		int x = sc.nextInt();
		sc.close();

		if (x <= 99 || x >= 1000) {
			System.out.println("Въведеното число не е трицифрено.");
		} else {
			
			int a = x / 100;
			int b = x % 100 / 10;
			int c = x % 10;
			
			if (a == 0 || b == 0 || c == 0) {
				System.out.println("Въведеното число съдържа цифрата 0.");
			} else {
				if (x % a == 0 && x % b == 0 && x % c == 0) {
					System.out.println("Числото се дели на всичките си цифри без остатък.");
				} else {
					System.out.println("Числото не се дели на всичките си цифри без остатък.");
				}
			}
		}
	}
}
