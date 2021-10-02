package day02;

import java.util.Scanner;

public class RootsOfEquation {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Ax^2+Bx+C=0");
		System.out.println("Enter the coefficients for the above equation");
		System.out.println("Enter A");
		float a=scn.nextFloat();
		System.out.println("Enter B");
		float b=scn.nextFloat();
		System.out.println("Enter C");
		float c=scn.nextFloat();
		float r=+(b*b-4*a*c);
		float r1=r/2*a;
		float rt=-(b*b+4*a*c);
		float r2=rt/2*a;
		System.out.println("root "+r1);
		System.out.println("root "+r2);
		scn.close();
	}

}
