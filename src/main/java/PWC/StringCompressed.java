package PWC;

import java.util.HashMap;
import java.util.Map;

public class StringCompressed {
	public static void main(String[] args) {
		String str = "aaaaasdddddddddffff";
		String result = "";
		Map<Character, Integer> charc = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			charc.put(c, charc.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : charc.entrySet()) {
			result = result + entry.getKey() + entry.getValue();
		}
		System.out.println(result);
	}
}
