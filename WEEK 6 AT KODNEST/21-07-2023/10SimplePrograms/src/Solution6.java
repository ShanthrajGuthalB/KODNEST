import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to print numbers divisible by 3 and in the table of 5");
		int n = scan.nextInt();
		int count = divByThreeAndTableOfFive(n);
		System.out.println("Total numbers divisible by 3 and in the table of 5: " + count);
		scan.close();
	}

	public static int divByThreeAndTableOfFive(int n) {
		int count = 0; // Variable to store the count of numbers that meet the criteria

		System.out.println("Numbers divisible by 3 and in the table of 5:");
		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
				count++; // Increment count for each number that meets the criteria
			}
		}

		return count; // Return the count of numbers that meet the criteria
	}
}






