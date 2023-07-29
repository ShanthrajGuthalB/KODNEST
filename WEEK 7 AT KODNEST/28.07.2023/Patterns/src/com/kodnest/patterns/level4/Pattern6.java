package com.kodnest.patterns.level4;
public class Pattern6 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int r=5;r>=i;r--) {
				System.out.print(" ");
			}
			for(int q=5;q>=i;q--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
