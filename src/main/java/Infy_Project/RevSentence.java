package Infy_Project;

public class RevSentence {
	public static void main(String[] args) {
		String str = "delhi ihled patna antap amnour ruonma";
		String RevSen = "";
		String words[] = str.split(" ");
		for (String word : words) {
			int len = word.length();
			String RevWord = "";
			for (int i = len - 1; i >= 0; i--) {
				RevWord = RevWord + word.charAt(i);
			}
			RevSen = RevSen + RevWord + " ";
		}
		System.out.println(RevSen.trim());
	}
}
