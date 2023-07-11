import java.util.Scanner;

public class HalveIt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.printf("%.2f", halveTheNumber(num));
		scan.close();
	}
	public static double halveTheNumber(double num) {
		return num/2;
	}

}
