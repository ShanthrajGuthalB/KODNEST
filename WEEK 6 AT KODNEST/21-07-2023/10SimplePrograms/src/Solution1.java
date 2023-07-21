import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n which is > 100");
		int n = scan.nextInt();
		int count = display(n); // Call display method and get the count

		System.out.println("Total numbers printed: " + count);

		scan.close();
	}

	public static int display(int n) {
		int count = 0; // Variable to store the count of numbers printed

		if (n > 100) {
			for (int i = 0; i <= n; i++) {
				System.out.println(i + " ");
				count++; // Increment count for each number printed
			}
			System.out.println(); // Move to the next line after printing all numbers
		} else {
			System.out.println("Read the message again");
		}

		return count; // Return the count of numbers printed
	}
}
