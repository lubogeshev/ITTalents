import java.util.Scanner;

public class Zad5 {

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

		if (A != B && B != C && A != C) {
			int temp;
			if (B > A) {
				temp = B;
				B = A;
				A = temp;
			}
			if (C > B) {
				temp = C;
				C = B;
				B = temp;
			}
			if (B > A) {
				temp = B;
				B = A;
				A = temp;
			}
			System.out.println(A + " " + B + " " + C);
		} else {
			System.out.println("Въведените числа не са различни!");
		}
	}
}
