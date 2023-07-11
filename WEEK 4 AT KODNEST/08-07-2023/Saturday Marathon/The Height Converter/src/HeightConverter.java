import java.util.Scanner;

public class HeightConverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HeightConverter converter = new HeightConverter();
		double inches = scan.nextDouble();
		System.out.printf("%.2f",converter.convertInchesToFeet(inches));
		scan.close();
	}

	public double convertInchesToFeet(double inches) {
		return inches/12;
	}
}
