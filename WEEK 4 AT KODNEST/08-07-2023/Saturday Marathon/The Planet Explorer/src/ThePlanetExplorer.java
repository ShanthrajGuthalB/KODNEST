import java.util.Scanner;

public class ThePlanetExplorer {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	double radius = scan.nextDouble();
        ThePlanetExplorer explorer = new ThePlanetExplorer();
        double surfaceArea = explorer.calculateSurfaceArea(radius);
        System.out.printf("%.2f\n", surfaceArea);
        scan.close();
}

        public double calculateSurfaceArea(double radius) {
        	return  4 * Math.PI * Math.pow(radius, 2);
        }
}
