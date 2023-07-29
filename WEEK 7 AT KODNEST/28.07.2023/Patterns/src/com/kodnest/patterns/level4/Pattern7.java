package com.kodnest.patterns.level4;
public class Pattern7 {
	public static void main(String[] args) {

		for(int i=1;i<=5;i++) {
			for(int y=1;y<=i;y++) {
				System.out.print(" ");
			}
			for(int x=1;x<=i;x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int u=5;u>=i;u--) {
				System.out.print(" ");
			}
			for(int z=5;z>=i;z--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}