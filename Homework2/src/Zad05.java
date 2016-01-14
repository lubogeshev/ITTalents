import java.util.Scanner;

public class Zad05 {

	public static void main(String[] args) {

		// Задача 5: Да се въведат от потребителя 2 числа. И да се
		// изведат на екрана всички числа от по-малкото до по-голямото.

		Scanner sc = new Scanner(System.in);
		System.out.println("Това е програма, която извежда всички числа от по-малкото до по-голямото измежду две числа.");

		System.out.println("Въведете първото число:");
		System.out.print("A = ");
		int a = sc.nextInt();

		System.out.println("Въведете второто число:");
		System.out.print("B = ");
		int b = sc.nextInt();
		sc.close();

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println("Всички числа между " + a + " и " + b + " включително са:");
		for (int x = a; x <= b; x++) {
			System.out.print(x + " ");
		}
	}

}
