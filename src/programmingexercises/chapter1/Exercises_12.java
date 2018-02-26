package programmingexercises.chapter1;

/**
 * (Average speed in kilometers)Assume a runner runs 24 miles in 1 hour,40
 * minutes,and 35 seconds. Write a program that displays the average speed in
 * kilometers per hour. (Note that 1 mile is 1.6 kilometers.)
 * 
 * @uthor Edin Korkic
 */

public class Exercises_12 {

	public static void main(String[] args) {
		
		System.out.println(" Average speed in kilometers per hour:" + (24.0 / ((100.5 * 60.0 + 35.0) / (60.0 * 60.0))) * 1.6);
		
	}

}
