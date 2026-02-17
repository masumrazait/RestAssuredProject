package TCSsecondRound;

public class Prime {
	public static void main(String[] args) {
		int primeCount = 0;
		int notPrimeCount = 0;
		for (int num = 1; num <= 100; num++) {
			if (isPrime(num)) {
				System.out.println(num + " is prime");
				primeCount++;
			} else {
				System.out.println(num + " is not prime");
				notPrimeCount++;
			}
		}
		System.out.println("\n--- Summary ---");
		System.out.println("Total prime numbers: " + primeCount);
		System.out.println("Total not prime numbers: " + notPrimeCount);
	}

	private static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}