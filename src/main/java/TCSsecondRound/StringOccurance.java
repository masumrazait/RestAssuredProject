package TCSsecondRound;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringOccurance {
	public static void main(String[] args) {
		String str = "masum delhi patna bihar amnour bihar patna raza";
		String words[] = str.split(" ");
		Map<String, Integer> uniq = new LinkedHashMap<String, Integer>();
		for (String word : words) {
			uniq.put(word, uniq.getOrDefault(word, 0) + 1);
		}
		for (String word : uniq.keySet()) {
			if (uniq.get(word) == 2)
				System.out.println(word + " -> " + uniq.get(word));
		}
	}
}
