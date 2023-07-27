package com.kodnest.patterns.level4;
public class Pattern4 {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for (int a=1;a<=5;a++) {
				System.out.print("#");
			}
			for (int b=1;b<=i;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
