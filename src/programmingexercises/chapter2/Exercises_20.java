package programmingexercises.chapter2;

import java.util.Scanner;

/**
 * (Financial application: calculate interest) If you know the balance and the
 * annual percentage interest rate, you can compute the interest on the next
 * monthly payment using the following formula: 
 * interest = balance * (annualInterestRate/1200) 
 * Write a program that reads the balance and the annual percentage interest 
 * rate and displays the interest for the next month.
 * 
 * @uthor Edin Korkic
 */

public class Exercises_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter balance and interest rate(e.g., 3 for 3%): ");

		double balance = input.nextDouble();

		double interestRate = input.nextDouble();

		input.close();

		double interest = balance * (interestRate / 1200);

		System.out.format(" The interest is %.5f ", interest);

	}

}
