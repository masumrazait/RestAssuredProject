package Coforge;

import java.util.HashSet;
import java.util.Set;

public class DublicateWord {
	public static void main(String[] args) {
		String str = "delhi patna bihar patna delhi amnour bihars";
		String words[] = str.split(" ");
		Set<String> uniq = new HashSet<String>();
		System.out.print("uniq word ares : ");
		for (String word : words) {
			uniq.add(word.trim());
		}
		for (String word : uniq) {
			System.out.print(word + " ");
		}
	}
}
