import java.util.Scanner;

public class ArmstrongApp1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int original = num;
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        Armstrong1 armstrong = new Armstrong1();
        int res = armstrong.sumOfDigitsRaisedToPower(original, count);
        if (res == original) {
            System.out.println("Entered Number " + original + " is ARMSTRONG");
        } else {
            System.out.println("Entered Number " + original + " is not ARMSTRONG");
        }
        scan.close();
    }
}