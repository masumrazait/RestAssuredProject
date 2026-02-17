package TCSsecondRound;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqCharacter {
	public static void main(String[] args) {
		String str = "masumrazas";
		Set<Character> uniq = new LinkedHashSet<Character>();
		Set<Character> dub = new LinkedHashSet<Character>();
		for (char c : str.toCharArray()) {
			if (!uniq.add(c)) {
				dub.add(c);
			}
		}
		System.out.print("uniq: ");
		System.out.print(uniq);
		System.out.print("\ndublicate: ");
		System.out.print(dub);
	}
}
