package practise.session12.exceptions;

import java.util.Scanner;

public class ExceptionScenarioDemo {

	public static void main(String[] args) {
		try{
			
			@SuppressWarnings("resource")
			Scanner scan=new Scanner(System.in);
			System.out.println("enter a value");//("enetr the a value");
			int a=scan.nextInt();
			System.out.println("enetr the b value");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println("Result"+c);
			int x[]=new int[2];
			x[0]=10;
			x[1]=11;
			x[2]=12;
		}catch(ArithmeticException e){
			System.out.println("enetr a non zero value");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Afetr results continuing ");
		}
		System.out.println("After results.. continuing");
	}

}
