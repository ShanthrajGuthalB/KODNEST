import java.util.Scanner;

public class CgpaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter CGPA of 1st semester: ");
        double sem1 = scanner.nextDouble();

        System.out.println("Enter CGPA of 2nd semester: ");
        double sem2 = scanner.nextDouble();

        System.out.println("Enter CGPA of 3rd semester: ");
        double sem3 = scanner.nextDouble();

        System.out.println("Enter CGPA of 4th semester: ");
        double sem4 = scanner.nextDouble();

        System.out.println("Enter CGPA of 5th semester: ");
        double sem5 = scanner.nextDouble();

        System.out.println("Enter CGPA of 6th semester: ");
        double sem6 = scanner.nextDouble();

        System.out.println("Enter CGPA of 7th semester: ");
        double sem7 = scanner.nextDouble();

        System.out.println("Enter CGPA of 8th semester: ");
        double sem8 = scanner.nextDouble();

        System.out.println("Enter total number of semesters: ");
        int sem = scanner.nextInt();

        double m = 0.75;
        int t = 10;

        Cgpa cgpa = new Cgpa(name, sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8, sem, m, t);
        cgpa.marks();
        cgpa.result();
        cgpa.percentage();

        scanner.close();
    }
}