package TCSsecondRound;

public class Repeated {
	public static void main(String[] args) {
		String str = "masum";
		System.out.print("repeated character is: ");
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.print(c);
			}
		}
		System.out.print("\nnon repeated character is: ");
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) != str.lastIndexOf(c)) {
				System.out.print(c);
			}
		}
	}
}
