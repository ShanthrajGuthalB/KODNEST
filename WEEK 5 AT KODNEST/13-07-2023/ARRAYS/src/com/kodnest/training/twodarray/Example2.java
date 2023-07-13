package com.kodnest.training.twodarray;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter rows & columns, where rows = number of games, columns = number of players");
		float[][] arr = new float[scan.nextInt()][scan.nextInt()];
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				System.out.print("Height of game " + i + " player " + j + ": ");
				arr[i][j] = scan.nextFloat();
			}
		}
		System.out.println("Array contents are.....");

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}
