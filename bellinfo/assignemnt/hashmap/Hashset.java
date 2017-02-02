package bellinfo.assignemnt.hashmap;

//import java.awt.List;
//import java.awt.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hashset {

	public static void main(String[] args) {
		Phone p1=new Phone();
		Phone p2=new Phone();
		Phone p3=new Phone();
		Phone p4=new Phone();
		
		
		p1.setpName("Samsung");
		p1.setpOs("Android");
		p1.setpCost(6000);
		
		p2.setpName("Samsung");
		p2.setpOs("Android");
		p2.setpCost(7000);
		
		p3.setpName("Apple");
		p3.setpOs("iOS");
		p3.setpCost(5000);
		
		p4.setpName("Apple");
		p4.setpOs("iOS");
		p4.setpCost(5000);
		
		
		
		List<Phone> l1=new ArrayList<>();
		l1.add(p1);
		l1.add(p2);
		l1.add(p3);
		l1.add(p4);
		
		int b;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the cost to print the details:");
		b=scan.nextInt();
		 System.out.println(b);
		
		
		
			for(Phone p:l1){
				
				if(p.getpCost()==b){
				System.out.println(p.getpCost()+ "    " +p.getpName()+ "    "  +p.getpOs());
				}	
		}
		
		
		}
		
		
		

	}



class Phone{
	String pName;
	int pCost;
	String pOs;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpCost() {
		return pCost;
	}
	public void setpCost(int pCost) {
		this.pCost = pCost;
	}
	public String getpOs() {
		return pOs;
	}
	public void setpOs(String pOs) {
		this.pOs = pOs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pCost;
		result = prime * result + ((pName == null) ? 0 : pName.hashCode());
		result = prime * result + ((pOs == null) ? 0 : pOs.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "phone [pName=" + pName + ", pCost=" + pCost + ", pOs=" + pOs
				+ "]";
	}
	
}
