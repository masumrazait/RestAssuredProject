package PWC;

public class IndexPositionOFAlphabet {
	public static void main(String[] args) {
		String str = "IndexPositionOFAlphabet";
		char c = 'i';
		System.out.print("Index positions of '" + c + "' are: ");
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == c) {
				System.out.print(i + " ");
			}
		}
	}
}
