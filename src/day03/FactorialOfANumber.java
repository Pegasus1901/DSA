package day03;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number till which you want the sum");
		int a = sc.nextInt();
		
		int fact=1;
		
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
