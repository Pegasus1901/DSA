/**
 * 
 */
package day01;

import java.util.Scanner;

/**
 * @author Prathmesh Shevale
 * the user is asked to enter two integers (divisor and dividend) and the quotient and the remainder of their division is computed
 */
public class DivisionProgram {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Divisor");
		int a=scn.nextInt();
		System.out.println("Enter Dividend");
		int b=scn.nextInt();
		System.out.println("The Remainder is="+a/b);
		System.out.println("The Quotient is="+(b-(a/b))/a);
		scn.close();

	}

}
