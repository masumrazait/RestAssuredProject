package TCS;

public class Numbersum {
	public static void main(String[] args) {
		int num = 99999;
		while (num >= 10) {
			int sum = 0;
			while (num > 0) {
				sum += num % 10;
				num = num / 10;
			}
			num = sum;
		}
		System.out.println("Sum of the Number: " + num);
	}
}
