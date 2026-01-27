package TCS;

public class SumOfNumber {
	public static void main(String[] args) {
		int num = 91;
		while (num >= 10) {
			int sum = 0;
			while (num > 0) {
				sum += num % 10;
				num = num / 10;
			}
			num = sum;
		}
		System.out.println("additon of numbers: " + num);
	}

}
