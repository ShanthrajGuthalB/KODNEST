import java.util.Scanner;

public class Subtraction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int num1 = scan.nextInt();
		System.out.println("Enter 2nd number :");
		int num2 = scan.nextInt();
		if(num1>num2)
		{
			System.out.println(num2-num1);
		}
		else
		{
			System.out.println(num1-num2);
		}
		
		scan.close();

	}

}
