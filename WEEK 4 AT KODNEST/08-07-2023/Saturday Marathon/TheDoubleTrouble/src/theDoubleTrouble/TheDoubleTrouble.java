package theDoubleTrouble;

import java.util.Scanner;

public class TheDoubleTrouble {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		int num=scan.nextInt();
		System.out.println(doubleTheNumber(num));
	}
	public static int doubleTheNumber(int num) {
		return num*2;
	}

}
