package Coforge;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompressed {
	public static void main(String[] args) {
		String str = "aaab ccd eef";
		String result = "";
		Map<Character, Integer> charc = new LinkedHashMap<>();
		for (char c : str.toCharArray()) {
			if(c!=' '&& c!='b')
			charc.put(c, charc.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : charc.entrySet()) {
			if(entry.getValue()>1)
			result = result + entry.getKey() + entry.getValue();
		}
		System.out.println(result);
	}

}
