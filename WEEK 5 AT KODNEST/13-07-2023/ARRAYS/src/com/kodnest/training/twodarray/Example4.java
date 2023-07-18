package com.kodnest.training.twodarray;
import java.util.Scanner;
public class Example4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] arr = new String[6][];
		arr[0] = new String[2];
		arr[1] = new String[7];
		arr[2] = new String[3];
		arr[3] = new String[2];
		arr[4] = new String[4];
		arr[5] = new String[5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter name of the class " + i + " student " + j);
				arr[i][j] = scan.nextLine();
			}
		}
		System.out.println("Array contents are.....");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}
