package Coforge;

public class SecondHigheStNum {
	public static void main(String[] argsecond) {
		int firsecondt = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int i = 1; i <= 100; i++) {
			if (i > firsecondt) {
				second = firsecondt;
				firsecondt = i;
			} else if (i > second && i != firsecondt) {
				second = i;
			}
		}
		System.out.println("Second highest number is: " + second);
	}

}
