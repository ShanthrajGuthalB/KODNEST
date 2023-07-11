import java.util.Scanner;

public class TemperatureConvertorApp {

	public static void main(String[] args) {
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        double temp = scan.nextDouble();
        double celsius = temperatureConverter.convertFahrenheitToCelsius(temp);
        System.out.printf("%.2f\n", celsius);
        scan.close();
	}

}
