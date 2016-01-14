import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

		System.out.println("This is a program that calculates N!");
		System.out.println("Please enter N:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		System.out.println("N! = " + factorial(n));
	}

	static long factorial(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
