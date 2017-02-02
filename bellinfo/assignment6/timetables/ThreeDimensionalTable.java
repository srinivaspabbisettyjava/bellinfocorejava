package bellinfo.assignment6.timetables;

import java.util.Scanner;

public class ThreeDimensionalTable {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the table to print ");
		int a=scan.nextInt();
		int[][][] output=new int[11][11][11];
		output=table(11,11,11);
		
		for(int j=0;j<output.length;j++){
			for(int k=0;k<output.length;k++){
				System.out.println(a+" * "+j+" * "+k+" =  "+output[a][j][k]);
			}
		}
		
	
	}
	public static int[][][] table(int x,int y,int z){
		int [][][] b=new int[11][11][11];
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b.length;j++){
				for(int k=0;k<b.length;k++){
					b[i][j][k]=(i)*(j)*(k);				
			}
		}
	}
return b;
}
}