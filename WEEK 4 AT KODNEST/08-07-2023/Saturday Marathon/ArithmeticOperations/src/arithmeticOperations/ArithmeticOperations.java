package arithmeticOperations;



public class ArithmeticOperations {

	public static void main(String[] args) {
		
		
			int result1 =subtractNumbers(20, 5);
			System.out.println(result1);
			
			
			int result2 =multiplyNumbers(4, 5);
			System.out.println(result2);
			
			
			double result3 =divideNumbers(20, 4);
			System.out.printf("%.2f\n", result3); // formatted ouput
			
			
			int result4 =findRemainder(10, 3);
			System.out.println(result4);

	}
	public static int subtractNumbers(int num1, int num2) {
		return num1-num2;
		
	}

	public static int multiplyNumbers(int num1, int num2) {
		return num1*num2;
		
	}

	public static double divideNumbers(int num1, int num2) {
		return num1/num2;
		
	}

	public static int findRemainder(int num1, int num2) {
		return num1%num2;
		
	}

}
