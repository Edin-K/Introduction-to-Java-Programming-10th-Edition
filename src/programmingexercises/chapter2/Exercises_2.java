package programmingexercises.chapter2;

import java.util.Scanner;

/**
 * (Compute the volume of a cylinder) Write a program that reads in the radius
 * and length of a cylinder and computes the area and volume using the following
 * formulas: area = radius * radius * p 
 * volume = area * length
 * 
 * @uthor Edin Korkic
 */

public class Exercises_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter the radius and length of a cylinder: ");

		double radius = input.nextDouble();

		double length = input.nextDouble();

		input.close();

		double area = Math.pow(radius, 2) * Math.PI;

		double volume = area * length;

		System.out.format(" The area is %.4f\n ", area);

		System.out.format("The volume is %.1f ", volume);

	}

}
