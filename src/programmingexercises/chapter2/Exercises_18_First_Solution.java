package programmingexercises.chapter2;


/**
 * (Print a table) Write a program that displays the following table. Cast
 * floatingpoint numbers into integers. 
 * 
 *  a	b	pow(a, b)
 *  1	2	1 
 *  2	3	8 
 *  3	4	81 
 *  4	5	1024 
 *  5	6	15625 
 * 
 * @uthor Edin Korkic
 */

public class Exercises_18_First_Solution {

	public static void main(String[] args) {

		System.out.format("  a	b	pow(a, b)\n");
		System.out.format("  %d	%d	%d \n ", 1, 2, (int) Math.pow(1, 2));
		System.out.format(" %d	%d	%d \n ", 2, 3, (int) Math.pow(2, 3));
		System.out.format(" %d	%d	%d \n ", 3, 4, (int) Math.pow(3, 4));
		System.out.format(" %d	%d	%d \n ", 4, 5, (int) Math.pow(4, 5));
		System.out.format(" %d	%d	%d ", 5, 6, (int) Math.pow(5, 6));

	}

}
