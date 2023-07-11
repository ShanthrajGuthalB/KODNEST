import java.util.Scanner;

public class TheJourneyCalculatorApp {

	public static void main(String[] args) {
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter speed & time as real numbers");
		double speed = scan.nextDouble();
		double time = scan.nextDouble();
		System.out.printf("%.2f",journeyCalculator.calculateDistance(speed, time));
		scan.close();
	}

}
