import java.util.Scanner;

public class GcdApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers to find the GCD");
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		int res=Gcd.findGCD(m, n);
		System.out.println("GCD OF "+m+" AND "+n+" IS "+res);
		scan.close();

	}
}
