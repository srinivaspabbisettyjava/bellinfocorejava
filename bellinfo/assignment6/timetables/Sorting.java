package bellinfo.assignment6.timetables;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		
		//printing();
	sorting();
	}
	public static void sorting(){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=scan.nextInt();
		int sort[]=new int[n+1];
		int i,temp;
		
		for(i=0;i<=n;i++){
			
			System.out.println("enter the number ");
			//Scanner scan=new Scanner(System.in);
			sort[i]=scan.nextInt();
			
		}
		
	for(i=0;i<=n;i++){
		Arrays.sort(sort);

		System.out.println(sort[i]);
	}
	}
	

}
