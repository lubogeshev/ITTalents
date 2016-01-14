import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		// ������ 6:
		// �� �� ������� ��������, ���� ����� �� ������� ��������� � �������
		// ����.
		// ���� �������� �� ������ �� �� ������� ����� �����, �� ����� �������
		// ���� �� ������� � ������ �����, � ���������� � ����� �� �� �����.
		// ������: ����� ����� ������
		// �����: ����� ����� ������

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
