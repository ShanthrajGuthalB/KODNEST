import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to print numbers divisible by 2");
		int n = scan.nextInt();
		int count = divByTwo(n); // Call divByTwo method and get the count

		System.out.println("Total numbers divisible by 2: " + count);

		scan.close();
	}

	public static int divByTwo(int n) {
		int count = 0; // Variable to store the count of numbers divisible by 2

		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				count++; // Increment count for each number divisible by 2
			}
		}

		return count; // Return the count of numbers divisible by 2
	}
}
