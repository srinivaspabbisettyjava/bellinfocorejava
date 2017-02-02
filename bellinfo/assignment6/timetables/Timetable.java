package bellinfo.assignment6.timetables;

import java.util.Scanner;

public class Timetable {

	public static void main(String[] args) {
		//int x=0,y=0;
		int[][] output=new int[11][11];
		output=timetable(11,11);
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the table to print ");
		int a=scan.nextInt();
		
			for(int j=0;j<output.length;j++){
				System.out.println(a+" * "+j+ "="+output[a][j]);
			}
		}
	
public static int[][] timetable(int x,int y ){
	int[][] t=new int[11][11];
	for(int i=0;i<t.length;i++){
		for(int j=0;j<t.length;j++){
			t[i][j]=(i)*(j);
		}
	}
	return t;
}
}
