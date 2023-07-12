//Find the Sum of the Numbers in a Given Interval in Java
import java.util.Scanner;

public class Code4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number whose sum of interval has to be find..?");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum = 0;
		for (int i=a;i<=b;i++) {
			sum = sum+i;
		}
		System.out.println(sum);
	}
}
