package programmingexercises.chapter2;

import java.util.Scanner;

/**
 * (Physics: acceleration) Average acceleration is defined as the change of
 * velocity divided by the time taken to make the change, as shown in the
 * following formula: a = v1 - v0 / t 
 * Write a program that prompts the user to enter the starting velocity v0
 * in meters/ second, the ending velocity v1 in meters/second, and the time 
 * span t in seconds, and displays the average acceleration.
 * 
 * @uthor Edin Korkic
 */

public class Exercises_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter v0, v1, and t: ");

		double velocity0 = input.nextDouble();

		double velocity1 = input.nextDouble();

		double time = input.nextDouble();

		input.close();

		double average = (velocity1 - velocity0) / time;

		System.out.format(" The average acceleration is %.4f ", average);

	}

}
