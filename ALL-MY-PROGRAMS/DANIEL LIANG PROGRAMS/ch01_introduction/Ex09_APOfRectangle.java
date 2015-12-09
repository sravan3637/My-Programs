package ch01_introduction;

/**
 * Chapter 1 Introduction to Computers, Programs, and Java - Exercise 09:
 *  
 *  (Area and perimeter of a rectangle) Write a program that displays the area and
 *  perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following formula:
 *  		area = width * height  	
 *
 * Created by Sravan Kumar .
 */

public class Ex09_APOfRectangle {
	
	public static void main(String[] args) {
		
		double width = 4.5;
		double height = 7.9;
		
		double areaOfRectangle = width * height;
		double perimeterOfRectangle = 2 * (width + height);
		
		System.out.printf("Area of rectangle : %.2f\n", areaOfRectangle);
		System.out.println("Perimeter of rectangle : " + perimeterOfRectangle);
	}

}
