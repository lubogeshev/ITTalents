import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {

		// Задача 3:
		// Въведете 2 различни числа от конзолата и разменете стойността им.
		// Разпечатайте новите стойности

		Scanner sc = new Scanner(System.in);
		System.out.println("Това е програма, която разменя стойностите на 2 числа.");
		System.out.println("Моля, въведете последователно 2 различни цели числа А и B:");

		System.out.print("A = ");
		int A = sc.nextInt();

		System.out.print("B = ");
		int B = sc.nextInt();
		sc.close();

		if (A != B) {
			int temp = A;
			A = B;
			B = temp;
			System.out.println("След като разменим стойносттие:");
			System.out.println("A = " + A);
			System.out.println("B = " + B);
		} else {
			System.out.println("Въведените числа са еднакви!");
		}
	}

}
