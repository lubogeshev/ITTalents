import java.util.Scanner;

public class Zad5v2 {

	public static void main(String[] args) {

		// Задача 5:
		// Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ
		// ред.

		Scanner sc = new Scanner(System.in);
		System.out.println("Това е програма, която разпечатва в низходящ ред 3 числа.");
		System.out.println("Моля, въведете последователно 3 различни цели числа А, B и C:");

		System.out.print("A = ");
		int A = sc.nextInt();

		System.out.print("B = ");
		int B = sc.nextInt();

		System.out.print("C = ");
		int C = sc.nextInt();
		sc.close();

		if (A > B) {
			if (B > C) {
				System.out.println(A + " " + B + " " + C);
			} else {
				if (A > C)
					System.out.println(A + " " + C + " " + B);
				else
					System.out.println(C + " " + A + " " + B);
			}
		} else {
			if (C > B) {
				System.out.println(C + " " + B + " " + A);
			} else {
				if (C > A)
					System.out.println(B + " " + C + " " + A);
				else
					System.out.println(B + " " + A + " " + C);
			}
		}
	}

}
