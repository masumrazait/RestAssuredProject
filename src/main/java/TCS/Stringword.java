package TCS;

public class Stringword {
	public static void main(String[] args) {
		String str = "masum delhi patna bihar amnour bihar patna raza";
		String words[] = str.split(" ");
		String revString = "";
		for (String word : words) {
			String revWord = "";
			int len = word.length();
			for (int i = len - 1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
			}
			revString = revString + revWord + " ";
		}
		System.out.println(revString);
	}

}
