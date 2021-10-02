package day02;

import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Character");
		char a=scn.next().charAt(0);
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
			System.out.println(a+" is a Vowel");
		}
		else {
			System.out.println(a+" is a Consonant");
		}
		
	}

}
