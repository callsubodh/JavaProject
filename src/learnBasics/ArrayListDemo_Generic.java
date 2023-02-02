package learnBasics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo_Generic {

	public static void main(String[] args) {

		List<String> arr = new ArrayList<String>();
		arr.add("234");
		arr.add("Subodh");
		arr.add("Mintu");
		arr.add("Tanuj");
		
		Iterator<String> itr = arr.iterator();
		
		while(itr.hasNext()) {
			
			String value = itr.next();
			System.out.println("Value of the Itr is: "+value);
		}
		
		for(String strarr: arr) {
			
			System.out.println("For value of the arraylist:"+ strarr);

		}
	}

}
