package PWC;

import java.util.LinkedHashSet;
import java.util.Set;

public class DublicateWord {
	public static void main(String[] args) {
		String input = "Tata,Swift,Audi,Mercedes,Tata,Renault";
		String words[] = input.split(",");
		Set<String> uniq = new LinkedHashSet<String>();
		for (String word : words) {
			uniq.add(word.trim());
		}
		for (String word : uniq) {
			System.out.print(word + " ");
		}
	}

}
