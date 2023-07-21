import java.util.Scanner;

public class Solution10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int evenPrimeCount = 0; // Counter for even prime numbers
		int oddPrimeCount = 0;  // Counter for odd prime numbers

		System.out.println("Even Prime Numbers up to 10:");
		for (int i = 2; i <= N; i++) {
			if (isPrime(i) && isEven(i)) {
				System.out.println(i);
				evenPrimeCount++;
			}
		}

		System.out.println("\nOdd Prime Numbers up to 10:");
		for (int i = 2; i <= N; i++) {
			if (isPrime(i) && !isEven(i)) {
				System.out.println(i);
				oddPrimeCount++;
			}
		}

		System.out.println("\nTotal Even Prime Numbers: " + evenPrimeCount);
		System.out.println("Total Odd Prime Numbers: " + oddPrimeCount);
		scan.close();
	}

	// Method to check if a number is prime
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	// Method to check if a number is even
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
}
