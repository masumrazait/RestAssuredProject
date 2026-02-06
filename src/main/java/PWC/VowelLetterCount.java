package PWC;

public class VowelLetterCount {
	public static void main(String[] args) {
		String str = "VowelLetterCount";
		String vowel = "aeiouAEIOU";
		for (char c : str.toCharArray()) {
			if (vowel.indexOf(c) != -1) {
				System.out.print(c + " ");
			}
		}
	}
}
