package TCS;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateWordFinders {
	public static void main(String[] args) {
		String str = "delhi patna bihar amnour saran pitna bihar patna delhio";
		String words[] = str.split(" ");
		Map<String, Integer> wordCount = new LinkedHashMap<String, Integer>();
		for (String word : words) {
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}
		for (String word : wordCount.keySet()) {
			if (wordCount.get(word) == 1)
				System.out.println(word + " -> " + wordCount.get(word));
		}
	}

}
