class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;  // binary: 0101
        int b = 3;  // binary: 0011

        // Bitwise AND
        int resultAnd = a & b;  // binary: 0001 = 1
        System.out.println("Result of Bitwise AND: " + resultAnd);
        // Application: Setting up a mask to check the values of specific bits

        // Bitwise OR
        int resultOr = a | b;  // binary: 0111 = 7
        System.out.println("Result of Bitwise OR: " + resultOr);
        // Application: Adding two numbers if there is no carry involved

        // Left Shift
        int resultLeftShift = a << 2;  // binary: 010100 = 20
        System.out.println("Result of Left Shift: " + resultLeftShift);
        // Application: Shifting bits to align them

        // Right Shift
        int resultRightShift = a >> 1;  // binary: 0010 = 2
        System.out.println("Result of Right Shift: " + resultRightShift);
        // Application: Shifting bits to align them
    }
}
