package day02;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a=scn.nextInt();
		if(a%2==0) {
			System.out.println("Your Number "+a+ " is Even");
		}
		else {
			System.out.println("Your Number "+a+" is Odd");
		}
		scn.close();
	}

}
