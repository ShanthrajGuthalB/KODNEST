package com.kodnest.training.twodarray;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of row and columns in an array");
		int [][]arr = new int [scan.nextInt()][scan.nextInt()];
		for (int i=0;i<=arr.length-1;i++) {
			for (int j=0;j<=arr[i].length-1;j++) {
				System.out.print("Enter marks of the class "+i+" student "+j);
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("Array contents are....");
		for (int i=0;i<=arr.length-1;i++) {
			for (int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();
	}
}
