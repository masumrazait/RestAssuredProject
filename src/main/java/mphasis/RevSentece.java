package mphasis;

public class RevSentece {
	public static void main(String[] args) {
		String str = "masum123raza";
		String rev = "";
		for (int i = str.length()-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}
}
