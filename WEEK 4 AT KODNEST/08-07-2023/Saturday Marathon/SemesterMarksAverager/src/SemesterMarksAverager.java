import java.util.Scanner;

public class SemesterMarksAverager {

	    public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
	    	System.out.println("Enter all semester marks");
	    	int sem1 = scan.nextInt();
	    	int sem2 = scan.nextInt();
	    	int sem3 = scan.nextInt();
	    	int sem4 = scan.nextInt();
	    	int sem5 = scan.nextInt();
	    	int sem6 = scan.nextInt();
	    	int sem7 = scan.nextInt();
	    	int sem8 = scan.nextInt();
	    	
	        double averageMarks = calculateAverage(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8);
	        System.out.printf("%.2f\n", averageMarks);
	        scan.close();
	    }
	    public static double calculateAverage(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7, int sem8) {
	        int totalMarks = sem1 + sem2 + sem3 + sem4 + sem5 + sem6 + sem7 + sem8;
	        double average = (double) totalMarks / 8.0;
	        return average;
	    }
	}
