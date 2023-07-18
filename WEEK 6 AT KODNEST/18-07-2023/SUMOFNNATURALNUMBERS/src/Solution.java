import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int N = input.nextInt();
		// Validate the input
		if (N <= 0) {
			System.out.println("Please enter a positive integer.");
		} else {
			// Calculate the sum of N natural numbers
			int sum = (N * (N + 1)) / 2;
			// Print the result
			System.out.println("The sum of the first " + N + " natural numbers is: " + sum);
		}
		input.close();
	}
}
