import java.util.Scanner;

public class Solution8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to print even numbers divisible by 3");
		int n = scan.nextInt();
		int count=divByThree(n);
		System.out.println("Total even numbers divisible by 3: " + count);
		scan.close();
	}
	public static int divByThree(int n){
		int count=0;
		for(int i=0;i<=n;i++) {
			if(i%3==0 && i%2==0) {
				System.out.println(i);
				count++;
			}
		}
		return count;
	}

}