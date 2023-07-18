package com.kodnest.training.twodarray;
import java.util.Scanner;
public class Example6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1D length");
		int arr[][]=new int[scan.nextInt()][];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter 2nd D length for 1st D "+i);
			arr[i]=new int[scan.nextInt()];
		}
		scan.nextLine();
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter score of "+i+" player "+j);
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("Array Contents Are.....");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();
	}
}
