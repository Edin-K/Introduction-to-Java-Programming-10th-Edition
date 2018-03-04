package programmingexercises.chapter2;


import java.util.Scanner;

/**
 * (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree
 * in a double value from the console, then converts it to Fahrenheit and
 * displays the result. The formula for the conversion is as follows: fahrenheit
 * = (9 / 5) * celsius + 32 Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
 * 
 * @uthor Edin Korkic
 */

public class Exercises_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter a degree in Celsius: ");

		double celsius = input.nextDouble();

		input.close();

		double fahrenheit = (9.0 / 5) * celsius + 32;

		System.out.format(" %.0f Celsius is %.1f Fahrenheit ", celsius, fahrenheit);
	}

}
