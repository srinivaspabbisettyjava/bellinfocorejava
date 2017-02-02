package practise.session15.maps;

import java.util.HashMap;
import java.util.Set;
import bellinfo.assignemnt.hashmap.*;
public class HashMapScenario {

	public static void main(String[] args) {
		HashSetDemo h = new HashSetDemo();

		//System.out.println(h);

		HashMap<String, String> hm=new HashMap<>();
		hm.put("a", h.pName());
		hm.put("b", "Apple");
		hm.put("c", "Pears");
		hm.put("d", "Banana");
		hm.put("e", "Watermelon");
		hm.put("f", "Orange");
		
		//Hashmap doesnot allow key values and null
		//HashMap allows duplicate values and null values
		//Hashmap is not synchronised ,if u want to synchronised use "Collections.synchronisedMap(hm);"

		//use concurrent map     ConcurentHashMap<Integer, String> chm=new ConcurrentHashMap<Integer,String>
		Set<String> set=hm.keySet();
		for(String i:set){
			System.out.println("Key " +i+  " value "  +hm.get(i));
		}
		

	}

}
