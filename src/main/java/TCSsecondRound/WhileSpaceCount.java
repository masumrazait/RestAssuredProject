package TCSsecondRound;

public class WhileSpaceCount {
	public static void main(String[] args) {
		int count = 0;
		String str = "ma        ";// 8
		for (int i = 1; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("total whitespace is: " + count);
		String word = "ma  adf fa dsdf fa      ";// 5
		int wcount = 0;
		for (int j = 0; j <= word.length() - 1; j++) {
			if (word.charAt(j) != ' ' && word.charAt(j + 1) == ' ') {
				wcount++;
			}
		}
		System.out.println("total word is : " + wcount);
	}
}
