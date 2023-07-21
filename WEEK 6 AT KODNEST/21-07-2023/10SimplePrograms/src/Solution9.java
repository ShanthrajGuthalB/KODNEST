import java.util.Scanner;

public class Solution9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to print odd numbers divisible by 5");
		int n = scan.nextInt();
		int count=divByFive(n);
		System.out.println("Total even numbers divisible by 3: " + count);
		scan.close();
	}
	public static int divByFive(int n){
		int count=0;
		for(int i=0;i<=n;i++) {
			if(i%5==0 && i%2!=0) {
				System.out.println(i);
				count++;
			}
		}
		return count;
	}

}