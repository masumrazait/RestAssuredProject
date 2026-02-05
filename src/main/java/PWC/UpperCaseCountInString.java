package PWC;

public class UpperCaseCountInString {
	public static void main(String[] args) {
		String str = "UpperCaseCountInString";
		System.out.print("Upper letter: ");
		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				System.out.print(c + " ");
			}
		}
	}
}
