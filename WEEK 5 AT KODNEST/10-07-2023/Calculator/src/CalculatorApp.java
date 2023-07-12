import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Kodnest Calculator");

		while(true) {
			System.out.println("Enter + --> Addition");
			System.out.println("Enter - --> Subtraction");
			System.out.println("Enter * --> Multiplication");
			System.out.println("Enter / --> Division");
			System.out.println("Enter % --> To Find The Remainder");
			System.out.println("Enter ^ --> To Find The Square");
			System.out.println("Enter ! --> To Stop The Programme");

			char ch = scan.next().charAt(0);

			switch(ch) 
			{
			case '+':calculator.add();
			break;
			case '-':calculator.sub();
			break;

			case '*':calculator.mul();
			break;

			case '/':calculator.div();
			break;

			case '%':calculator.mod();
			break;

			case '^':calculator.power();
			break;

			case '!':System.out.println("Ta Taa Bye Byee See You Sooooon");
			return;

			default :System.out.println("Khattam Gaya tata bye bye, read the message once more");
			break;


			}
			
		}

	}

}
