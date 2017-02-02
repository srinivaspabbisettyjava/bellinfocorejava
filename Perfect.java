import java.util.Scanner;


public class Perfect {
	static int i,Sum=0,Number;
	public static void main(String[] args){
		
		Scanner in=new Scanner(System.in);
		System.out.printf("enter the value of Number is");
		int Number=in.nextInt();
		
		for(i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				Sum = Sum + i;
			}
		}
		if(Sum==Number){
			System.out.println("given number is a perfect number");
		}
		else{	
		System.out.println("given number is not a perfect number" );
	     }
	}
	

}
