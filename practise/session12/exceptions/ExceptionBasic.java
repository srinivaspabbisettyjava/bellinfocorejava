package practise.session12.exceptions;

import java.util.Scanner;

public class ExceptionBasic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enetr the a value");
		int a=scan.nextInt();
		System.out.println("enetr the b value");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println("Result"+c);
		
	}

}
