package programmingexercises.chapter2;

import java.util.Scanner;

/**
 * (Geometry: area of a triangle) Write a program that prompts the user to enter
 * three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its
 * area. The formula for computing the area of a triangle is 
 * s = (side1 + side2 + side3)/2
 * area = sqrt(s(s - side1)(s - side2)(s - side3))
 * 
 * @uthor Edin Korkic
 */

public class Exercises_19_Second_Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter three points for a triangle: ");
		
		double x1 = input.nextDouble();
		
		double y1 = input.nextDouble();

		double x2 = input.nextDouble();
		
		double y2 = input.nextDouble();
		
		double x3 = input.nextDouble();
		
		double y3 = input.nextDouble();
		
		input.close();
		
		double area = Math.abs(1.0 / 2 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)));
		
		System.out.format(" The area of a triangle is %.1f ", area);

	}

}
