import java.util.Scanner;

public class Main {

	public static void calculateSumOfSeries(int n) {
		double sum = 0.0;
		for (int i = 1; i <= n; i++) {
			sum += 1.0 / i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a number n");
		int n = input.nextInt(); // Replace this with any desired input
		calculateSumOfSeries(n);
		input.close();
	}
}
