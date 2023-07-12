//"Fibonacci series up to " + limit + ":"
import java.util.Scanner;

public class Code6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the limit for the Fibonacci series: ");
		int limit = scan.nextInt();
		System.out.println("Fibonacci series up to " + limit + ":");
		int first = 0;
		int second = 1;
		int next;
		while(first+second<=limit) {
			next = first + second;
			System.out.print(next+" ");
			first = second;
			second = next;
		}


	}
}
