package ch01_introduction;

/**
 * Chapter 1 Introduction to Computers, Programs, and Java - Exercise 08:
 *  
 *  (Area and perimeter of a circle) Write a program that displays the area and perimeter
 *  of a circle that has a radius of 5.5 using the following formula:
 *  perimeter = 2 * radius * pi  || area = radius * radius * pi  	
 *
 * Created by Sravan Kumar .
 */

public class Ex08_APOfCircle {
	
	public static void main(String[] args) {
		
		final double PI = 3.14;
		double radius = 5.5;
		
		double perimeterOfCircle = 2 * PI * radius;		
		double areaOfCircle = PI * radius *radius;
		
		System.out.println("Perimeter of circle : " + perimeterOfCircle);
		System.out.println("Area of circle : " + areaOfCircle);
	}

}
