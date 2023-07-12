//Write a Java Program To Take boolean data as input and store it in the array . 
//You can consider boolean data as maritial status of person
import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter total number of persons");
		Boolean arr[]=new Boolean[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter true if "+i+" is married if not false");
			arr[i]=scan.nextBoolean();
		}
		System.out.println("Array contents are...");
		for (int i=0;i<=arr.length-1;i++) {
			System.out.println("Person "+i+" married "+arr[i]);
		}
		scan.close();
	}
}
