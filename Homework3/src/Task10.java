import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		/*
		 * Задача 10: Да се състави програма, чрез която се въвеждат 7 цели
		 * числа в едномерен масив. 
		 * Програмата да изведе числото, което е
		 * най-близко до средната стойност на въведените числа. 
		 * Пример: 1,2,3,4,5,6,7 
		 * Изход: средна стойност 4, най-близка стойност 4
		 */

		System.out.println("This is a program that shows the closest to the avarage of 7 numbers.");
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter number " + (i + 1));
			arr[i] = sc.nextInt();
		}
		sc.close();

		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		double avg = sum / arr.length;
		double dist = avg - arr[0];
		double minDist = (dist > 0 ? dist : -dist);
		int closest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			dist = avg - arr[i];
			if (dist < 0) {
				dist = -dist;
			}
			if (dist < minDist) {
				minDist = dist;
				closest = arr[i];
			}
		}
		
		System.out.println("You have entered");
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print(arr[i]);
			} else {
				System.out.print(", " + arr[i]);
			}
		}
		
		System.out.println();
		System.out.println("The avarage of these numbers is " + avg);
		System.out.println("The closest number to the avarage is " + closest);

	}
}
