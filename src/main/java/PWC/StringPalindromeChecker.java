package PWC;

public class StringPalindromeChecker {
	public static void main(String[] args) {
		String str = "jahaja";
		String orginal = str;
		String rev = "";
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (orginal.equals(rev)) {
			System.out.println("String is palindrom " + orginal);
		} else {
			System.out.println("String is not palindrom " + rev);
		}
	}
}
