import java.util.Scanner;

public class Solution {

	public static void checkDiscount(double purchaseAmount)

	{ 
		if (purchaseAmount>100) {
			System.out.println("Discount Applicable");	
		}else {
			System.out.println("Discount Not Applicable");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Purchase Amount");
		double purchaseAmount=scan.nextDouble();
		checkDiscount(purchaseAmount);
		scan.close();

	}
}
