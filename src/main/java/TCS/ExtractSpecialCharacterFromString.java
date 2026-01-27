package TCS;

public class ExtractSpecialCharacterFromString {
	public static void main(String[] args) {
		String str = "m(*&a@#$4s0987*8u)(*&m";
		String rep = str.replaceAll("[^a-zA-Z]", "");
		System.out.print("replaced the special characters is: " + rep);
	}

}
