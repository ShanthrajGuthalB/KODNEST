import java.util.Scanner;

public class Calculator {
	Scanner scan=new Scanner(System.in);
 
	void add() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
	}
	void sub() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b));
	}
	void mul() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
	}
	void div() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Division of "+a+" by "+b+" is "+(a/b));
	}
	void mod() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Remainder of "+a+" divided by "+b+" is "+(a%b));
	}
	void power() {
		int a = scan.nextInt();
		System.out.println("Square of "+a+" is "+(a*a));
	}


}
