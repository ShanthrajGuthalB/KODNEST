//WRITE A PROGRAMME TO FINDE WHETHER THE GIVE
//NUMBER IS "+ve" OR "-ve".
import java.util.Scanner;

public class Code1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find whether its a +ve or -ve number");
		int i=scan.nextInt();

		if(i<0) {
			System.err.println(i+" is a negative number");
		}
		else if(i>0) {
			System.out.println(i+" is a positive number");
		}
		else {
			System.out.println(i+" or zero");
		}
		scan.close();

	}
}
