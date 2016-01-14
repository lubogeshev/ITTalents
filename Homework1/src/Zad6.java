import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {
		// Задача 6:
		// Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите
		// им така, че а1 да има стойността на а2, а2 да има стойността на а3, а
		// а3 да има старата стойност на а1.

		Scanner sc = new Scanner(System.in);
		System.out.println("Моля, въведете последователно 3 цели числа a1, a2 и a3:");

		System.out.print("a1 = ");
		int a1 = sc.nextInt();

		System.out.print("a2 = ");
		int a2 = sc.nextInt();

		System.out.print("a3 = ");
		int a3 = sc.nextInt();
		sc.close();

		// а1 а2 а3
		// > > > >
		// а2 а3 а1

		int temp1 = a1;
		a1 = a2;
		a2 = temp1;

		int temp2 = a2;
		a2 = a3;
		a3 = temp2;
		
		System.out.println(a1 + " " + a2 + " " + a3);

	}

}
