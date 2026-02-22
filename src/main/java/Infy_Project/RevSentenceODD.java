package Infy_Project;

public class RevSentenceODD {
	public static void main(String[] args) {
		String str = "ihled ihled antap antap ruonma ruonma";
		String RevSen = "";
		String words[] = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (i % 2 == 0) {
				String RevWord = "";
				for (int j = words[i].length() - 1; j >= 0; j--) {
					RevWord = RevWord + words[i].charAt(j);
				}
				RevSen = RevSen + RevWord + " ";
			} else {
				RevSen = RevSen + words[i] + " ";
			}
		}
		System.out.println(RevSen.trim());
	}
}
