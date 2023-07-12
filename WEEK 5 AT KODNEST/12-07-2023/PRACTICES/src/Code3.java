//Find the Sum of N Natural Numbers in Java
import java.util.Scanner;

public class Code3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();

        int sum = 0; 
        for (int i = 1; i <= N; i++) {
            sum += i; //is nothing but sum = sum + i;
        }

        System.out.println("The sum of the first " + N + " natural numbers is: " + sum);
    }
}
