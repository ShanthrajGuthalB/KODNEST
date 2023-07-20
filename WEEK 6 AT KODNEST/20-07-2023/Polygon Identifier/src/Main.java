import java.util.Scanner;

public class Main { 
	public static void identifyPolygon(int sides) { 
		if (sides==3) {
			System.out.println("Its a triangle");
		}
		else if(sides==4) {
			System.out.println("Its a quadrilateral");
		}
		else if(sides==5) {
			System.out.println("Its a pentagon");
		}
		else if(sides==6) {
			System.out.println("Its a hexagon");
		}
		else {
			if(sides<=2) {
				System.out.println("Not a polygon");
			}
			else {
				System.out.println("Its a polygon");
			}
		}
	} public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of sides");
		int sides = scan.nextInt();
		identifyPolygon(sides); 
		scan.close();
	} 

}
