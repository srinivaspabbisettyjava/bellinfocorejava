import java.util.Scanner;
public class Reverse {
	static int num,reversenum,temp;
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.printf("enter the numeber to reverse ");
		int num=in.nextInt();
		
		while(num!=0)
		{
			 reversenum=reversenum*10;
		     reversenum=reversenum+num%10;
		     num=num/10;
		}
		 
		 System.out.println("reverse of the given number is" +reversenum);
		 
	}

}
