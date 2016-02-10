package Letters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class LettersDemo {

	public static void main(String[] args) {

		System.out.println("Please enter text:");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine().trim().toUpperCase();
		sc.close();

		Map<Character, Integer> letters = new TreeMap<Character, Integer>();

		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) == ' ') {
				continue;
			}
			if (!letters.containsKey(text.charAt(i)))
				letters.put(text.charAt(i), 1);
			else
				letters.put(text.charAt(i), letters.get(text.charAt(i)).intValue() + 1);
		}

		List <Entry<Character, Integer>> copy = new ArrayList <Entry<Character, Integer>>();
		
		for (Entry<Character, Integer> entry : letters.entrySet()) {
			copy.add(entry);
		}
		
		Collections.sort(copy, new Comparator<Entry<Character, Integer>> (){

			@Override
			public int compare(Entry<Character, Integer> e1, Entry<Character, Integer> e2) {
				return -e1.getValue().compareTo(e2.getValue());
			}
			
		});
		
		System.out.println(copy);
				
		for (Entry<Character, Integer> entry : copy) {

			System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
			for (int i = 0; i < entry.getValue(); i++) {
				System.out.print("####");
			}
			System.out.println();
		}
	}
}