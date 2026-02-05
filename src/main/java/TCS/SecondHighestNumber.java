package TCS;

public class SecondHighestNumber {
	public static void main(String[] args) {
		int f = Integer.MIN_VALUE;
		int s = Integer.MIN_VALUE;
		for (int i = 1; i <= 100; i++) {
			if (i > f) {
				s = f;
				f = i;
			} else if (i > s && i != f) {
				s = i;
			}
		}
		System.out.println(s);
	}
}
