package PWC;

import java.util.HashSet;
import java.util.Set;

public class NonRepeatingCharacter {
	public static void main(String[] args) {
		String str = "masum";
		System.out.print("non repeated character is : ");
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.print(c);
			}
		}

		Set<Character> seen = new HashSet<Character>();
		System.out.print("\nrepeated character is : ");
		for (char d : str.toCharArray()) {
			if (str.indexOf(d) != str.lastIndexOf(d) && !seen.contains(d)) {
				System.out.print(d);
				seen.add(d);
			}
		}
	}
}
