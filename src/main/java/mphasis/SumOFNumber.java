package mphasis;

public class SumOFNumber {
	public static void main(String[] args) {
		int num = 55;
		while (num >= 10) {
			int sum = 0;
			while (num > 0) {
				sum += num % 10;
				num = num / 10;
			}
			num = sum;
		}
		System.out.println(num);
	}
}
