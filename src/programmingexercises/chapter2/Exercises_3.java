package programmingexercises.chapter2;

import java.util.Scanner;

/**
 * (Convert feet into meters) Write a program that reads a number in feet,
 * converts it to meters, and displays the result. One foot is 0.305 meter.
 * 
 * @uthor Edin Korkic
 */

public class Exercises_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter a value for feet: ");

		double feet = input.nextDouble();

		input.close();

		double meters = feet * 0.305;

		System.out.format(" %.1f feet is %.4f meters ", feet, meters);

	}

}
