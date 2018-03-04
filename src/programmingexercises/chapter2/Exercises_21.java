package programmingexercises.chapter2;

import java.util.Scanner;

/**
 * (Financial application: calculate future investment value) Write a program
 * that reads in investment amount, annual interest rate, and number of years,
 * and displays the future investment value using the following formula:
 * futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)numberOfYears*12 
 * For example, if you enter amount 1000, annual interest rate 3.25%, and 
 * number of years 1, the future investment value is 1032.98.
 * 
 * @uthor Edin Korkic
 */

public class Exercises_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter investment amount: ");

		double investment = input.nextDouble();

		System.out.print(" Enter annual interest rate in percentage: ");

		double interest = input.nextDouble();

		System.out.print(" Enter number of years: ");

		double years = input.nextDouble();

		input.close();

		interest /= 1200;

		double futureInvestment = investment * Math.pow(1 + interest, years * 12);

		System.out.format(" Accumulated value is $%.2f ", futureInvestment);

	}

}
