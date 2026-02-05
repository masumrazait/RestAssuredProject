package PWC;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindTheDuplicateNumber {
	public static void main(String[] args) {
		int arr[] = { 133, 2, 134, 53554, 747, 747, 43634, 747, 86, 346 };
		String input = "IndiaDelhi".toLowerCase();
		Set<Integer> uniqNum = new HashSet<Integer>();
		Set<Integer> dub = new HashSet<Integer>();
		Set<Character> uniqCha = new LinkedHashSet<>();
		Set<Character> dubchar = new LinkedHashSet<>();
		for (char c : input.toCharArray()) {
			if (!uniqCha.add(c)) {
				dubchar.add(c);
			}
		}
		System.out.println(uniqCha);
		for (int num : arr) {
			if (!uniqNum.add(num)) {
				dub.add(num);
			}
		}
		System.out.println(uniqNum);

	}
}
