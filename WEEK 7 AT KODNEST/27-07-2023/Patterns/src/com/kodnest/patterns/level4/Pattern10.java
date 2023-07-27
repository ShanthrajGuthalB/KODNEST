package com.kodnest.patterns.level4;

public class Pattern10 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int f=1;f<=i;f++) {
				System.out.print(" ");
			}
			for(int v=5;v>=i;v--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int e=5;e>=i;e--) {
				System.out.print(" ");
			}
			for(int t=1;t<=i;t++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
