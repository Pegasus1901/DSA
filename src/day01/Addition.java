package day01;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First number");
		int a=scn.nextInt();
		System.out.println("Enter Second number");
		int b=scn.nextInt();
		System.out.print(a+b);
		scn.close();

	}

}
