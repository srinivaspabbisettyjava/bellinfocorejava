import java.util.Scanner;
public class Assignment1 {
	static int a,b,c,d,i=1;
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.printf("enter the value of a is");
		int a=in.nextInt();
		System.out.printf("enter the value of b is");
		int b=in.nextInt();
		System.out.printf("enter the value of c is");
		int c=in.nextInt();
		System.out.printf("enter the value of d is");
		int d=in.nextInt();
		     if((a>b) &&(c>b)&&(d>b))
			    System.out.println("smallest is 'b'");
		     else if((b>a)&&(c>a)&&(d>a))
			    System.out.println("smallest is 'a'");
		     else if((a>c)&&(b>c)&&(d>c))
			    System.out.println("smallest is 'c'");
		     else
		    	System.out.println("smallest is 'd'");		
		
	}
}

			
      

