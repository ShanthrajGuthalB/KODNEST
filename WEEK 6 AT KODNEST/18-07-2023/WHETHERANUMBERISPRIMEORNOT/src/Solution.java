import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
	        System.out.print("Enter a positive integer: ");
	        int number = input.nextInt();

	        if (number < 2) {
	            System.out.println(number + " is not a prime number.");
	        } else {
	            boolean isPrime = true;

	            // Check divisibility from 2 up to the square root of the number
	            for (int i = 2; i <= Math.sqrt(number); i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            if (isPrime) {
	                System.out.println(number + " is a prime number.");
	            } else {
	                System.out.println(number + " is not a prime number.");
	            }
	        }

	        input.close();
	    }
	}