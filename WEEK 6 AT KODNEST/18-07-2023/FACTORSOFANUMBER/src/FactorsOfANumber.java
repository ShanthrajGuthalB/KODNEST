import java.util.Scanner;
public class FactorsOfANumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int N = input.nextInt();

		System.out.println("Factors of " + N + ":");
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				System.out.println(i);
			}
		}
		input.close();
	}
}