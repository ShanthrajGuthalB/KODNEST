package com.kodnest.training.assignments;

public class NestedSimpleIf {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 15;

        if (x > 0) {
            if (y < 20) {
                if (z == 15) {
                    System.out.println("All conditions are true!");
                }
            }
        }
    }
}

