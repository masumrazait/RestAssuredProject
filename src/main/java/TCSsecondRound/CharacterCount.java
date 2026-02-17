package TCSsecondRound;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {
	public static void main(String[] args) {
		String str = "masum";
		Map<Character, Integer> charc = new LinkedHashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			charc.put(c, charc.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : charc.entrySet()) {
			if (entry.getValue() == 1)
				System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
		}
	}
}