import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		// Задача 6:
		// Да се състави програма, чрез която се въвежда изречение с отделни
		// думи.
		// Като резултат на екрана да се извежда същия текст, но всяка отделна
		// дума да започва с главна буква, а следващите я букви да са малки.
		// Пример: супер яката задача
		// Изход: Супер Яката Задача

		System.out.println("This is a program that transforms all letters in a sentence to start with upper case.");
		System.out.println("Please enter a sentence:");
		Scanner sc = new Scanner (System.in);
		String sentence = sc.nextLine().trim();
		sc.close();
				
		String[] words = sentence.split(" ");
		
		for (int i = 0; i < words.length; i++){

			words[i] = words[i].substring(0, 1).toUpperCase() 
					 + words[i].substring(1, words[i].length()).toLowerCase();
			
		}
		sentence = sentence.join(" ", words);
		
		System.out.println(sentence);
	}
}
