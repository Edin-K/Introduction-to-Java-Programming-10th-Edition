package programmingexercises.chapter2;

import java.util.Scanner;

/**
 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange
 * .java, to fix the possible loss of accuracy when converting a double value to
 * an int value. Enter the input as an integer whose last two digits represent
 * the cents. For example, the input 1156 represents 11 dollars and 56 cents.
 * 
 * @uthor Edin Korkic
 */

public class Exercises_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter an amount in integer,for example 1156: ");

		int amount = input.nextInt();
		input.close();

		int numberOfOneDollars = amount / 100;
		amount %= 100; // amount = amount % 100

		int numberOfQuarters = amount / 25;
		amount %= 25; // amount = amount % 25

		int numberOfDimes = amount / 10;
		amount %= 10; // amount = amount % 10

		int numberOfNickels = amount / 5;
		amount %= 5; // amount = amount % 5

		int numberOfPennies = amount;

		System.out.format(" Your amount %d consists of \n", amount);
		System.out.format(" %d dollars \n", numberOfOneDollars);
		System.out.format(" %d quarters \n", numberOfQuarters);
		System.out.format(" %d dimes \n", numberOfDimes);
		System.out.format(" %d nickels \n", numberOfNickels);
		System.out.format(" %d pennies ", numberOfPennies);

	}

}
