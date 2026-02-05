package PWC;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 1234321;
		int rev = 0;
		int orignal = num;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (orignal == rev) {
			System.out.print(orignal + " num is palidrome");
		} else {
			System.out.println(orignal + " num is not palindrom");
		}
	}
}
