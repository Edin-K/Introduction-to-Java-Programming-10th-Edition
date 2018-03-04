package programmingexercises.chapter2;

import java.util.Scanner;

/**
 * (Financial application: calculate tips) Write a program that reads the
 * subtotal and the gratuity rate, then computes the gratuity and total. For
 * example, if the user enters 10 for subtotal and 15% for gratuity rate, the
 * program displays $1.5 as gratuity and $11.5 as total.
 * 
 * @uthor Edin Korkic
 */

public class Exercises_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter a subtotal and a gratuity rate: ");

		double subTotal = input.nextDouble();

		double gratuity = input.nextDouble();

		input.close();

		double gratuityRate = subTotal * (gratuity / 100);

		double total = subTotal + gratuityRate;

		System.out.format(" The gratuity is $%.1f and total is $%.1f ", gratuityRate, total);

	}

}
