public class Demo {
    public static void main(String[] args) {
        // Autoboxing: Converting primitive types to their corresponding wrapper classes
        int num = 42;
        Integer wrappedNum = num; // Autoboxing

        System.out.println("Autoboxing example:");
        System.out.println("Primitive int: " + num);
        System.out.println("Wrapped Integer: " + wrappedNum);

        // Unboxing: Converting wrapper classes to their corresponding primitive types
        Double doubleValue = 3.14;
        double unwrappedValue = doubleValue; // Unboxing

        System.out.println("\nUnboxing example:");
        System.out.println("Wrapped Double: " + doubleValue);
        System.out.println("Unwrapped double: " + unwrappedValue);

        // Autoboxing and unboxing with method parameters
        calculateSum(10, 20); // primitive int values are autoboxed to Integer objects
        calculateProduct(2.5, 3); // primitive double and int values are autoboxed to Double and Integer objects
    }

    public static void calculateSum(Integer a, Integer b) {
        int sum = a + b; // Integer objects are unboxed to primitive int for calculation
        System.out.println("\nSum: " + sum);
    }

    public static void calculateProduct(Double a, Integer b) {
        double product = a * b; // Double and Integer objects are unboxed to primitive double and int for calculation
        System.out.println("Product: " + product);
    }
}
