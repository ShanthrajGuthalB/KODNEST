import java.util.Scanner;

public class TheFinanceCalculator {

	    public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
	        FinanceCalculator calculator = new FinanceCalculator();
	        
	        System.out.println("Enter is the principal amount");
	        double P = scan.nextDouble();
	        System.out.println("Enter is the rate of interest (in decimal)");
	        double R = scan.nextDouble();
	        System.out.println("Enter the time (in years)");
	        double T = scan.nextDouble(); 
	        
	        double interest = calculator.calculateSimpleInterest(P, R, T);
	        System.out.printf("%.2f\n", interest);
	        scan.close();
	    }
	}
