package TCS;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWordFinder {
	public static void main(String[] args) {
		String str = "delhi patna bihar amnour saran pitna bihar patna delhio";
		String words[] = str.split(" ");
		Set<String> uniq = new LinkedHashSet<String>();
		System.out.print("Uniq words are: ");
		for (String word : words) {
			uniq.add(word.trim());
		}
		for (String word : uniq) {
			System.out.print(word+" ");
		}
	}
}
