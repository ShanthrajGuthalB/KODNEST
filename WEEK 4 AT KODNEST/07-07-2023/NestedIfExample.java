package com.kodnest.training.assignments;

public class NestedIfExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        if (x > y) {
            System.out.println("x is greater than y");
            if (x > 10) {
                System.out.println("x is also greater than 10");
            } else {
                System.out.println("x is not greater than 10");
            }
        } else {
            System.out.println("x is not greater than y");
        }
    }
}
