package learnBasics;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		//HashMap<String, String> hm = new HashMap<String, String>();
		Map<String, String> hm = new HashMap<String, String>();
		
		hm.put("100", "Subodh");
		hm.put("101", "Sierra");
		hm.put("102", "Tanuj");
		hm.put("103", "Mintu");
		
		System.out.println(hm);
		System.out.println(hm.get("101"));
		
		for(Map.Entry<String, String> data: hm.entrySet()) {
			
			System.out.println("Key from Map is: "+data.getKey()+" and value is: "+data.getValue());
		}
		
	}

}
