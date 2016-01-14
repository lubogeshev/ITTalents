
public class Zad23 {

	public static void main(String[] args) {
		// Задача 23:
		// Да се състави програма, която чрез цикъл while извежда
		// таблицата за умножение, но без повторение.
		// Т.е. ако е изведено 4*5 не се извежда 5*4.

		System.out.println("Това е програма, която извежда таблицата за умножение без повторения.");

		int i = 1;
		while (i <= 9) {

			int j = 1;
			while (j <= 9) {
				if (i <= j) {
					System.out.print(i + "*" + j + "; ");
				}
				j++;
			}
			System.out.println();
			i++;
		}

	}
}
