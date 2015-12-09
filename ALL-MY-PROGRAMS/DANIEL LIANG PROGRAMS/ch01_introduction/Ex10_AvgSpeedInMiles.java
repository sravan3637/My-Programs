package ch01_introduction;

/**
 * Chapter 1 Introduction to Computers, Programs, and Java - Exercise 09:
 *  
 *  (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30 seconds.
 *  Write a program that displays the average speed in miles per hour. 
 *  (Note that 1 mile is 1.6 kilometers.) 	
 *
 * Created by Sravan Kumar .
 */

public class Ex10_AvgSpeedInMiles {
	
	public static void main(String[] args) {
		
		double kms = 14;
		double mins =  45.30;
		
		double miles = kms / 1.6;
		double hrs = mins / 60;
		
		System.out.println(miles/hrs);
	}

}
