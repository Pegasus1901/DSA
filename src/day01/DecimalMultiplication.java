package day01;

import java.util.Scanner;

public class DecimalMultiplication {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First number");
		float a=scn.nextFloat();
		System.out.println("Enter Second Number");
		float b=scn.nextFloat();
		System.out.println("Answer-"+a*b);
		scn.close();
	}

}
