import java.util.Scanner;
public class Main1 {
		public static void checkMultipleOfTen(int n, int m) {

			if(n%m==0) {
				System.out.println("Entered number "+n+" is a multiple of "+m);
			}else {
				System.out.println("Entered number "+n+" is not a multiple of "+m);
			}
		}

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter two numbers to check whether it is a multiple of ");
			int n=scan.nextInt();
			int m=scan.nextInt();
			checkMultipleOfTen(n,m);
			scan.close();
		}
	}


	

