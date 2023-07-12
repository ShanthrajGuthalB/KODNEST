import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[5];
		System.out.println("Enter array elements");
		for (int i = 0; i <=arr.length-1; i++) {

			arr[i] = scan.nextInt();
		}
		System.out.println("Array contents are ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+"="+arr[i]+" ");
		}

		scan.close();
	}
}
