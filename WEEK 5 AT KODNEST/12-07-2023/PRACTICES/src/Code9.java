//Check Whether or Not the Number is a Palindrome in Java

import java.util.Scanner;

public class Code9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if it is a Palindrome or not");
		// Variable initialization
		int num = scan.nextInt(); // Number to be checked
		int reverse = 0; // Stores the reversed number
		int rem, temp; // Temporary variables for calculations

		temp = num; // Store the original number in a temporary variable

		// Loop to find the reverse of the number
		while (temp != 0) {
			rem = temp % 10; // Get the last digit of the number
			reverse = reverse * 10 + rem; // Build the reversed number by adding the last digit
			temp /= 10; // Remove the last digit from the original number
		}

		// Check if the original number is equal to the reversed number
		if (num == reverse) {
			System.out.println(num + " is a palindrome");
		} else {
			System.out.println(num + " is not a palindrome");
		}
	}
}
