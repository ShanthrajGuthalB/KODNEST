import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age");
		int age = scan.nextInt();
		System.out.println(age>=18?"you are eligible for voting":"you are not eligible for voting");
		scan.close();
	}
}
