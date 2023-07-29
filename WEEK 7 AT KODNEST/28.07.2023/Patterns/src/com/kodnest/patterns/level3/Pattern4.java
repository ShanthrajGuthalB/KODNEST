package com.kodnest.patterns.level3;

public class Pattern4 {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for (int m=1;m<=i;m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1;i<=5;i++) {
			for (int m=5;m>=i;m--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
