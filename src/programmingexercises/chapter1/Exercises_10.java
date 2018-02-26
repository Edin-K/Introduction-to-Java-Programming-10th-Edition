package programmingexercises.chapter1;

/**
 * (Average speed in miles)Assume a runner runs 14 kilometers in 45 minutes and
 * 30 seconds. Write a program that displays the average speed in miles per
 * hour. (Note that 1 mile is 1.6 kilometers.)
 * 
 * @uthor Edin Korkic
 */

public class Exercises_10 {

	public static void main(String[] args) {

		System.out
				.println(" Average speed in miles per hour:" + ((14.0 / 1.6) / ((45.5 * 60.0 + 30.0) / (60.0 * 60.0))));

	}

}
