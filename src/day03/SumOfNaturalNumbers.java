package day03;
import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number till which you want the sum");
		int a = sc.nextInt();
		int sum=0;
		for(int i=0;i<=a;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		sc.close();
	}
}
