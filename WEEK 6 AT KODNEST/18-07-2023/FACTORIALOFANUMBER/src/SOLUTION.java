import java.util.Scanner;

public class SOLUTION {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a non-negative integer: ");
		int N = input.nextInt();

		int factorial = 1;

		// Calculate the factorial if N is non-negative
		for (int i = 1; i <= N; i++) {
			factorial *= i;//can be written as factorial=factorial*i; also
		}

		// Print the result if N is non-negative
		System.out.println("The factorial of " + N + " is: " + factorial);

		input.close();
	}
}
