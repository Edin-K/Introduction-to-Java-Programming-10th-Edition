package programmingexercises.chapter1;

/**
 * (Algebra:solve 2 x 2 linear equations)You can use Cramer's rule to solve the
 * following 2 x 2 system of linear equation: 
 * ax + by = e 
 * cx + dy = f 
 * x = ed - bf / ad - bc 
 * y = af - ec / ad - bc 
 * Write a program that solves the following equation and displays the value for 
 * x and y: 3.4x + 50.2y = 44.5  2.1x + .55y = 5.9
 * 
 * @uthor Edin Korkic
 */

public class Exercises_13 {

	public static void main(String[] args) {

		System.out.println(" x = " + (44.5 * .55 - 50.2 * 5.9) / (3.4 * .55 - 50.2 * 2.1));
		System.out.println(" y = " + (3.4 * 5.9 - 44.5 * 2.1) / (3.4 * .55 - 50.2 * 2.1));

	}

}
