import java.util.Scanner;

public class Factorial {
	static int i,n,fact=1;
	public static void main(String[] args){
		
		Scanner in=new Scanner(System.in);
		System.out.printf("enter the value of n is");
		int n=in.nextInt();
		
		for(i=1;i<=n;i++)
			fact=fact*i;
		System.out.println("factorial of the given number is" +fact);
	}

}
