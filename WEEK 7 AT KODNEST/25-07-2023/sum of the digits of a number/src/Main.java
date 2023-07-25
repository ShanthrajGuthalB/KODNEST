import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		calculateSumOfDigits(n);
		scan.close();
	}
	static void calculateSumOfDigits(int n) {
		int p=0;
		while(n!=0) {
			int m=n%10;
			p=p+m;
			n=n/10;
		}		
		System.out.println("Sum of digits: "+p);
	}
}

