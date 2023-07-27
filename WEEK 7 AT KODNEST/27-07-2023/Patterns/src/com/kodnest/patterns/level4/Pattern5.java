package com.kodnest.patterns.level4;
public class Pattern5 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int h=1;h<=i;h++) {
				System.out.print(" ");
			}
			for(int g=1;g<=i;g++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
