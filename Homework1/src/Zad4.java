import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {

		// Задача 4:
		// Въведете 2 различни числа от конзолата и ги разпечатайте в
		// нарастващ ред.

		Scanner sc = new Scanner(System.in);
		System.out.println("Това е програма, която разпечатва в нарастващ ред 2 числа.");
		System.out.println("Моля, въведете последователно 2 различни цели числа А и B:");

		System.out.print("A = ");
		int A = sc.nextInt();

		System.out.print("B = ");
		int B = sc.nextInt();
		sc.close();

		if (A != B) {
			if (A > B) {
				int temp = A;
				A = B;
				B = temp;
			}
			System.out.println(A + " " + B);
		} else {
			System.out.println("Въведените числа са еднакви!");
		}
	}

}
