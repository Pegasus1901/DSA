package day01;
import java.util.Scanner;


public class IntOutput {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int a=scn.nextInt();
		System.out.print(a);
		scn.close();
	}
}
