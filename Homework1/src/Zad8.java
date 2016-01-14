import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		// Задача 8:
		// Да се състави програма, която чете от конзолата 4-цифренo
		// естествено число от интервала [1000.. 9999]. От това число се
		// формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
		// и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
		// 3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
		// ново число e по-малко <, равно = или по-голямо от 2-то число.
		// Пример: 3332 Изход: по-малко (32<33)
		// Пример: 1144 Изход: равни (14=14)
		// Пример: 9875 Изход: по-голямо (95>87)

		Scanner sc = new Scanner(System.in);
		System.out.println("Моля, въведете цяло четирицифрено число x:");

		System.out.print("x = ");
		int x = sc.nextInt();
		sc.close();

		if (x <= 999 || x >= 10000) {
			System.out.println("Въведеното число не е четирицифрено.");
		} else {
			int a = x / 1000;
			int b = x % 1000 / 100;
			int c = x % 100 / 10;
			int d = x % 10;

			int newnumber1 = 10 * a + d;
			int newnumber2 = 10 * b + c;

			if (newnumber1 < newnumber2) {
				System.out.println("По-малко (" + newnumber1 + " < " + newnumber2 + ")");
			} else if (newnumber1 > newnumber2) {
				System.out.println("По-голямо (" + newnumber1 + " > " + newnumber2 + ")");
			} else {
				System.out.println("Равни (" + newnumber1 + " = " + newnumber2 + ")");

			}
		}

	}

}
