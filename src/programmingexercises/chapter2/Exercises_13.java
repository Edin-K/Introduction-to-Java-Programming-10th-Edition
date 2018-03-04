package programmingexercises.chapter2;

import java.util.Scanner;

/**
 * (Financial application: compound value) Suppose you save $100 each month into
 * a savings account with the annual interest rate 5%. Thus, the monthly
 * interest rate is 0.05/12 = 0.00417. After the first month, the value in the
 * account becomes 100 * (1 + 0.00417) = 100.417 After the second month, the
 * value in the account becomes (100 + 100.417) * (1 + 0.00417) = 201.252 After
 * the third month, the value in the account becomes (100 + 201.252) * (1 +
 * 0.00417) = 302.507 and so on. Write a program that prompts the user to enter
 * a monthly saving amount and displays the account value after the sixth month.
 * 
 * @uthor Edin Korkic
 */

public class Exercises_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter the monthly saving amount: ");

		double amount = input.nextDouble();

		input.close();

		double account = 0;

		account = (amount + account) * (1 + 0.00417);
		account = (amount + account) * (1 + 0.00417);
		account = (amount + account) * (1 + 0.00417);
		account = (amount + account) * (1 + 0.00417);
		account = (amount + account) * (1 + 0.00417);
		account = (amount + account) * (1 + 0.00417);

		System.out.format(" After the sixth mounth, the account value is $%.2f ", account);

	}

}
