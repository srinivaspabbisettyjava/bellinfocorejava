package bellinfo.assignment.array;

import java.util.Scanner;

public class StudentArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] id=new int[20];
		String[] name=new String[20];
		double[] fee=new double[20];
		char[] section=new char[20];
		System.out.println("Number of students");
		int n = scan.nextInt();
		for(int i=0;i<n;i++){
		  System.out.println("enter student id");
		  id[i]=scan.nextInt();
		  System.out.println("name of the student");
		  name[i]=scan.next();
		  System.out.println("enter the fee of the student");
		  fee[i]=scan.nextDouble();
		  System.out.println("enter the section");
		  section[i]=scan.next().charAt(0);
		}
		  
		  System.out.println("****Student Details****");
		  System.out.println("n\tid\tname\tfee\tsection");
		  System.out.println("enter the section to print");
		  char a=scan.next().charAt(0);
		  
		  for(int i=0;i<n;i++){
			  
			  if(section[i]==a){
			  
			  System.out.println(id[i]+"  "+name[i]+"  "+fee[i]+"  "+section[i]);
		  }
		  }
		  
		  
		

	}

}
