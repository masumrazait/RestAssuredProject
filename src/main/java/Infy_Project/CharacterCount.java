package Infy_Project;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {
	public static void main(String[] args) {
		String str = "patnabiharamnorsaran";
		Map<Character, Integer> count = new LinkedHashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			count.put(c, count.getOrDefault(c, 0) + 1);
		}
		for (char c : count.keySet()) {
			if (count.get(c) != 1)
				System.out.println(c + " -> " + count.get(c));
		}
	}
}
