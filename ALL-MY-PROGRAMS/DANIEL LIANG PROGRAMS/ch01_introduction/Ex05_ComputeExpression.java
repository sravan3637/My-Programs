package ch01_introduction;

/**
 * Chapter 1 Introduction to Computers, Programs, and Java - Exercise 05:
 *  
 *  (Compute expressions) Write a program that displays the result of
				9.5 * 4.5 - 2.5 * 3 / 45.5 - 3.5
 *
 * Created by Sravan Kumar .
 */

public class Ex05_ComputeExpression {
	
	public static void main(String[] args) {
		
		double value = (9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5);
		
		System.out.printf("%.4f",value);
	}

}
