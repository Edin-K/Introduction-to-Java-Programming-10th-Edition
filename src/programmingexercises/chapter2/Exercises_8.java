package programmingexercises.chapter2;

import java.util.Scanner;

/**
 * (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that
 * displays the current time in GMT. Revise the program so that it prompts the
 * user to enter the time zone offset to GMT and displays the time in the
 * specified time zone.
 * 
 * @uthor Edin Korkic
 */

public class Exercises_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter the time zone offset to GMT: ");

		long offset = input.nextLong();

		input.close();

		long totalMilliseconds = System.currentTimeMillis();

		long totalSeconds = totalMilliseconds / 1000;

		long currentSecond = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;

		long currentMinute = totalMinutes % 60;

		long totalHours = totalMinutes / 60;

		long currentHour = totalHours % 24 + offset;

		System.out.format(" The current time is %d:%d:%d ", currentHour, currentMinute, currentSecond);

	}

}
