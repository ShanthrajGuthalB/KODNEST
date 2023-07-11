package practice;

import java.util.Scanner;

public class Greet {
    private static int result; // Declare result as a class-level variable
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int a = scan.nextInt();
        
        System.out.print("Enter the second number: ");
        int b = scan.nextInt();
        
        sum(a, b);
        subtraction(a, b);
        multiplication(a, b);
        division(a, b);
        modulus(a, b);
        
        scan.close();
    }
    
    public static void sum(int a, int b) {
        result = a + b;
        System.out.println("Sum: " + result);
    }
    
    public static void subtraction(int a, int b) {
        result = a - b;
        System.out.println("Subtraction: " + result);
    }
    
    public static void multiplication(int a, int b) {
        result = a * b;
        System.out.println("Multiplication: " + result);
    }
    
    public static void division(int a, int b) {
        if (a != 0) {
            result = a / b;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
    
    public static void modulus(int a, int b) {
        result = a % b;
        System.out.println("Modulus: " + result);
    }
}
