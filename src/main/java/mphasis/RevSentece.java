package mphasis;

public class RevSentece {
	public static void main(String[] args) {
		String str = "masum123raza";
		String rev = "";
		for (int i = str.length()-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		
		String input = "masum123raza senetee raza delhi patna";
		String Sentrev = "";
		String words[]=input.split(" ");
		for(String word:words) {
			String Wordrev="";
			for (int i = word.length()-1; i >= 0; i--) {
			Wordrev = Wordrev + word.charAt(i);
		}
			Sentrev=Sentrev+Wordrev+" ";
	}
		System.out.println(Sentrev);
	}
}
