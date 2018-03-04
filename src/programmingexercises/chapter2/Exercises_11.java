package programmingexercises.chapter2;


import java.util.Scanner;

/**
 * (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
 * to enter the number of years and displays the population after the number of
 * years. Use the hint in Programming Exercise 1.11 for this program. The
 * population should be cast into an integer.
 * 
 * @uthor Edin Korkic
 */

public class Exercises_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter the number of years: ");

		int years = input.nextInt();

		input.close();

		int currentPopulation = 312032486;

		int time = years * (365 * 24 * 60 * 60);

		int birth = time / 7;

		int death = time / 13;

		int imigrant = time / 45;

		int population = currentPopulation + birth - death + imigrant;

		System.out.format(" The population in %d years is %d  ", years, population);
	}

}
