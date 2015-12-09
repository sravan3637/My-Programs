package ch01_introduction;

/**
 * Chapter 1 Introduction to Computers, Programs, and Java - Exercise 02:
 *  
 *  (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following 2 * 2 system of linear equation:
				ax + by = e
				cx + dy = f

				x = e * d - b * f / a * d - b * c || y = a * f - e * c / a * d - b * c

 * Write a program that solves the following equation and displays the value for x and y:
				3.4x + 50.2y = 44.5
				2.1x + .55y = 5.9
 *
 * Created by Sravan Kumar .
 */

public class Ex13_LinearEquation {

	public static void main(String[] args) {

		/*3.4x + 50.2y = 44.5
		2.1x + .55y = 5.9*/

		double x = (0.55 * 2.1 - 50.2 * 5.9) / (3.4 * 2.1 - 50.2 * 44.5);
		double y = (3.4 * 5.9 - 0.55 * 44.5) / (3.4 * 2.1 - 50.2 * 44.5);

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		linearEquations("3.4x + 50.2y = 44.5","2.1x + 0.55y = 5.9");

	}

	public static void linearEquations(String eq1 ,String eq2) {
		
		StringBuffer e1 = new StringBuffer(eq1.trim());	
		StringBuffer e2 = new StringBuffer(eq2.trim());
		
		double a = Double.parseDouble(e1.substring(0,e1.indexOf("x")));
		e1.delete(0, e1.indexOf("x")+4);
		double b = Double.parseDouble(e1.substring(0,e1.indexOf("y")));
		e1.delete(0, e1.indexOf("y")+ 4);
		double c = Double.parseDouble(e1.toString());
		
		double d = Double.parseDouble(e2.substring(0,e2.indexOf("x")));
		e2.delete(0, e2.indexOf("x")+4);
		
		double e = Double.parseDouble(e2.substring(0,e2.indexOf("y")));
		e2.delete(0, e2.indexOf("y")+ 4);
		double f = Double.parseDouble(e2.toString());
		
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
