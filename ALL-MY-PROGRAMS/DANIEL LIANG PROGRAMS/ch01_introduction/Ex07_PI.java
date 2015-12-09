package ch01_introduction;

/**
 * Chapter 1 Introduction to Computers, Programs, and Java - Exercise 06:
 *  
 *  (Approximatep) p can be computed using the following formula:
 *  	
 *
 * Created by Sravan Kumar .
 */

public class Ex07_PI {
	
	public static void main(String[] args) {
		
		double result1 = 4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
		
		double result2 = 4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);
		
		System.out.println(result1);
		System.out.println(result2);
	}

}
