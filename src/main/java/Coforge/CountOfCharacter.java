package Coforge;

public class CountOfCharacter {
	public static void main(String[] args) {
		String str = "raza masum";
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
