package programmingexercises.chapter2;

import java.util.Scanner;

/**
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter
 * the side of a hexagon and displays its area. The formula for computing the
 * area of a hexagon is Area = 3 sqrt(3) / 2 * s^2 where s is the length of a
 * side.
 * 
 * @uthor Edin Korkic
 */

public class Exercises_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter the side: ");

		double side = input.nextDouble();

		input.close();

		double area = (3 * Math.sqrt(3) / 2) * Math.pow(side, 2);

		System.out.format(" The area of the hexagon is %.4f ", area);

	}

}
