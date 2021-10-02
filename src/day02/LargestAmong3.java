package day02;

import java.util.Scanner;

public class LargestAmong3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter A");
		int a=scn.nextInt();
		System.out.println("Enter B");
		int b=scn.nextInt();
		System.out.println("Enter C");
		int c=scn.nextInt();
		if(a>b && a>c) {
			System.out.println("A number is greatest");
		}
		else if (b>a&&b>c) {
			System.out.println("B number is greatest");
		}
		else {
			System.out.println("C number is greatest");
		}
	}

}
