package mphasis;

public class StringExpaind {
	public static void main(String[] args) {
		String str = "f3g4h5j6";
		String result = "";
		System.out.print("After String Expand : ");
		for (int i = 0; i < str.length(); i += 2) {
			char c = str.charAt(i);
			int count = Character.getNumericValue(str.charAt(i + 1));
			for (int j = 0; j <= count; j++) {
				result = result + c;
			}
		}
		System.out.println(result);
	}
}
