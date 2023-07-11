package com.kodnest.training.assignments;

public class NestedIfElse {
	
	    public static void main(String[] args) {
	        int x = 5;
	        int y = 10;

	        if (x > 0) {
	            System.out.println("Condition 1 is true!");
	        } else {
	            if (y < 20) {
	                System.out.println("Condition 1 is false and Condition 2 is true!");
	            } else {
	                System.out.println("Both Condition 1 and Condition 2 are false!");
	            }
	        }
	    }
	}



