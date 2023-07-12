//Find the Greatest of the Two Numbers in Java

import java.util.Scanner;

public class Code8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a>b) {
			System.out.println(a+" is greater than "+b);
		}
		else if (b>a){
			System.out.println(b+" is greater than "+a);
		}
		else {
			System.out.println("Read the message properly!");
		}
	}
}
