package programmingexercises.chapter1;

/**
 * (Population projection)The U.S. Census Bareau projects population based on
 * the following assumptions: - One birth every 7 seconds - One death every 13
 * seconds - One new immigrant every 45 seconds Write a program to display the
 * population for each of the next five year.Assume the current population is
 * 312.032.486 and one year has 365 days.Hint:In Java,if two integers perfom
 * division ,the result is an integer.The fractional part is truncated.For
 * example, 5/4 is 1(not 1.25) and 10/4 is 2(not 2.5).To get an accurate result
 * with the fractional part,one of the values involved in the division must be a
 * number with a decimal point.For example, 5.0/4 is 1.25 and 10/4.0 is 2.5.
 * 
 * @uthor Edin Korkic
 */

public class Exercises_11 {

	public static void main(String[] args) {
		
		System.out.println(" Population for one year:" + (312032486 + (31536000 / 7) - (31536000 / 13) + (31536000 / 45)));
		
		System.out.println(" Population for two years:" + (312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 2)));
		
		System.out.println(" Population for three years:" + (312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 3)));
		
		System.out.println(" Population for four years:" + (312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 4)));
		
		System.out.println(" Population for five years:" + (312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 5)));
		
	}

}
