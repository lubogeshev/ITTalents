import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {

		// Задача 2:
		// Въведете 2 различни целочислени числа от конзолата. Запишете
		// тяхната сума, разлика, произведение, остатък от деление и
		// целочислено деление в отделни променливи и разпечатайте тези
		// резултати в конзолата. Опитайте същото с числа с плаваща запетая.

		Scanner sc = new Scanner(System.in);
		System.out.println("Това е програма, която изчислява сума, разлика, произведение, остатък от деление и целочислено деление на 2 числа.");
		System.out.println("Моля, въведете последователно 2 различни цели числа А и B:");

		System.out.print("A = ");
		int A = sc.nextInt();

		System.out.print("B = ");
		int B = sc.nextInt();

		if (A == B) {
			System.out.println("Въведените числа са еднакви!");
		} else {

			int sum = A + B;
			int sub = A - B;
			int mul = A * B;
			int mod = A % B;
			int div = A / B;

			System.out.println("A + B = " + sum);
			System.out.println("A - B = " + sub);
			System.out.println("A * B = " + mul);
			System.out.println("A % B = " + mod);
			System.out.println("A / B = " + div);
		}
		System.out.println("А сега въведете последователно 2 различни реални числа А и B:");

		System.out.print("X = ");
		double X = sc.nextDouble();

		System.out.print("Y = ");
		double Y = sc.nextDouble();
		sc.close();
		if (A == B) {
			System.out.println("Въведените числа са еднакви!");
		} else {
			double sum1 = X + Y;
			double sub1 = X - Y;
			double mul1 = X * Y;
			double mod1 = X % Y;
			double div1 = X / Y;

			System.out.println("A + B = " + sum1);
			System.out.println("A - B = " + sub1);
			System.out.println("A * B = " + mul1);
			System.out.println("A % B = " + mod1);
			System.out.println("A / B = " + div1);
		}
	}

}
