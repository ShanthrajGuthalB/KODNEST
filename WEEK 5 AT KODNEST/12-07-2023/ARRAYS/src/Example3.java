import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Float arr[] = new Float[7];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the name of employee " + i + ": ");
            arr[i] = scan.nextFloat();
        }
        
        System.out.println("Names of the Employees Are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        scan.close();
    }
}
