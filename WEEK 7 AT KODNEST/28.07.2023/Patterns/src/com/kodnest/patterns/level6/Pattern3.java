package com.kodnest.patterns.level6;

public class Pattern3 {
	public static void main(String[] args) {
		System.out.print("    *");
		System.out.println();
		for(int i=1;i<=3;i++) {
			System.out.print(" * ");
		}
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || i==5 || j==1 || j==5) {
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
