//Check Whether or Not the Year is a Leap Year in Java
import java.util.Scanner;
public class Code7{

	public static void main (String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();

		if (year % 4 == 0 && (year % 100 != 0 || year % 400==0))
			System.out.println (year + " is a Leap Year");

		else
			System.out.println (year + " is not a Leap Year");

	}
}
