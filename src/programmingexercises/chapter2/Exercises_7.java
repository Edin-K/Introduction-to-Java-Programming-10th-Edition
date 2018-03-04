package programmingexercises.chapter2;


import java.util.Scanner;

/**
 * (Find the number of years) Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion), and displays the number of years and days for the
 * minutes. For simplicity, assume a year has 365 days.
 * 
 * @uthor Edin Korkic
 */

public class Exercises_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter number of minutes: ");

		int minutes = input.nextInt();

		input.close();

		int years = minutes / (365 * 24 * 60);

		int days = minutes % (365 * 24 * 60) / (24 * 60);

		System.out.format("%d minutes is approximately %d years %d days.", minutes, years, days);

	}

}
