package Coforge;

public class SumofTheNumber {
	public static void main(String[] args) {
		int num = 9876;
		while (num >= 10) {
			int sum = 0;
			while (num > 0) {
				sum += num % 10;
				num = num / 10;
			}
			num = sum;
		}
		System.out.println("total num sum in single digit is : " + num);
	}
}
