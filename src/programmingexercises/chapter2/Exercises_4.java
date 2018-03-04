package programmingexercises.chapter2;

import java.util.Scanner;

/**
 * (Convert pounds into kilograms) Write a program that converts pounds into
 * kilograms. The program prompts the user to enter a number in pounds, converts
 * it to kilograms, and displays the result. One pound is 0.454 kilograms.
 * 
 * @uthor Edin Korkic
 */

public class Exercises_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter a number in pounds: ");

		double pounds = input.nextDouble();

		input.close();

		double kilograms = pounds * 0.454;

		System.out.format(" %.1f pounds is %.3f kilograms ", pounds, kilograms);

	}

}
