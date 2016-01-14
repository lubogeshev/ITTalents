import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		// Задача 4:
		// Да се състави програма, чрез която по въведени трите имена на двама
		// човека разделени със запетая, се извежда чие име има по-голям сбор
		// от ASCII кодовете на съставящите името букви.
		// Пример: Anna Dosewa Asenowa, Iwo Peew Peew
		// Изход: Anna Dosewa Asenowa

		System.out.println("This is a program that compares two names by the sum of their symbols' numbers"
				+ " in the ASCII table");

		Scanner sc = new Scanner(System.in);
		boolean twoNames = true;
		String[] names;

		do {
			System.out.println();
			System.out.println("Please enter two full names on the next line, dividing them with a comma.");
			String inputText = sc.nextLine();

			names = inputText.split(",");
			twoNames = true;

			if (inputText.indexOf(",") == -1) {
				System.out.println("You have entered just 1 name or did not divide the names!");
				twoNames = false;
			}
			for (int i = 0; i < names.length; i++) {
				names[i] = names[i].trim();
				if (i > 1) {
					System.out.println("You have entered more than 2 full names!");
					twoNames = false;
					break;
				}
			}

		} while (!twoNames);
		sc.close();

		int[] sum = { 0, 0 };

		for (int j = 0; j < names.length; j++) {
			for (int i = 0; i < names[j].length(); i++) {
				sum[j] += names[j].charAt(i);
			}
		}
				
		if (sum[0] > sum[1]) {
			System.out.println("The name with the greatest sum of numbers from ASCII table is " + names[0]);
		} else if (sum[0] < sum[1]) {
			System.out.println("The name with the greatest sum of numbers from ASCII table is " + names[1]);
		} else {
			System.out.println("The sum of the names' symbols' numbers are equal.");
		}
	}
}
