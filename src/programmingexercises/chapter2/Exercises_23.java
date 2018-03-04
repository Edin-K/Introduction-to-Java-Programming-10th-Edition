package programmingexercises.chapter2;

import java.util.Scanner;

/**
 * (Cost of driving) Write a program that prompts the user to enter the distance
 * to drive, the fuel efficiency of the car in miles per gallon, and the price
 * per gallon, and displays the cost of the trip.
 * 
 * @uthor Edin Korkic
 */

public class Exercises_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter the driving distance: ");

		double distance = input.nextDouble();

		System.out.print(" Enter miles per gallon: ");

		double miles = input.nextDouble();

		System.out.print(" Enter price per gallon: ");

		double price = input.nextDouble();

		input.close();

		double cost = (distance / miles) * price;

		System.out.format(" The cost of driving is $%.2f ", cost);

	}

}
