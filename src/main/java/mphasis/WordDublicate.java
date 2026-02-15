package mphasis;

import java.util.HashSet;
import java.util.Set;

public class WordDublicate {
	public static void main(String[] args) {
		String str = "hello ram delhi patna bihar delhi patna bihar";
		String words[] = str.split(" ");
		Set<String> uniq = new HashSet<String>();
		for (String word : words) {
			uniq.add(word.trim());
		}
		for (String word : uniq) {
			System.out.println(word);
		}
	}
}
