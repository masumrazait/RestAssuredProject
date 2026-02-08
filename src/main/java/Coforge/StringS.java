package Coforge;

import java.util.HashMap;
import java.util.Map;

public class StringS {
	public static void main(String[] args) {
		String str = "Stringraxa delhi patna patna";
		String words[] = str.split(" ");
		Map<String, Integer> uniq = new HashMap<String, Integer>();
		for (String word : words) {
			uniq.put(word, uniq.getOrDefault(word, 0) + 1);
		}
		System.out.println(uniq);
	}
}
