package TCS;

public class EvenLetterPrintFromString {
	public static void main(String[] args) {
		String str = "delhipantabihar";
		System.out.print("printing the even letter from the List: ");
		for (int i = 1; i <= str.length() - 1; i += 2) {
			System.out.print(str.charAt(i) + " ");
		}
	}

}
