package day01;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First number");
		int a=scn.nextInt();
		System.out.println("Enter Second number");
		int b=scn.nextInt();
		int c = 0;
		System.out.println("Before Swapping-");
		System.out.println("First number="+a);
		System.out.println("Second number="+b);
		c= a;
		a= b;
		b= c;
		System.out.println("After Swapping-");
		System.out.println("First number="+a);
		System.out.println("Second number="+b);
		scn.close();
	}
}
