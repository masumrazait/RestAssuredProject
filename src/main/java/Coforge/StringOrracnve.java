package Coforge;

import java.util.HashMap;
import java.util.Map;

public class StringOrracnve {
	public static void main(String[] args) {
		String str = "masum raza delhi raza delhi patna amnour patna amnour hait aaa fhar";
		String words[] = str.split(" ");
		Map<String, Integer> uniq = new HashMap<String, Integer>();
		
		for (String word : words) {
			uniq.put(word, uniq.getOrDefault(word, 0) + 1);
		}
		
		for (String word : uniq.keySet()) {
			if(uniq.get(word)==1)
			System.out.print(word + " -> " + uniq.get(word) + " ");
		}
	}
}
