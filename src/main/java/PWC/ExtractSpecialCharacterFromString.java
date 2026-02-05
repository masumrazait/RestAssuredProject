package PWC;

public class ExtractSpecialCharacterFromString {
	public static void main(String[] args) {
		String str = "Extr@#$%a3456c765t43567Spe$%ci%a565lC78hara54#$%cte%$$romS%$%$#tring";
		String rep = str.replaceAll("[^a-zA-Z]", "");
		System.out.println("Regular expreaction : " + rep);
	}
}
