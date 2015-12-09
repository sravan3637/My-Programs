package ch01_introduction;

/**
 * Chapter 1 Introduction to Computers, Programs, and Java - Exercise 04:
 *  
 *  (Print a table) Write a program that displays the following table:
 *  
			a 	a^2 	a^3
			1	 1 		1
			2 	 4 		8
			3 	 9 		27
			4 	16 		64
 *
 * Created by Sravan Kumar .
 */

public class Ex04_PrintATable {
	
	public static void main(String[] args) {
	
			
			System.out.printf("%3s %6s %6s\n", "a", "a^2", "a^3");
	         for (int i = 1; i <= 4; i++) {
	             System.out.printf("%3d  %5d  %5d\n", i, i * i, i * i * i);
	         }
			
	}	

}
