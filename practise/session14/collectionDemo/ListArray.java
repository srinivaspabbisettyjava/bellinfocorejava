package practise.session14.collectionDemo;

import java.util.ArrayList;
import java.util.HashSet;

public class ListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       ArrayList<Integer> al=new ArrayList<>();
		       
		       al.add(2);
		       al.add(8);
		       for(Integer number:al)
		       System.out.println(number );
		       
	}
	HashSet<Integer> hs=new HashSet<>();{
		hs.addall(al);
		System.out.println("inside hash");
		for(Integer number:hs){
			System.out.println(number);
		}
	}

}
