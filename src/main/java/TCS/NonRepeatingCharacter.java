package TCS;

import java.util.HashSet;
import java.util.Set;

public class NonRepeatingCharacter {
	public static void main(String[] args) {
		String str = "delphipatbabihar";
		System.out.print("NonRepeated character is in the String is :");
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.print(c + " ");
			}
		}
		System.out.print("\nRepeated character is in the String is :");
		Set<Character> seen = new HashSet<>();
		for (char d : str.toCharArray()) {
			if (str.indexOf(d) != str.lastIndexOf(d) && !seen.contains(d)) {
				System.out.print(d + " ");
				seen.add(d);
			}
		}

	}
}
