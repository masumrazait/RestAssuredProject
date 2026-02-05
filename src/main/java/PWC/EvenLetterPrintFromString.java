package PWC;

public class EvenLetterPrintFromString {
	public static void main(String[] args) {
		String str = "EvenLetterPrintFromString";
		System.out.print("Even letter in string : ");
		for (int i = 1; i <= str.length() - 1; i += 2) {
			System.out.print(str.charAt(i) + " ");
		}
	}
}
