package day03;
import java.util.Scanner;

public class TableTill10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the number of which you want a table");
		int a=sc.nextInt();
		
		for(int i=0;i<=10;i++) {
			System.out.println(a+"x"+i+"="+a*i);
		}
		sc.close();
	}

}
